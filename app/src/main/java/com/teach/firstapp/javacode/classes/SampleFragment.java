package com.teach.firstapp.javacode.classes;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Михаил on 27.05.2015.
 */
public class SampleFragment extends Fragment {

    IProgress iProgress;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        iProgress = (IProgress)activity;
    }

    @Override
    public void onDetach() {
        iProgress = null;
        super.onDetach();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        iProgress.showProgress();
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
