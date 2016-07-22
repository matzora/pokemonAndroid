package com.Core;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.Entity.Area;
import com.Entity.Attack;
import com.Entity.Pokemon;
import com.Entity.PokemonTrainer;
import com.Entity.Trainer;
import com.Entity.Type;
import com.Utils.AreaBuilder;
//import com.Utils.AttackBuilder;
//import com.Utils.PokemonBuilder;
import com.Utils.TrainerBuilder;
//import com.Utils.TypeMatrix;
import com.example.mathieu.pokemon.StartPage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Mathieu on 18/06/2016.
 */
public class PokemonCore {
    private static PokemonCore ourInstance = null;

    protected Trainer player;

    protected ArrayList<Pokemon> pokemons;
    protected ArrayList<Type> types;
    protected ArrayList<Attack> attacks;

    protected ArrayList<Area> areas;
    protected ArrayList<Trainer> trainers;

    //protected TypeMatrix typeMatrix;

    public APIConnector apiConnector;

    public static PokemonCore getInstance()
    {
        if(ourInstance == null)
        {
            ourInstance = new PokemonCore();
        }
        return ourInstance;
    }

    private PokemonCore()
    {
        pokemons = new ArrayList<Pokemon>();
        types = new ArrayList<Type>();
        attacks = new ArrayList<Attack>();

        apiConnector = new APIConnector(this);
    }

    public boolean areInitialRequestEnded()
    {
        boolean result = !pokemons.isEmpty() && !types.isEmpty() && !attacks.isEmpty();
        return result;
    }

    public void openStartPage(Context _context)
    {
        Intent i = new Intent(_context, StartPage.class);
        _context.startActivity(i);
    }

//    public TypeMatrix getTypeMatrix() {
//        return typeMatrix;
//    }
//
//    public void setTypeMatrix(TypeMatrix typeMatrix) {
//        this.typeMatrix = typeMatrix;
//    }

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

    public Trainer getPlayer() {
        return player;
    }

    public void setPlayer(Trainer player) {
        this.player = player;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

}
