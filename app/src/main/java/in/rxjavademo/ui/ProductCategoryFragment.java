package in.rxjavademo.ui;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.button.MaterialButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.rxjavademo.R;
import in.rxjavademo.model.cart.addtocart.AddProductToCart;
import in.rxjavademo.model.cart.cartadditionresponse.ProductAddedToCartResponse;
import in.rxjavademo.model.product.ProductsRespose;
import in.rxjavademo.model.productCategory.ProductCategoriesResponse;
import in.rxjavademo.network.NetworkInterface;
import in.rxjavademo.network.RetroFitClient;
import in.rxjavademo.ui.base.BaseFragment;
import in.rxjavademo.utils.dialog.ProgressDialog;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class ProductCategoryFragment extends BaseFragment {
    //View Elements
    private View view;

    @BindView(R.id.fProductCategoryTVResponse)
    TextView tvResponseText;

    @BindView(R.id.fProductCategoryMBTCategory)
    MaterialButton btGetCategories;

    @BindView(R.id.fProductCategoryMBTProducts)
    MaterialButton btGetProducts;

    @BindView(R.id.fProductCategoryAddProductToCart)
    MaterialButton btAddProductsToCart;

    //Objects
    private NetworkInterface networkInterface;
    private ProgressDialog progressDialog;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_product_category, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initModels();
        setupClickListener();
    }

    private void setupClickListener() {

        btGetCategories.setOnClickListener(view -> {
            getAllProductSubCategories();
        });

        btGetProducts.setOnClickListener(view1 -> {
            getProductsBySubCategoryId();
        });

        btAddProductsToCart.setOnClickListener(view -> {
            addProductsToCart();
        });
    }

    private void addProductsToCart() {
        progressDialog.show();
        AddProductToCart addProductToCart = new AddProductToCart(
                155,
                285,
                1,
                135,
                "Rishabh Kukkar",
                false
        );

        Observable<ProductAddedToCartResponse> productAddedToCartResponseObservable =
                networkInterface.addProductToCart(addProductToCart).
                        subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread());
        productAddedToCartResponseObservable.subscribe(new Observer<ProductAddedToCartResponse>() {
            @Override
            public void onSubscribe(@io.reactivex.annotations.NonNull Disposable d) {
                compositeDisposable.add(d);
            }

            @Override
            public void onNext(@io.reactivex.annotations.NonNull ProductAddedToCartResponse productAddedToCartResponse) {
                progressDialog.dismiss();
                tvResponseText.setText(productAddedToCartResponse.getProductAddedToCartData().toString());
            }

            @Override
            public void onError(@io.reactivex.annotations.NonNull Throwable e) {
                progressDialog.dismiss();
                showToast(getContext(), e.getLocalizedMessage());
            }

            @Override
            public void onComplete() {

            }
        });


    }

    private void getProductsBySubCategoryId() {
        progressDialog.show();
        Observable<ProductsRespose> productsResposeObservable =
                networkInterface.getProductsBySubCategoryId(94)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread());

        productsResposeObservable.subscribe(new Observer<ProductsRespose>() {
            @Override
            public void onSubscribe(@io.reactivex.annotations.NonNull Disposable d) {
                compositeDisposable.add(d);
            }

            @Override
            public void onNext(@io.reactivex.annotations.NonNull ProductsRespose productsRespose) {
                progressDialog.cancel();
                tvResponseText.setText(productsRespose.getData().toString());
            }

            @Override
            public void onError(@io.reactivex.annotations.NonNull Throwable e) {
                showToast(getContext(), e.getLocalizedMessage().trim());
                progressDialog.cancel();
            }

            @Override
            public void onComplete() {

            }
        });
    }

    private void getAllProductSubCategories() {
        progressDialog.show();
        Observable<ProductCategoriesResponse> productCategoriesResponseObservable =
                networkInterface.getAllProductCategories()
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread());
        productCategoriesResponseObservable.subscribe(new Observer<ProductCategoriesResponse>() {
            @Override
            public void onSubscribe(Disposable d) {
                compositeDisposable.add(d);
            }

            @Override
            public void onNext(ProductCategoriesResponse productCategoriesResponse) {
                progressDialog.cancel();
                tvResponseText.setText(productCategoriesResponse.getData().toString());
            }

            @Override
            public void onError(Throwable e) {
                showToast(getContext(), e.getLocalizedMessage().trim());
                progressDialog.cancel();
            }

            @Override
            public void onComplete() {

            }
        });
    }

    private void initModels() {
        //Network
        networkInterface = RetroFitClient.getRetrofitInstance().create(NetworkInterface.class);

        progressDialog = new ProgressDialog(getContext());
        progressDialog.setCancelable(false);

        tvResponseText.setMovementMethod(new ScrollingMovementMethod());
    }
}
