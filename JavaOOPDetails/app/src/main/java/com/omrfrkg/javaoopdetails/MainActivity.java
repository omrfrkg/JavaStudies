package com.omrfrkg.javaoopdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Kedi kedi = new Kedi();

        kedi.ad = "tekir";


        //Statik her yerden erişilebilir
        //Statik sadece sınıfın kendisiniden obje olmaksızın türetilebilir.
        kedi.konusKedi();

        Kedi.konusKediStatik();
    }
}