package in.rxjavademo.network;


import in.rxjavademo.model.cart.addtocart.AddProductToCart;
import in.rxjavademo.model.cart.cartadditionresponse.ProductAddedToCartResponse;
import in.rxjavademo.model.product.ProductsRespose;
import in.rxjavademo.model.productCategory.ProductCategoriesResponse;
import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface NetworkInterface {

    @GET("product-categories")
    Observable<ProductCategoriesResponse> getAllProductCategories();

    @GET("products/sub-category/{subCategoryId}")
    Observable<ProductsRespose> getProductsBySubCategoryId(@Path("subCategoryId") int subCategoryId);

    @POST("carts")
    Observable<ProductAddedToCartResponse> addProductToCart(@Body AddProductToCart addProductToCart);

}
