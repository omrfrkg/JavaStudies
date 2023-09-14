package com.omrfrkg.javaylabasithesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button topla;
    Button cikar;
    Button bol;
    Button carp;

    EditText sayi;
    EditText sayi2;

    TextView sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayi = findViewById(R.id.sayiText);
        sayi2 = findViewById(R.id.sayiText2);
        sonuc = findViewById(R.id.sonuc);


    }

    public void topla(View view){

        if (sayi.getText().toString().matches("") || sayi2.getText().toString().matches("")){
            sonuc.setText("Lütfen boş alan bırakmayınız!");
        }
        else {
            int topla = Integer.parseInt(sayi.getText().toString()) + Integer.parseInt(sayi2.getText().toString());
            sonuc.setText("Sonuç : " + topla);
        }
    }

    public void cikar(View view){


        if (sayi.getText().toString().matches("") || sayi2.getText().toString().matches("")){
            sonuc.setText("Lütfen boş alan bırakmayınız!");
        }
        else {
            int cikar = Integer.parseInt(sayi.getText().toString()) - Integer.parseInt(sayi2.getText().toString());
            sonuc.setText("Sonuç : " + cikar);
        }
    }

    public void carpma(View view){

        if (sayi.getText().toString().matches("") || sayi2.getText().toString().matches("")){
            sonuc.setText("Lütfen boş alan bırakmayınız!");
        }
        else {
            int carp = Integer.parseInt(sayi.getText().toString()) * Integer.parseInt(sayi2.getText().toString());
            sonuc.setText("Sonuç : " + carp);
        }
    }

    public void bolme(View view){

        if (sayi.getText().toString().matches("") || sayi2.getText().toString().matches("")){
            sonuc.setText("Boş Alan Bıraktınız!");
        }
        else{

            float bolme = Float.parseFloat(sayi.getText().toString()) / Float.parseFloat(sayi2.getText().toString());
            sonuc.setText("Sonuç : " + bolme);
        }
}

    public boolean textIsEmpty(){
        if (sayi.getText().toString().matches("") || sayi2.getText().toString().matches("")){
            return true;
        }
        else {
            return false;
        }
    }


}