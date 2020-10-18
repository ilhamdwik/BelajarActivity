package pens.lab.app.belajaractivity.modul.list;

import android.view.Menu;
import android.view.View;

import androidx.appcompat.widget.Toolbar;

import pens.lab.app.belajaractivity.R;
import pens.lab.app.belajaractivity.base.BaseFragmentHolderActivity;


public class ListActivity extends BaseFragmentHolderActivity {
    ListFragment listFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);


        listFragment = new ListFragment();
        setCurrentFragment(listFragment, false);
        //((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        //setHasOptionsMenu(true);

//        btUser.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                listToDoFragment.redirectToProfile();
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opsi, menu);
        return super.onCreateOptionsMenu(menu);
        //return true;
    }

    public Toolbar getToolbar() { return mToolbar; }
}
