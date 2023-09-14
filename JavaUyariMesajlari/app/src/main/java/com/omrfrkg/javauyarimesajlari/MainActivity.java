package com.omrfrkg.javauyarimesajlari;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Context

        //Activity Context

        //App Context
        //getApplicationContext()
    }

    public void kaydet(View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Kaydet");
        alert.setMessage("Emin Misiniz ?");
        alert.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Kaydedildi",Toast.LENGTH_LONG).show();
            }
        });
        alert.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Kayıt Edilmedi",Toast.LENGTH_LONG).show();
            }
        });
        alert.show();
    }
}