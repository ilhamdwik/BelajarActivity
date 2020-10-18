package pens.lab.app.belajaractivity.modul.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import pens.lab.app.belajaractivity.R;
import pens.lab.app.belajaractivity.base.BaseFragment;
import pens.lab.app.belajaractivity.modul.list.ListActivity;
import pens.lab.app.belajaractivity.modul.login.LoginActivity;


/**
 * Created by fahrul on 13/03/19.
 */

public class ProfileFragment extends BaseFragment<ProfileActivity, ProfileContract.Presenter> implements ProfileContract.View {

    TextView tvEmail;
    TextView tvPassword;
    Bundle profile;

    public ProfileFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.activity_profile, container, false);
        mPresenter = new ProfilePresenter(this);
        mPresenter.start();

        tvEmail = fragmentView.findViewById(R.id.tv_email);
        tvPassword = fragmentView.findViewById(R.id.tv_password);

        setTitle("Profile");
        showProfile();

        return fragmentView;
    }

    @Override
    public void setPresenter(ProfileContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void redirectToLogin() {
            Intent intent = new Intent(activity, LoginActivity.class);
            startActivity(intent);
            activity.finish();
    }

    @Override
    public void redirectToList() {
        Intent intent = new Intent(activity, ListActivity.class);
        intent.putExtras(profile);

        startActivity(intent);
        activity.finish();
    }

    @Override
    public void showProfile() {
        if(getActivity().getIntent().getExtras() != null){
            Bundle bundle = getActivity().getIntent().getExtras();
            tvEmail.setText(bundle.getString("email"));
            tvPassword.setText(bundle.getString("password"));
        }
    }
}
