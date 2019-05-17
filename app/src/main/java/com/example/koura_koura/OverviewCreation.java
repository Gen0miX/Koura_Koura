package com.example.koura_koura;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class OverviewCreation extends AppCompatActivity {


    private static final int HOME = 0 ;

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        menu.add(0, HOME, Menu.NONE, "Home")
                .setIcon(R.drawable.ic_home_white_24dp)
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        return true ;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId() == HOME){
            Intent home = new Intent(OverviewCreation.this, MainActivity.class);
            startActivity(home);
        }
        return true ;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.overview);

        ImageButton imageButton = findViewById(R.id.imageButton);
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        ImageButton imageButton3 = findViewById(R.id.imageButton4);
        ImageButton imageButton4 = findViewById(R.id.imageButton5);
        ImageButton imageButton5 = findViewById(R.id.imageButton6);
        ImageButton imageButton6 = findViewById(R.id.imageButton8);

        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent transformation = new Intent(OverviewCreation.this, CreationTriage.class);
                startActivity(transformation);
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent transformation = new Intent(OverviewCreation.this, CreationMalaxage.class);
                startActivity(transformation);
            }
        });

        imageButton5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent transformation = new Intent(OverviewCreation.this, CreationVapeur.class);
                startActivity(transformation);
            }
        });


    }

}