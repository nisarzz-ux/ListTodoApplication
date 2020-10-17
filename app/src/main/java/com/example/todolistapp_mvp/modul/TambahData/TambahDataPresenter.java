package com.example.todolistapp_mvp.modul.TambahData;

public class TambahDataPresenter implements TambahDataContract.Presenter{
    private final TambahDataContract.View view;

    public TambahDataPresenter(TambahDataContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

    @Override
    public void addNewTask(String description) {

    }
}
