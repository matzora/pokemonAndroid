package com.example.mathieu.pokemon.Activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.Adapter.PokemonListElementAdapter;
import com.Core.PokemonCore;
import com.Entity.Pokemon;
import com.example.mathieu.pokemon.R;
import com.microsoft.azure.engagement.EngagementAgent;
import com.microsoft.azure.engagement.EngagementConfiguration;
import com.microsoft.azure.engagement.activity.EngagementActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StartPageActivity  extends EngagementActivity {


    ListView mListView;

    PokemonListElementAdapter adapter;

    private ArrayList<Integer> pokemonSelected;
    private final int MAX_SELECTED_POKEMON = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        EngagementConfiguration engagementConfiguration = new EngagementConfiguration();
        engagementConfiguration.setConnectionString("Endpoint=PokemonBattle2.device.mobileengagement.windows.net;SdkKey=0f760e444aefbaf2b537f6740da8affe;AppId=nep000151");
        EngagementAgent.getInstance(this).init(engagementConfiguration);

        pokemonSelected = new ArrayList<Integer>();

        mListView = (ListView) findViewById(R.id.listView);

        PokemonCore.getInstance().initializePlayer();

        adapter = new PokemonListElementAdapter(StartPageActivity.this, PokemonCore.getInstance().getPlayer().getPokemons());
        mListView.setAdapter(adapter);

        Button btn = (Button) findViewById(R.id.btnFindPartner);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PokemonCore.getInstance().initializeEnnemy();

                Intent i = new Intent(StartPageActivity.this, BattleActivity.class);
                StartPageActivity.this.startActivity(i);
            }
        });
    }

    @Override
    public void onBackPressed() {
        // Do nothing
        return;
    }
}