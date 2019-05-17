package com.example.koura_koura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button qualityButton = findViewById(R.id.qualityButton);
        Button transformationButton = findViewById(R.id.transformationButton);

        qualityButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent quality = new Intent(MainActivity.this, Maladie.class);
                startActivity(quality);
            }
        });

        transformationButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent transformation = new Intent(MainActivity.this, OverviewCreation.class);
                startActivity(transformation);
            }
        });





    }
}
