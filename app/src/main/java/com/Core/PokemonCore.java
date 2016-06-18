package com.Core;

import com.Entity.Area;
import com.Entity.Attack;
import com.Entity.Pokemon;
import com.Entity.Trainer;
import com.Utils.AreaBuilder;
import com.Utils.AttackBuilder;
import com.Utils.PokemonBuilder;
import com.Utils.TrainerBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mathieu on 18/06/2016.
 */
public class PokemonCore {
    private static PokemonCore ourInstance = null;

    protected Trainer player;

    protected ArrayList<Pokemon> pokemons;
    protected ArrayList<Area> areas;
    protected ArrayList<Attack> attacks;

    public static PokemonCore getInstance() {

        if(ourInstance == null)
        {
            ourInstance = new PokemonCore();
        }
        return ourInstance;
    }

    private PokemonCore() {

        pokemons = PokemonBuilder.getPokemonList();
        attacks = AttackBuilder.getAttackList();
        player = TrainerBuilder.getPlayerTrainer(pokemons, attacks);
        ArrayList<Trainer> trainers = TrainerBuilder.getTrainerList(pokemons, attacks);

        areas = AreaBuilder.getAreaList(trainers);
    }

    public void setList(ArrayList<Area> areas)
    {
        this.areas = areas;
    }

    public Area getAreaByPosition(int i)
    {
        return areas.get(i);
    }

    public int getAreaCount()
    {
        return areas.size();
    }
}
