package com.example.koura_koura;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class CreationVapeur extends AppCompatActivity {


    private static final int HOME = 0 ;

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        menu.add(0, HOME, Menu.NONE, "Home")
                .setIcon(R.drawable.ic_home_white_24dp)
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        return true ;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation_vapeur);
/*
        ImageButton next = findViewById(R.id.imageButton7);
        ImageButton back = findViewById(R.id.imageButton10);

        imageButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent quality = new Intent(CreationVapeur.this, Maladie.class);
                startActivity(quality);
            }
        });
*/



    }

}