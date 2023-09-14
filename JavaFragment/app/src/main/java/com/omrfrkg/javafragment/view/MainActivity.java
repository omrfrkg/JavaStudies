package com.omrfrkg.javafragment.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.omrfrkg.javafragment.R;
import com.omrfrkg.javafragment.fragment.FirstFragment;
import com.omrfrkg.javafragment.fragment.SecondFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToFirstFragment(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FirstFragment fragment = new FirstFragment();
        fragmentTransaction.replace(R.id.frameLayout,fragment).commit();
    }

    public void goToSecondFragment(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        SecondFragment secondFragment = new SecondFragment();
        fragmentTransaction.replace(R.id.frameLayout,secondFragment).commit();
    }
}