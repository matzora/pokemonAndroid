package com.example.mathieu.pokemon;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.Core.PokemonCore;
import com.Entity.Attack;
import com.Entity.PokemonTrainer;
import com.Entity.Trainer;
import com.Utils.BattleCalculator;

import java.util.Random;

/**
 * Created by Mathieu on 19/06/2016.
 */
public class BattleActivity  extends AppCompatActivity {

    protected Trainer player;
    protected Trainer ennemy;

    protected PokemonTrainer playerActivePokemon;
    protected PokemonTrainer ennemyActivePokemon;

    protected PokemonBattleFragment ennemyPokemonFragment;
    protected PokemonBattleFragment playerPokemonFragment;

    private final String TEXT_FAIL = "Echec Critique";
    private final String TEXT_POKEMON_DEAD = "Est KO";
    private final String TEXT_WIN = "Vous avez gagné !";
    private final String TEXT_LOSE = "Vous avez perdu !";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);

        player = (Trainer)getIntent().getSerializableExtra("player");
        ennemy = (Trainer)getIntent().getSerializableExtra("ennemy");

        FragmentManager fragmentManager = getSupportFragmentManager();
        this.ennemyPokemonFragment = (PokemonBattleFragment) fragmentManager.findFragmentById(R.id.ennemyPokemon);
        this.playerPokemonFragment = (PokemonBattleFragment) fragmentManager.findFragmentById(R.id.playerPokemon);

        playerActivePokemon = player.getNextPokemonTrainer();
        ennemyActivePokemon = ennemy.getNextPokemonTrainer();

        this.ennemyPokemonFragment.setPokemonTrainer(ennemyActivePokemon);
        this.playerPokemonFragment.setPokemonTrainer(playerActivePokemon);

        Button attack1 = (Button)findViewById(R.id.attack1Btn);
        if(player.getPokemons()[0].getAttack1() == null)
        {
            attack1.setEnabled(false);
        }
        else
        {
            attack1.setText(player.getPokemons()[0].getAttack1().getName());
        }

        attack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BattleActivity.this.battle(BattleActivity.this.getPlayerActivePokemon().getAttack1());
            }
        });

        Button attack2 = (Button)findViewById(R.id.attack2Btn);
        if(player.getPokemons()[0].getAttack2() == null)
        {
            attack2.setEnabled(false);
        }
        else
        {
            attack2.setText(player.getPokemons()[0].getAttack2().getName());
        }
        attack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BattleActivity.this.battle(BattleActivity.this.getPlayerActivePokemon().getAttack2());
            }
        });

        Button attack3 = (Button)findViewById(R.id.attack3Btn);
        if(player.getPokemons()[0].getAttack3() == null)
        {
            attack3.setEnabled(false);
        }
        else
        {
            attack3.setText(player.getPokemons()[0].getAttack3().getName());
        }
        attack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BattleActivity.this.battle(BattleActivity.this.getPlayerActivePokemon().getAttack3());
            }
        });

        Button attack4 = (Button)findViewById(R.id.attack4Btn);
        if(player.getPokemons()[0].getAttack4() == null)
        {
            attack4.setEnabled(false);
        }
        else
        {
            attack4.setText(player.getPokemons()[0].getAttack4().getName());
        }
        attack4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BattleActivity.this.battle(BattleActivity.this.getPlayerActivePokemon().getAttack4());
            }
        });
    }

    public void battle(Attack playerAttack)
    {

    }

    public void OnAttack(Attack attack, PokemonTrainer attacker, PokemonTrainer defensor)
    {
//        double multiplicator = PokemonCore.getInstance().getTypeMatrix().getMultiplier(
//                attack.getType(),ennemyActivePokemon.getType());

        double multiplicator = 1;

        int attackStat;
        int defStat;

        if(attack.isPhysical())
        {
            attackStat = playerActivePokemon.getBattleAtk();
            defStat = ennemyActivePokemon.getBattleDef();
        }
        else
        {
            attackStat = playerActivePokemon.getBattleAtk_Spe();
            defStat = ennemyActivePokemon.getBattleDef_Spe();
        }

        int damageDealsToEnnemy = BattleCalculator.getDamageDeals(attackStat,defStat,playerActivePokemon.getLevel(),attack.getDamage(),multiplicator);

        String messageToDisplay = BattleCalculator.getMessageAttackFromMultiplicator(multiplicator);

        boolean isSucceedAttack = BattleCalculator.isSucceedAttack(attack.getAccuracy(),1,1);

        TextView console = (TextView)findViewById(R.id.BattleConsole);

        if(isSucceedAttack)
        {
            ennemyActivePokemon.losePv(damageDealsToEnnemy);
            console.setText(messageToDisplay + " : "+damageDealsToEnnemy);
        }
        else
        {
            console.setText(TEXT_FAIL);
        }
        ennemyPokemonFragment.updatePokemon();

        if(ennemyActivePokemon.isDead())
        {
            console.setText(ennemyActivePokemon.getName()+" "+TEXT_POKEMON_DEAD);

            PokemonTrainer p = ennemy.getNextPokemonTrainer();

            if(p == null)
            {
                console.setText(TEXT_WIN);
                LinearLayout le = (LinearLayout)findViewById(R.id.battleLayout);
                le.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
            }
            else
            {
                ennemyActivePokemon = ennemy.getNextPokemonTrainer();
                ennemyPokemonFragment.setPokemonTrainer(ennemyActivePokemon);
            }
        }
    }

    public Attack getRandomAttackFromNpcTrainer()
    {
        Attack attack = null;
        while(attack == null)
        {
            Random r = new Random();
            int i1 = r.nextInt(3 - 0) + 0;
            attack = ennemyActivePokemon.getAttack(i1);
        }

//        double multiplicator = PokemonCore.getInstance().getTypeMatrix().getMultiplier(
//                attack.getType(),playerActivePokemon.getType());

        double multiplicator = 1;

        int attackStat;
        int defStat;

        if(attack.isPhysical())
        {
            attackStat = ennemyActivePokemon.getBattleAtk();
            defStat = playerActivePokemon.getBattleDef();
        }
        else
        {
            attackStat = ennemyActivePokemon.getBattleAtk_Spe();
            defStat = playerActivePokemon.getBattleDef_Spe();
        }

        return null;
    }

    @Override
    public void onBackPressed() {

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
}
