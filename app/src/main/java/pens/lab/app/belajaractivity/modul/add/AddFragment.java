package pens.lab.app.belajaractivity.modul.add;

import android.view.Menu;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.view.ViewGroup;
import android.view.MenuInflater;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;

import pens.lab.app.belajaractivity.R;
import pens.lab.app.belajaractivity.base.BaseFragment;
import pens.lab.app.belajaractivity.modul.list.ListActivity;
;

//import com.hakim.belajaractivity.FirstActivity;


/**
 * Created by fahrul on 13/03/19.
 */

public class AddFragment extends BaseFragment<AddActivity, AddContract.Presenter> implements AddContract.View {

    Bundle profile;

    public AddFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_add, container, false);
        Toolbar toolbar = ((AddActivity) getActivity()).getToolbar();
        //((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        setHasOptionsMenu(true);
        mPresenter = new AddPresenter(this);
        mPresenter.start();

        profile = getActivity().getIntent().getExtras();

        setTitle("App ToDoList");

        return fragmentView;
    }

    @Override
    public void setPresenter(AddContract.Presenter presenter) {
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
    public void redirectToLists() {
        Bundle bundle = new Bundle();
        Intent intent = new Intent(activity, ListActivity.class);
        intent.putExtras(profile);

        startActivity(intent);
        activity.finish();
    }
}
