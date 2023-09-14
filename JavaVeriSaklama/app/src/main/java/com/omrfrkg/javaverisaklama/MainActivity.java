package com.omrfrkg.javaverisaklama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText yas;
    TextView yasGoster;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yas = findViewById(R.id.yasText);
        yasGoster = findViewById(R.id.yasView);

        sharedPreferences = getSharedPreferences("com.omrfrkg.javaverisaklama", Context.MODE_PRIVATE);
        int kYas = sharedPreferences.getInt("kaydedilenYas",0);

        if (kYas == 0){
            yasGoster.setText("Yaşınız : ");
        }
        else {
            yasGoster.setText("Yaşınız : "+kYas);
        }
    }

    public void yasKaydet(View view){
        if (!yas.getText().toString().matches("")){
            int yasiniz = Integer.parseInt(yas.getText().toString());
            yasGoster.setText("Yaşınız : "+yasiniz);
            sharedPreferences.edit().putInt("kaydedilenYas",yasiniz).apply();
        }
    }

    public void yasSil(View view){
        int yasiniz = sharedPreferences.getInt("kaydedilenYas",0);

        if (yasiniz != 0){
            sharedPreferences.edit().remove("kaydedilenYas");
            yasGoster.setText("Yaşınız : ");
        }
        else{
            yasGoster.setText("Yaşınız : ");
        }
    }
}