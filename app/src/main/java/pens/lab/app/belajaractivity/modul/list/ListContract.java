package pens.lab.app.belajaractivity.modul.list;

import pens.lab.app.belajaractivity.base.BaseView;
import pens.lab.app.belajaractivity.base.BasePresenter;

import pens.lab.app.belajaractivity.base.BaseView;

/**
 * Created by fahrul on 13/03/19.
 */

public interface ListContract {
    interface View extends BaseView<Presenter> {
        void redirectToProfile();
        void redirectToForm();
//        void showProfile();
    }

    interface Presenter extends BasePresenter {
        void performLogout();
    }
}
