package com.omrfrkg.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.omrfrkg.landmarkbookjava.databinding.ActivityDetailsBinding;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Intent intent = getIntent();

        //Casting
        //Landmark landmark = (Landmark) intent.getSerializableExtra("landmark");


        Singleton singleton = Singleton.getInstance();
        Landmark landmark = singleton.getSentLandmark();

        binding.textName.setText(landmark.name);
        binding.textCountry.setText(landmark.country);
        binding.textDetails.setText(landmark.details);
        binding.imageView.setImageResource(landmark.pic);
    }
}