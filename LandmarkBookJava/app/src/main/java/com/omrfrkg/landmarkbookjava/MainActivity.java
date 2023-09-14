package com.omrfrkg.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.omrfrkg.landmarkbookjava.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Data

        Landmark pisa = new Landmark("Pisa","Italy","The tower began to lean during construction in the 12th century, due to soft ground which could not properly support the structure's weight. It worsened through the completion of construction in the 14th century. By 1990, the tilt had reached 5.5 degrees. The structure was stabilized by remedial work between 1993 and 2001, which reduced the tilt to 3.97 degrees.",R.drawable.pisa);
        Landmark eiffel = new Landmark("Eiffel","France","Locally nicknamed \"La dame de fer\" (French for \"Iron Lady\"), it was constructed from 1887 to 1889 as the centerpiece of the 1889 World's Fair. Although initially criticised by some of France's leading artists and intellectuals for its design, it has since become a global cultural icon of France and one of the most recognisable structures in the world.",R.drawable.eiffel);
        Landmark londonBridge = new Landmark("London Brigde","UK","Several bridges named London Bridge have spanned the River Thames between the City of London and Southwark, in central London. It is the oldest road-crossing location on the river. The current crossing, which opened to traffic in 1973, is a box girder bridge built from concrete and steel.",R.drawable.londonbrigde);
        Landmark colosseum = new Landmark("Colesseum","Italy","Several bridges named London Bridge have spanned the River Thames between the City of London and Southwark, in central London. It is the oldest road-crossing location on the river. The current crossing, which opened to traffic in 1973, is a box girder bridge built from concrete and steel.",R.drawable.colossuem);

        ArrayList<Landmark> landmarkList = new ArrayList<Landmark>();

        landmarkList.add(pisa);
        landmarkList.add(eiffel);
        landmarkList.add(londonBridge);
        landmarkList.add(colosseum);

        /*
        //ListView

        //Adapter
        //Mapping

        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                landmarkList.stream().map(landmark -> landmark.name).collect(Collectors.toList()));

        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("landmark",landmarkList.get(i));
                startActivity(intent);
            }
        });
        */

        //Recycler View
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkList);
        binding.recyclerView.setAdapter(landmarkAdapter);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}