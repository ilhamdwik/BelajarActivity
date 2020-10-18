package pens.lab.app.belajaractivity.modul.add;

import android.view.Menu;
import android.view.View;

import androidx.appcompat.widget.Toolbar;

import pens.lab.app.belajaractivity.R;
import pens.lab.app.belajaractivity.base.BaseFragmentHolderActivity;


public class AddActivity extends BaseFragmentHolderActivity {
    AddFragment addFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.VISIBLE);
//        btUser.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);


        addFragment = new AddFragment();
        setCurrentFragment(addFragment, false);
        //((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        //setHasOptionsMenu(true);

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFragment.redirectToLists();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opsi, menu);
        return super.onCreateOptionsMenu(menu);
        //return true;
    }

    public Toolbar getToolbar() { return mToolbar; }
}
