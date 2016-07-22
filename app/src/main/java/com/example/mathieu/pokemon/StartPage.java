package com.example.mathieu.pokemon;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.Core.PokemonCore;
import com.Entity.Trainer;
import com.android.volley.RequestQueue;

public class StartPage extends AppCompatActivity {

    public static String PACKAGE_NAME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        PACKAGE_NAME = getApplicationContext().getPackageName();

        Button btn = (Button)findViewById(R.id.openSoloModeBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StartPage.this, ScreenSlidePagerActivity.class);
                startActivity(i);
            }
        });

        Button btn2 = (Button)findViewById(R.id.openMultiplayerBtn);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i = new Intent(StartPage.this, ScreenSlidePagerActivity.class);
                //startActivity(i);
            }
        });
    }
}

