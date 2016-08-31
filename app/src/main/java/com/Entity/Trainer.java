package com.Entity;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Mathieu on 18/06/2016.
 */
public class Trainer  implements Serializable {
    protected String name;
    protected Npc npc;

    private int pokemonNumber;
    private int pokemonMax = 5;
    ArrayList<PokemonTrainer> pokemons;

    public Trainer(String name)
    {
        pokemons = new ArrayList<PokemonTrainer>();
        pokemonNumber = 0;
        this.name = name;
    }

    public PokemonTrainer getNextPokemonTrainer()
    {
        for(int i = 0 ; i < pokemons.size() ; i ++)
        {
            PokemonTrainer p = pokemons.get(i);

            if(p == null)
            {
                return null;
            }
            else
            {
                if(!p.isDead())
                {
                    return pokemons.get(i);
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

    public ArrayList<PokemonTrainer> getPokemons() {
        return pokemons;
    }

    public void setPokemons(ArrayList<PokemonTrainer> pokemons) {
        this.pokemons = pokemons;
    }
}
