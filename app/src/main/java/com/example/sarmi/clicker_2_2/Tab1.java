package com.example.sarmi.clicker_2_2;

/**
 * Created by sarmi on 19.03.2016.
 */


        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

/**
 * Created by hp1 on 21-01-2015.
 */
public class Tab1 extends Fragment {


    private int mCoockie=0;



    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.tab_1,container,false);
        return v;
    }

}