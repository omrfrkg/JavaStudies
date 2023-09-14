package com.omrfrkg.javabirdenfazlaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextText);


    }

    public void aktiviteDegis(View view){
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("name",name.getText().toString());
        startActivity(intent);
    }
}