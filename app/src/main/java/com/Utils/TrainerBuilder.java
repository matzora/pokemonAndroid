package com.Utils;

import com.Entity.Attack;
import com.Entity.Pokemon;
import com.Entity.PokemonTrainer;
import com.Entity.Trainer;

import java.util.ArrayList;

/**
 * Created by Mathieu on 18/06/2016.
 */
public class TrainerBuilder {

    public static Trainer getPlayerTrainer(ArrayList<Pokemon> pokemons, ArrayList<Attack> attacks)
    {
        Trainer trainer = new Trainer("Player");

        trainer.addPokemon(new PokemonTrainer(pokemons.get(136),100, attacks.get(85), attacks.get(120), attacks.get(141), null));
        trainer.addPokemon(new PokemonTrainer(pokemons.get(143),100, attacks.get(97), attacks.get(88), attacks.get(70), null));

        return null;
    }

    public static ArrayList<Trainer> getTrainerList(ArrayList<Pokemon> pokemons, ArrayList<Attack> attacks)
    {
        ArrayList<Trainer> trainers = new ArrayList<Trainer>();

        Trainer chen = new Trainer("Professeur Chen");
        //Craboss 99
        //Mr Mime 122
        chen.addPokemon(new PokemonTrainer(pokemons.get(99),100, attacks.get(160), attacks.get(88), attacks.get(97), attacks.get(40)));
        chen.addPokemon(new PokemonTrainer(pokemons.get(122),100, attacks.get(23), attacks.get(142), null, null));

        Trainer giovanni = new Trainer("Champion Giovanni");
        //Rhinoferos 112
        //Persian 53
        //Sablaireau 28
        //Nidoking 34
        //Kangourex 115
        giovanni.addPokemon(new PokemonTrainer(pokemons.get(112),100, attacks.get(40), attacks.get(37), null, null));
        giovanni.addPokemon(new PokemonTrainer(pokemons.get(53),100, attacks.get(50), attacks.get(120), attacks.get(79), null));
        //giovanni.addPokemon(new PokemonTrainer(pokemons.get(28),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //giovanni.addPokemon(new PokemonTrainer(pokemons.get(34),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //giovanni.addPokemon(new PokemonTrainer(pokemons.get(115),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));

        Trainer samourai = new Trainer("Jeune Samouraï");
        //Scarabrute 127
        //Papilusion 12
        //Dardargnan 15
        //Parasect 47
        samourai.addPokemon(new PokemonTrainer(pokemons.get(127),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        samourai.addPokemon(new PokemonTrainer(pokemons.get(12),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        samourai.addPokemon(new PokemonTrainer(pokemons.get(15),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        samourai.addPokemon(new PokemonTrainer(pokemons.get(47),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));

        Trainer pierre = new Trainer("Champion Pierre");
        //Onix 95
        //Grolem 76
        //Amonistar 139
        pierre.addPokemon(new PokemonTrainer(pokemons.get(95),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        pierre.addPokemon(new PokemonTrainer(pokemons.get(76),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        pierre.addPokemon(new PokemonTrainer(pokemons.get(139),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));

        Trainer chercheur = new Trainer("Chercheur");
        //Grotadmorv 89
        //Magneton 82
        //Feunard 38
        chercheur.addPokemon(new PokemonTrainer(pokemons.get(89),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        chercheur.addPokemon(new PokemonTrainer(pokemons.get(82),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        chercheur.addPokemon(new PokemonTrainer(pokemons.get(38),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));

        Trainer ondine = new Trainer("Champion Ondine");
        //Staross 121
        //Poisoroy 119
        //Aquali 134
        ondine.addPokemon(new PokemonTrainer(pokemons.get(121),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        ondine.addPokemon(new PokemonTrainer(pokemons.get(119),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        ondine.addPokemon(new PokemonTrainer(pokemons.get(134),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));

        Trainer major = new Trainer("Champion Major Bob");
        //Raichu 26
        //Electrode 101
        //Elektek 125
        major.addPokemon(new PokemonTrainer(pokemons.get(26),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        major.addPokemon(new PokemonTrainer(pokemons.get(101),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        major.addPokemon(new PokemonTrainer(pokemons.get(125),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));

        Trainer tunnelMan = new Trainer("L'expert en tunnels");
        //Triopikeur 51
        //Triopikeur 51
        //Triopikeur 51
        tunnelMan.addPokemon(new PokemonTrainer(pokemons.get(51),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        tunnelMan.addPokemon(new PokemonTrainer(pokemons.get(51),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        tunnelMan.addPokemon(new PokemonTrainer(pokemons.get(51),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));

        Trainer grotte = new Trainer("Le collectionneur");
        //Flagadoss 80
        //Noadkoko 103
        grotte.addPokemon(new PokemonTrainer(pokemons.get(80),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        grotte.addPokemon(new PokemonTrainer(pokemons.get(103),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));

        Trainer lavanville = new Trainer("Amateur de fantomes");
        //Ectoplasma 94
        //Ectoplasma 94
        lavanville.addPokemon(new PokemonTrainer(pokemons.get(94),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        lavanville.addPokemon(new PokemonTrainer(pokemons.get(94),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));

        Trainer erica = new Trainer("Champion Erica");
        //Empiflor 71
        //Raflesia 45
        //Florizarre 3
        erica.addPokemon(new PokemonTrainer(pokemons.get(71),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        erica.addPokemon(new PokemonTrainer(pokemons.get(45),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        erica.addPokemon(new PokemonTrainer(pokemons.get(3),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));

        Trainer koga = new Trainer("Champion Koga");
        //Grotadmorv 89
        //Smogogo 110
        //Arbok 24
        koga.addPokemon(new PokemonTrainer(pokemons.get(89),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        koga.addPokemon(new PokemonTrainer(pokemons.get(110),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        koga.addPokemon(new PokemonTrainer(pokemons.get(24),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));

        Trainer morgane = new Trainer("Champion Morgane");
        //Alakazam 65
        //Hypnomade 97
        //Noadkoko 103
        morgane.addPokemon(new PokemonTrainer(pokemons.get(65),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        morgane.addPokemon(new PokemonTrainer(pokemons.get(97),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        morgane.addPokemon(new PokemonTrainer(pokemons.get(103),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));

        Trainer ecumes = new Trainer("Champion Erica");
        //Lamantine 87
        //Crustabri 91
        ecumes.addPokemon(new PokemonTrainer(pokemons.get(87),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        ecumes.addPokemon(new PokemonTrainer(pokemons.get(91),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));

        Trainer routeVictoire = new Trainer("Regis");
        //Tortank 9
        //Voltali 135
        //Roucarnage 18
        routeVictoire.addPokemon(new PokemonTrainer(pokemons.get(9),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        routeVictoire.addPokemon(new PokemonTrainer(pokemons.get(135),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        routeVictoire.addPokemon(new PokemonTrainer(pokemons.get(18),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));

        Trainer plateauIndigo = new Trainer("Peter le seigneur dragon");
        //Dracolosse 149
        //Ptera 142
        //Dracaufeu 6
        plateauIndigo.addPokemon(new PokemonTrainer(pokemons.get(149),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        plateauIndigo.addPokemon(new PokemonTrainer(pokemons.get(142),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        plateauIndigo.addPokemon(new PokemonTrainer(pokemons.get(6),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));

        return trainers;
    }
}
