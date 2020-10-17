package com.example.todolistapp_mvp.modul.TambahData;

import com.example.todolistapp_mvp.base.BasePresenter;
import com.example.todolistapp_mvp.base.BaseView;

public interface TambahDataContract {
    interface View extends BaseView<Presenter> {
        void redirectToHome();
    }

    interface Presenter extends BasePresenter {
        void addNewTask(String description);
    }
}
