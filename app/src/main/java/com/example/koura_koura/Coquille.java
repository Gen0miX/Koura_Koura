package com.example.koura_koura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Coquille extends AppCompatActivity {

    private static final int HOME = 0 ;
    public int score ;

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
            Intent home = new Intent(Coquille.this, MainActivity.class);
            startActivity(home);
        }
        return true ;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coquille);

        score = getIntent().getIntExtra("score", 0);

        ImageButton cross = findViewById(R.id.crossButton2);
        ImageButton ok = findViewById(R.id.correctButton2);

        cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score--;
                if(score >= 10){
                    Intent rapportOk = new Intent(Coquille.this, RapportOk.class);
                    startActivity(rapportOk);
                }else{
                    Intent rapportDanger = new Intent(Coquille.this, RapportDanger.class);
                    startActivity(rapportDanger);
                }
            }
        });

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                if(score >= 10){
                    Intent rapportOk = new Intent(Coquille.this, RapportOk.class);
                    startActivity(rapportOk);
                }else{
                    Intent rapportDanger = new Intent(Coquille.this, RapportDanger.class);
                    startActivity(rapportDanger);
                }
            }
        });

    }
}
