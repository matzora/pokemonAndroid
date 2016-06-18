package com.Entity;

/**
 * Created by Mathieu on 18/06/2016.
 */
public class Trainer {
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

    public void AddPokemon(PokemonTrainer pkm)
    {
        if(pokemonNumber == 5)
        {
            return;
        }
        pokemons[pokemonNumber] = pkm;
        pokemonNumber ++;
    }
}
