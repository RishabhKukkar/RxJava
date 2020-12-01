package in.rxjavademo.ui.base;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import io.reactivex.disposables.CompositeDisposable;

import static in.rxjavademo.utils.ConstantUtils.ADD_FRAGMENT;
import static in.rxjavademo.utils.ConstantUtils.REPLACE_FRAGMENT;

public class BaseFragment extends Fragment {
    //Objects
    public CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public void changeFragment(FragmentManager fragmentManager, int container, Fragment fragment,
                               int action, boolean addToBackStack, String TAG) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (action == ADD_FRAGMENT)
            fragmentTransaction.add(container, fragment);
        else if (action == REPLACE_FRAGMENT) {
            fragmentTransaction.replace(container, fragment);
        } else
            return;
        if (addToBackStack)
            fragmentTransaction.addToBackStack(TAG);
        fragmentTransaction.commit();
    }
}