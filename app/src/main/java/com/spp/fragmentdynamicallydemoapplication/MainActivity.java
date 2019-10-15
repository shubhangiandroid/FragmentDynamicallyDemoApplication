package com.spp.fragmentdynamicallydemoapplication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayoutContainer;
    Fragment3 fragment3;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         fragmentManager = getSupportFragmentManager();
         fragmentTransaction=fragmentManager.beginTransaction();
        fragment3=new Fragment3();
        frameLayoutContainer=(FrameLayout)findViewById(R.id.container);
    }

    public void addFragmentonclick(View view) {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        Fragment1 fragment1=new Fragment1();
        fragmentTransaction.add(R.id.container,fragment1);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

    public void OnaddFragmentClick(View view) {
//        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        Fragment2 fragment2=new Fragment2();
        fragmentTransaction.add(R.id.container,fragment2);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }



    public void OnAddFragmentClick(View view) {
//        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
       // Fragment3 fragment3=new Fragment3();
        fragmentTransaction.add(R.id.container,fragment3);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void OnRemoveFragmentClick(View view) {
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        Fragment3 fragment3=new Fragment3();
        fragmentTransaction.add(R.id.container,fragment3);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}

