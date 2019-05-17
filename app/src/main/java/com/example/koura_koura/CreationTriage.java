package com.example.koura_koura;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class CreationTriage extends AppCompatActivity {


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
        setContentView(R.layout.activity_creation_triage);
/*
        ImageButton back = findViewById(R.id.imageButtonM1);
        ImageButton next = findViewById(R.id.imageButtonM2);

        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(CreationMalaxage.this, MainActivity.class);
                startActivity(intent);
            }
        });

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(CreationMalaxage.this, MainActivity.class);
                startActivity(intent);
            }
        });

*/


    }

}