package com.example.koura_koura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class RapportOk extends AppCompatActivity {

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
            Intent home = new Intent(RapportOk.this, MainActivity.class);
            startActivity(home);
        }
        return true ;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rapport_ok);
    }
}
