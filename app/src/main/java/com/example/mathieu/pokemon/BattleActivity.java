package com.example.mathieu.pokemon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.Core.PokemonCore;
import com.Entity.Attack;
import com.Entity.PokemonTrainer;
import com.Entity.Trainer;
import com.Utils.BattleCalculator;

/**
 * Created by Mathieu on 19/06/2016.
 */
public class BattleActivity  extends AppCompatActivity {

    protected Trainer player;
    protected Trainer ennemy;

    protected PokemonTrainer playerActivePokemon;
    protected PokemonTrainer ennemyActivePokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);

        this.setTitle("");

        player = (Trainer)getIntent().getSerializableExtra("player");
        ennemy = (Trainer)getIntent().getSerializableExtra("ennemy");

        ImageView ennemyPkmImage = (ImageView)findViewById(R.id.ennemyPkmImage);
        TextView ennemyName = (TextView)findViewById(R.id.ennemyPokemonNameText);
        TextView ennemyLevel = (TextView)findViewById(R.id.ennemyPokemonLevelText);
        TextView ennemyActualLife = (TextView)findViewById(R.id.ennemyPokemonActualLifeText);
        TextView ennemyMaxLife = (TextView)findViewById(R.id.ennemyPokemonMaxLifeText);

        ennemyActivePokemon = ennemy.getPokemons()[0];

        String uriEnnemy = "@drawable/p"+ ennemyActivePokemon.getId();
        int imageResourceEnnemy = getResources().getIdentifier(uriEnnemy, "drawable", StartPage.PACKAGE_NAME);
        ennemyPkmImage.setImageResource(imageResourceEnnemy);

        ennemyName.setText(ennemyActivePokemon.getName());
        ennemyLevel.setText(""+ennemyActivePokemon.getLevel());

        int ennemyActualPV = BattleCalculator.getPVByLevel(ennemyActivePokemon.getPv(),ennemyActivePokemon.getLevel());
        ennemyActualLife.setText(""+ennemyActualPV);
        ennemyMaxLife.setText(""+ennemyActualPV);

        ImageView playerPkmImage = (ImageView)findViewById(R.id.playerPokemonImage);
        TextView playerName = (TextView)findViewById(R.id.playerPokemonNameText);
        TextView playerLevel = (TextView)findViewById(R.id.playerPokemonLevelText);
        TextView playerActualLife = (TextView)findViewById(R.id.playerPokemonActualLifeText);
        TextView playerMaxLife = (TextView)findViewById(R.id.playerPokemonMaxLifeText);

        playerActivePokemon = player.getPokemons()[0];

        String uriPlayer = "@drawable/p"+ playerActivePokemon.getId();
        int imageResource = getResources().getIdentifier(uriPlayer, "drawable", StartPage.PACKAGE_NAME);
        playerPkmImage.setImageResource(imageResource);

        playerName.setText(playerActivePokemon.getName());
        playerLevel.setText(""+playerActivePokemon.getLevel());

        int playerPokemonLife = BattleCalculator.getPVByLevel(playerActivePokemon.getPv(),playerActivePokemon.getLevel());
        playerActualLife.setText(""+playerPokemonLife);
        playerMaxLife.setText(""+playerPokemonLife);

        Button attack1 = (Button)findViewById(R.id.attack1Btn);
        if(playerActivePokemon.getAttack1() == null)
        {
            attack1.setEnabled(false);
        }
        else
        {
            attack1.setText(playerActivePokemon.getAttack1().getName());
        }

        attack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BattleActivity.this.OnAttack(BattleActivity.this.getPlayerActivePokemon().getAttack1());
            }
        });

        Button attack2 = (Button)findViewById(R.id.attack2Btn);
        if(playerActivePokemon.getAttack2() == null)
        {
            attack2.setEnabled(false);
        }
        else
        {
            attack2.setText(playerActivePokemon.getAttack2().getName());
        }
        attack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BattleActivity.this.OnAttack(BattleActivity.this.getPlayerActivePokemon().getAttack2());
            }
        });

        Button attack3 = (Button)findViewById(R.id.attack3Btn);
        if(playerActivePokemon.getAttack3() == null)
        {
            attack3.setEnabled(false);
        }
        else
        {
            attack3.setText(playerActivePokemon.getAttack3().getName());
        }
        attack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BattleActivity.this.OnAttack(BattleActivity.this.getPlayerActivePokemon().getAttack3());
            }
        });

        Button attack4 = (Button)findViewById(R.id.attack4Btn);
        if(playerActivePokemon.getAttack4() == null)
        {
            attack4.setEnabled(false);
        }
        else
        {
            attack4.setText(playerActivePokemon.getAttack4().getName());
        }
        attack4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BattleActivity.this.OnAttack(BattleActivity.this.getPlayerActivePokemon().getAttack4());
            }
        });
    }

    protected void setPlayer(Trainer t)
    {
        player = t;
    }

    protected void setEnnemy(Trainer t)
    {
        ennemy = t;
    }

    public PokemonTrainer getPlayerActivePokemon() {
        return playerActivePokemon;
    }

    public void setPlayerActivePokemon(PokemonTrainer playerActivePokemon) {
        this.playerActivePokemon = playerActivePokemon;
    }

    public PokemonTrainer getEnnemyActivePokemon() {
        return ennemyActivePokemon;
    }

    public void setEnnemyActivePokemon(PokemonTrainer ennemyActivePokemon) {
        this.ennemyActivePokemon = ennemyActivePokemon;
    }

    public void OnAttack(Attack attack)
    {

    }

    @Override
    public void onBackPressed() {

    }


}
