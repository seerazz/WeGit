package com.quinn.githubknife.ui.main;

import android.os.Bundle;

import com.quinn.githubknife.utils.L;

/**
 * Created by Quinn on 7/15/15.
 */
public class OwnRepoFragment extends BaseFragment{
    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        L.i("onCreate OwnRepoFragment");

    }



    @Override
    public void onResume(){
        super.onResume();

        L.i("onResume OwnRepoFragment");

    }
}
