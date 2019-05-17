package com.example.koura_koura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Maladie extends AppCompatActivity {

    private static final int HOME = 0 ;

    private static int score ;

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
            Intent home = new Intent(Maladie.this, MainActivity.class);
            startActivity(home);
        }
        return true ;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maladie);

        score = getIntent().getIntExtra("score", 10);

        ImageButton cross = findViewById(R.id.crossButton);
        ImageButton ok = findViewById(R.id.correctButton);

        cross.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent shell = new Intent(Maladie.this, Coquille.class);
                score -- ;
                shell.putExtra("score", score);
                startActivity(shell);
            }
        });

        ok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent shell = new Intent(Maladie.this, Coquille.class);
                score++;
                shell.putExtra("score", score);
                startActivity(shell);
            }
        });


    }
}
