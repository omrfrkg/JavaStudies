package com.omrfrkg.javacountdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView sure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sure = findViewById(R.id.sureSonuc);


        new CountDownTimer(10000,1000){

            @Override
            public void onTick(long zaman) {

                sure.setText("Kalan Süre : "+zaman/1000);

            }

            @Override
            public void onFinish() {

                sure.setText("Geri Sayım Bitti");

                Toast.makeText(getApplicationContext(),"Süre Doldu!",Toast.LENGTH_LONG).show();

            }
        }.start();
    }
}