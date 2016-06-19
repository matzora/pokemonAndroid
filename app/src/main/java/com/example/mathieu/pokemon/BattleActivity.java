package com.example.mathieu.pokemon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.Entity.PokemonTrainer;
import com.Entity.Trainer;
import com.Utils.BattleCalculator;

/**
 * Created by Mathieu on 19/06/2016.
 */
public class BattleActivity  extends AppCompatActivity {

    protected Trainer player;
    protected Trainer ennemy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);

        player = (Trainer)getIntent().getSerializableExtra("player");
        ennemy = (Trainer)getIntent().getSerializableExtra("ennemy");

        TextView ennemyName = (TextView)findViewById(R.id.ennemyPokemonNameText);
        TextView ennemyLevel = (TextView)findViewById(R.id.ennemyPokemonLevelText);
        ProgressBar ennemyLife = (ProgressBar)findViewById(R.id.ennemyPokemonLifeProgressBar);

        PokemonTrainer ennemyFirstPokemon = ennemy.getPokemons()[0];

        ennemyName.setText(ennemyFirstPokemon.getName());
        ennemyLevel.setText(ennemyFirstPokemon.getLevel());
        ennemyLife.setMax(BattleCalculator.getPVByLevel(ennemyFirstPokemon.getPv(),ennemyFirstPokemon.getLevel()));
        ennemyLife.setProgress(BattleCalculator.getPVByLevel(ennemyFirstPokemon.getPv(),ennemyFirstPokemon.getLevel()));

        TextView playerName = (TextView)findViewById(R.id.playerPokemonNameText);
        TextView playerLevel = (TextView)findViewById(R.id.playerPokemonLevelText);
        ProgressBar playerLife = (ProgressBar)findViewById(R.id.playerPokemonLifeProgressBar);

        PokemonTrainer playerFirstPokemon = ennemy.getPokemons()[0];

        playerName.setText(playerFirstPokemon.getName());
        playerLevel.setText(playerFirstPokemon.getLevel());
        playerLife.setMax(BattleCalculator.getPVByLevel(playerFirstPokemon.getPv(),playerFirstPokemon.getLevel()));
        playerLife.setProgress(BattleCalculator.getPVByLevel(playerFirstPokemon.getPv(),playerFirstPokemon.getLevel()));
    }

    protected void setPlayer(Trainer t)
    {
        player = t;
    }

    protected void setEnnemy(Trainer t)
    {
        ennemy = t;
    }
}
