package com.Core;

import android.content.Context;
import android.content.Intent;

import com.Entity.Area;
import com.Entity.Attack;
import com.Entity.Multiplicator;
import com.Entity.Pokemon;
import com.Entity.PokemonTrainer;
import com.Entity.Trainer;
import com.Entity.Type;
//import com.Utils.AttackBuilder;
//import com.Utils.PokemonBuilder;
//import com.Utils.TypeMatrix;
import com.Entity.TypeMatrix;
import com.example.mathieu.pokemon.Activity.StartPageActivity;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Mathieu on 18/06/2016.
 */
public class PokemonCore {
    private static PokemonCore ourInstance = null;

    protected Trainer player;
    protected Trainer ennemy;

    protected ArrayList<Pokemon> pokemons;
    protected ArrayList<Type> types;
    protected ArrayList<Attack> attacks;
    protected ArrayList<TypeMatrix> typeMatrix;
    protected ArrayList<Multiplicator> mutltiplicator;

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
        typeMatrix = new ArrayList<TypeMatrix>();
        mutltiplicator = new ArrayList<Multiplicator>();

        apiConnector = new APIConnector(this);
    }

    public Type getTypeById(int id)
    {
        return types.get(id);
    }

    public ArrayList<Type> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<Type> types) {
        this.types = types;
    }

    public void initializePlayer()
    {
        ArrayList<PokemonTrainer> team = new ArrayList<PokemonTrainer>();

        Random r = new Random();

        while(team.size() < 6)
        {
            int i1 = r.nextInt(pokemons.size() - 1);

            Pokemon pkm = pokemons.get(i1);

            ArrayList<Attack> pkmAttacks = new ArrayList<Attack>();

            while(pkmAttacks.size() < 4)
            {
                int i2 = r.nextInt(attacks.size() - 1);
                if(attacks.get(i2).getPower() == 0)
                {
                    continue;
                }
                pkmAttacks.add(attacks.get(i2));
            }

            PokemonTrainer pkmTrainer = new PokemonTrainer(pkm,100,pkmAttacks);
            team.add(pkmTrainer);
        }

        player = new Trainer("Player");
        player.setPokemons(team);
    }

    public void initializeEnnemy()
    {
        ArrayList<PokemonTrainer> team = new ArrayList<PokemonTrainer>();

        Random r = new Random();

        while(team.size() < 6)
        {
            int i1 = r.nextInt(pokemons.size() - 1);

            Pokemon pkm = pokemons.get(i1);

            ArrayList<Attack> pkmAttacks = new ArrayList<Attack>();

            while(pkmAttacks.size() < 4)
            {
                int i2 = r.nextInt(attacks.size() - 1);
                if(attacks.get(i2).getPower() == 0)
                {
                    continue;
                }
                pkmAttacks.add(attacks.get(i2));
            }

            PokemonTrainer pkmTrainer = new PokemonTrainer(pkm,100,pkmAttacks);
            team.add(pkmTrainer);
        }

        ennemy = new Trainer("Player");
        ennemy.setPokemons(team);
    }

    public synchronized boolean areInitialRequestEnded()
    {
        boolean result = !pokemons.isEmpty() && !types.isEmpty() && !attacks.isEmpty() && !mutltiplicator.isEmpty() && !typeMatrix.isEmpty();



        return result;
    }

    public void openStartPage(Context _context)
    {
        Intent i = new Intent(_context, StartPageActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        _context.startActivity(i);
    }

    public ArrayList<TypeMatrix> getTypeMatrix() {
        return typeMatrix;
    }

    public void setTypeMatrix(ArrayList<TypeMatrix> typeMatrix) {
        this.typeMatrix = typeMatrix;
    }

    public void addTypeMatrix(TypeMatrix t)
    {
        typeMatrix.add(t);
    }

    public void addMultiplicator(Multiplicator m)
    {
        mutltiplicator.add(m);
    }

    public void addAttack(Attack a)
    {
        attacks.add(a);
    }

    public void addType(Type t)
    {
        types.add(t);
    }

    public void addPokemon(Pokemon p)
    {
        pokemons.add(p);
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

    public Trainer getEnnemy() {
        return ennemy;
    }

    public void setEnnemy(Trainer ennemy) {
        this.ennemy = ennemy;
    }
}
