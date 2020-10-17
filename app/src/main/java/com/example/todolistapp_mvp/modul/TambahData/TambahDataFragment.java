package com.example.todolistapp_mvp.modul.TambahData;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.example.todolistapp_mvp.R;
import com.example.todolistapp_mvp.base.BaseFragment;
import com.example.todolistapp_mvp.modul.home.HomeActivity;


public class TambahDataFragment extends BaseFragment<TambahDataActivity, TambahDataContract.Presenter> implements TambahDataContract.View {

    EditText etNewTask;
    Button btAdd;
    String newTask;


    public TambahDataFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_new_task, container, false);
        mPresenter = new TambahDataPresenter(this);
        mPresenter.start();

//        etNewTask = fragmentView.findViewById(R.id.etNewTask);
//        btAdd = fragmentView.findViewById(R.id.btAdd);
//        btAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                setBtLoginClick();
//            }
//        });

        setTitle("Tambah List");

        return fragmentView;
    }

    public void setBtLoginClick(){

    }

    @Override
    public void setPresenter(TambahDataContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void redirectToHome() {
        Intent intent = new Intent(activity, HomeActivity.class);
        startActivity(intent);
        activity.finish();
    }
}
