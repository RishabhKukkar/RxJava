package in.rxjavademo.ui;

import android.os.Bundle;

import in.rxjavademo.R;
import in.rxjavademo.ui.base.BaseApp;

import static in.rxjavademo.utils.ConstantUtils.ADD_FRAGMENT;

public class MainActivity extends BaseApp {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeFragment(getSupportFragmentManager(),
                R.id.flMain,
                new ProductCategoryFragment(),
                ADD_FRAGMENT,
                false,
                null
        );
    }
}
