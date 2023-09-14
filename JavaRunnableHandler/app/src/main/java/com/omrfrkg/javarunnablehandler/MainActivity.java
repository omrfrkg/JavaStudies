package com.omrfrkg.javarunnablehandler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView sure;
    Handler handler;
    Runnable runnable;
    Button baslaB;
    Button durdurB;

    int sayac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sure = findViewById(R.id.sure);
        baslaB = findViewById(R.id.baslaButton);
        durdurB = findViewById(R.id.durdurButton);
        sayac = 0;
    }

    public void basla(View view){
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {

                sure.setText("Süre : "+sayac);
                sayac++;
                sure.setText("Süre : "+sayac);
                handler.postDelayed(runnable,1000);
            }
        };
        handler.post(runnable);
        baslaB.setEnabled(false);
        durdurB.setEnabled(true);
    }

    public void durdur(View view){

        baslaB.setEnabled(true);
        durdurB.setEnabled(false);

        handler.removeCallbacks(runnable);
        sayac = 0;
        sure.setText("Süre : ");



    }
}