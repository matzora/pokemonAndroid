package com.Entity;

import java.io.Serializable;

/**
 * Created by Mathieu on 18/06/2016.
 */
public class Trainer  implements Serializable {
    protected String name;
    protected Npc npc;

    private int pokemonNumber;
    private int pokemonMax = 5;
    PokemonTrainer[] pokemons = new PokemonTrainer[6];

    public Trainer(String name)
    {
        pokemonNumber = 0;
        this.name = name;
    }

    public void addPokemon(PokemonTrainer pkm)
    {
        if(pokemonNumber == 5)
        {
            return;
        }
        pokemons[pokemonNumber] = pkm;
        pokemonNumber ++;
    }

    public PokemonTrainer getNextPokemonTrainer()
    {
        for(int i = 0 ; i < pokemons.length ; i ++)
        {
            PokemonTrainer p = pokemons[i];

            if(p == null)
            {
                return null;
            }
            else
            {
                if(!p.isDead())
                {
                    return pokemons[i];
                }
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Npc getNpc() {
        return npc;
    }

    public void setNpc(Npc npc) {
        this.npc = npc;
    }

    public PokemonTrainer[] getPokemons() {
        return pokemons;
    }

    public void setPokemons(PokemonTrainer[] pokemons) {
        this.pokemons = pokemons;
    }
}
