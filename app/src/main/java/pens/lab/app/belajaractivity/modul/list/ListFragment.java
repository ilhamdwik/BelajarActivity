package pens.lab.app.belajaractivity.modul.list;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;

import pens.lab.app.belajaractivity.R;
import pens.lab.app.belajaractivity.base.BaseFragment;
import pens.lab.app.belajaractivity.modul.add.AddActivity;
import pens.lab.app.belajaractivity.modul.profile.ProfileActivity;

//import com.hakim.belajaractivity.FirstActivity;


/**
 * Created by fahrul on 13/03/19.
 */

public class ListFragment extends BaseFragment<ListActivity, ListContract.Presenter> implements ListContract.View {

    Bundle profile;
    Button btAddNew;

    public ListFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_add, container, false);
        Toolbar toolbar = ((ListActivity) getActivity()).getToolbar();
        //((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        setHasOptionsMenu(true);
        mPresenter = new ListPresenter(this);
        mPresenter.start();
        btAddNew = fragmentView.findViewById(R.id.bt_addNew);

        profile = getActivity().getIntent().getExtras();

        setTitle("To-Do List");

        btAddNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectToForm();
            }
        });

        return fragmentView;
    }

    @Override
    public void setPresenter(ListContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        //getActivity().getMenuInflater().inflate(R.menu.menu_ops1, menu);
        menu.clear();
        inflater.inflate(R.menu.menu_opsi, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    public void redirectToForm() {
        Intent intent = new Intent(activity, AddActivity.class);
        intent.putExtras(profile);

        startActivity(intent);
        activity.finish();
    }

    @Override
    public void redirectToProfile() {
        Bundle bundle = new Bundle();
        Intent intent = new Intent(activity, ProfileActivity.class);
        intent.putExtras(profile);

        startActivity(intent);
        activity.finish();
    }

}
