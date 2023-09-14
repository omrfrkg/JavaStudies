package com.omrfrkg.methodlarvesiniflar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("on Created");

        newMethod();
        System.out.println(newMethodInt(5,6));
        System.out.println(newMethodString("ömer"));

        Araba araba1 = new Araba("Bmw",2018,"Mavi");

        araba1.setSeriNumarasi(5);

        /*
        araba1.marka = "Bmw";
        araba1.model = 2018;
        araba1.renk = "Mavi";*/

        System.out.println(araba1.marka+" "+araba1.getSeriNumarasi());
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on Resume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on Stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on Pause");
    }

    public int newMethodInt(int a,int b){
        int sonuc = a + b;
        return sonuc;
    }

    public String newMethodString(String a){
        String word = a + "Kelimesi Girildi.";
        return word;
    }
    public void newMethod(){
        int sonuc = 4+4;
        System.out.println(sonuc);
    }
}