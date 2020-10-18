package pens.lab.app.belajaractivity.modul.list;

/**
 * Created by fahrul on 13/03/19.
 */

public class ListPresenter implements ListContract.Presenter{
    private final ListContract.View view;



    public ListPresenter(ListContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

    @Override
    public void performLogout(){
        //proses login
        //if login success call redirect to profile
        //view.redirectToLogin();
    }

}
