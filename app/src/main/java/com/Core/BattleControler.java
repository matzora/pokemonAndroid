package com.Core;

import com.Entity.PokemonTrainer;
import com.Entity.Trainer;
import com.example.mathieu.pokemon.Fragment.PokemonBattleFragment;

/**
 * Created by Mathieu on 22/06/2016.
 */
public class BattleControler {

    protected Trainer player;
    protected Trainer ennemy;

    protected PokemonTrainer playerActivePokemon;
    protected PokemonTrainer ennemyActivePokemon;

    protected PokemonBattleFragment ennemyPokemonFragment;
    protected PokemonBattleFragment playerPokemonFragment;

    public void Battle()
    {
        if(playerActivePokemon.getBattleVit() > ennemyActivePokemon.getBattleVit())
        {

        }
    }

    public void AttackActivePokemon()
    {

    }
}
