package com.example.mathieu.pokemon.Activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.Core.PokemonCore;
import com.Entity.Attack;
import com.Entity.Multiplicator;
import com.Entity.Pokemon;
import com.Entity.PokemonTrainer;
import com.Entity.Trainer;
import com.Utils.BattleCalculator;
import com.example.mathieu.pokemon.Fragment.PokemonBattleFragment;
import com.example.mathieu.pokemon.R;

import java.util.Random;

/**
 * Created by Mathieu on 19/06/2016.
 */
public class BattleActivity  extends AppCompatActivity {

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

        FragmentManager fragmentManager = getSupportFragmentManager();
        this.ennemyPokemonFragment = (PokemonBattleFragment) fragmentManager.findFragmentById(R.id.ennemyPokemon);
        this.playerPokemonFragment = (PokemonBattleFragment) fragmentManager.findFragmentById(R.id.playerPokemon);

        playerActivePokemon = PokemonCore.getInstance().getPlayer().getNextPokemonTrainer();
        ennemyActivePokemon = PokemonCore.getInstance().getEnnemy().getNextPokemonTrainer();

        this.ennemyPokemonFragment.setPokemonTrainer(ennemyActivePokemon);
        this.playerPokemonFragment.setPokemonTrainer(playerActivePokemon);

        Button attack1 = (Button)findViewById(R.id.attack1Btn);
        if(playerActivePokemon.getAttack(0) == null)
        {
            attack1.setEnabled(false);
        }
        else
        {
            attack1.setText(playerActivePokemon.getAttack(0).getName());
        }

        attack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BattleActivity.this.battle(playerActivePokemon.getAttack(0));
            }
        });

        Button attack2 = (Button)findViewById(R.id.attack2Btn);
        if(playerActivePokemon.getAttack(1) == null)
        {
            attack2.setEnabled(false);
        }
        else
        {
            attack2.setText(playerActivePokemon.getAttack(1).getName());
        }
        attack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BattleActivity.this.battle(playerActivePokemon.getAttack(1));
            }
        });

        Button attack3 = (Button)findViewById(R.id.attack3Btn);
        if(playerActivePokemon.getAttack(2) == null)
        {
            attack3.setEnabled(false);
        }
        else
        {
            attack3.setText(playerActivePokemon.getAttack(2).getName());
        }
        attack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BattleActivity.this.battle(playerActivePokemon.getAttack(2));
            }
        });

        Button attack4 = (Button)findViewById(R.id.attack4Btn);
        if(playerActivePokemon.getAttack(3) == null)
        {
            attack4.setEnabled(false);
        }
        else
        {
            attack4.setText(playerActivePokemon.getAttack(3).getName());
        }
        attack4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BattleActivity.this.battle(playerActivePokemon.getAttack(3));
            }
        });
    }

    public void battle(Attack playerAttack)
    {
        OnAttack(playerAttack, PokemonCore.getInstance().getPlayer().getNextPokemonTrainer(),
                PokemonCore.getInstance().getEnnemy().getNextPokemonTrainer());
    }

    public void OnAttack(Attack attack, PokemonTrainer attacker, PokemonTrainer defensor)
    {
        Multiplicator multiplicator = BattleCalculator.getAttackMultiplicator(attack,defensor);

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

        int damageDealsToEnnemy = BattleCalculator.getDamageDeals(
                attackStat,
                defStat,
                playerActivePokemon.getLevel(),
                attack.getPower(),
                multiplicator.getFactor());



        String messageToDisplay = multiplicator.getText();

        boolean isSucceedAttack = BattleCalculator.isSucceedAttack(attack.getAccuracy(),1,1);

        TextView console = (TextView)findViewById(R.id.BattleConsole);

        if(isSucceedAttack)
        {
            ennemyActivePokemon.losePv(damageDealsToEnnemy);
            StringBuilder text  = new StringBuilder();
            if(!messageToDisplay.isEmpty())
            {
                text.append(messageToDisplay+ " ");
            }
            else
            {
                text.append("Votre Pokemon inflige : ");

            }
            text.append(damageDealsToEnnemy + " PV");
            console.setText(text.toString());
        }
        else
        {
            console.setText(TEXT_FAIL);
        }
        ennemyPokemonFragment.updatePokemon();

        if(ennemyActivePokemon.isDead())
        {
            console.setText(console.getText() +" "+ ennemyActivePokemon.getName()+" "+TEXT_POKEMON_DEAD);

            PokemonTrainer p = PokemonCore.getInstance().getEnnemy().getNextPokemonTrainer();

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
                ennemyActivePokemon = PokemonCore.getInstance().getEnnemy().getNextPokemonTrainer();
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

    public PokemonTrainer getPlayerActivePokemon() {
        return playerActivePokemon;
    }

    public void setPlayerActivePokemon(PokemonTrainer playerActivePokemon) {
        this.playerActivePokemon = playerActivePokemon;
    }
}
