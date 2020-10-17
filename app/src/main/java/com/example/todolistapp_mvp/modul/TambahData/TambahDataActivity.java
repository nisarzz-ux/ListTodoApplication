package com.example.todolistapp_mvp.modul.TambahData;

import android.view.View;

import com.example.todolistapp_mvp.base.BaseFragmentHolderActivity;


public class TambahDataActivity extends BaseFragmentHolderActivity {
    TambahDataFragment tambahDataFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
        ivIcon.setVisibility(View.VISIBLE);

        tambahDataFragment = new TambahDataFragment();
        setCurrentFragment(tambahDataFragment, true);

    }

}
