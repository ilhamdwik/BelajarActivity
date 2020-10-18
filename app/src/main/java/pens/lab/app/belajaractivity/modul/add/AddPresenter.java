package pens.lab.app.belajaractivity.modul.add;

/**
 * Created by fahrul on 13/03/19.
 */

public class AddPresenter implements AddContract.Presenter{
    private final AddContract.View view;



    public AddPresenter(AddContract.View view) {
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
