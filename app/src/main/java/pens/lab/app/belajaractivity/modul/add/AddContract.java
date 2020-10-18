package pens.lab.app.belajaractivity.modul.add;

import pens.lab.app.belajaractivity.base.BaseView;
import pens.lab.app.belajaractivity.base.BasePresenter;

import pens.lab.app.belajaractivity.base.BaseView;

/**
 * Created by fahrul on 13/03/19.
 */

public interface AddContract {
    interface View extends BaseView<Presenter> {
        void redirectToLists();
//        void showProfile();
    }

    interface Presenter extends BasePresenter {
        void performLogout();
    }
}
