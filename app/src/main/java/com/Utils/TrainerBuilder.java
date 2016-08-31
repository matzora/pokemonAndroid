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

        //trainer.addPokemon(new PokemonTrainer(pokemons.get(135),100, attacks.get(83), attacks.get(118), attacks.get(139), null));
        //trainer.addPokemon(new PokemonTrainer(pokemons.get(142),100, attacks.get(95), attacks.get(86), attacks.get(68), null));

        return trainer;
    }

    public static ArrayList<Trainer> getTrainerList(ArrayList<Pokemon> pokemons, ArrayList<Attack> attacks)
    {
        ArrayList<Trainer> trainers = new ArrayList<Trainer>();

        Trainer chen = new Trainer("Professeur Chen");
        //Craboss 99
        //Mr Mime 122
        //chen.addPokemon(new PokemonTrainer(pokemons.get(98),100, attacks.get(159), attacks.get(87), attacks.get(96), attacks.get(39)));
        //chen.addPokemon(new PokemonTrainer(pokemons.get(121),100, attacks.get(22), attacks.get(141), null, null));
//
        //trainers.add(chen);
//
        //Trainer giovanni = new Trainer("Champion Giovanni");
        ////Rhinoferos 112
        ////Persian 53
        ////Sablaireau 28
        ////Nidoking 34
        ////Kangourex 115
        //giovanni.addPokemon(new PokemonTrainer(pokemons.get(111),100, attacks.get(40), attacks.get(37), null, null));
        //giovanni.addPokemon(new PokemonTrainer(pokemons.get(52),100, attacks.get(50), attacks.get(120), attacks.get(79), null));
        ////giovanni.addPokemon(new PokemonTrainer(pokemons.get(28),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        ////giovanni.addPokemon(new PokemonTrainer(pokemons.get(34),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        ////giovanni.addPokemon(new PokemonTrainer(pokemons.get(115),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
//
        //trainers.add(giovanni);
//
        //Trainer samourai = new Trainer("Jeune Samouraï");
        ////Scarabrute 127
        ////Papilusion 12
        ////Dardargnan 15
        ////Parasect 47
        //samourai.addPokemon(new PokemonTrainer(pokemons.get(126),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //samourai.addPokemon(new PokemonTrainer(pokemons.get(11),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //samourai.addPokemon(new PokemonTrainer(pokemons.get(14),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //samourai.addPokemon(new PokemonTrainer(pokemons.get(46),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
//
        //trainers.add(samourai);
//
        //Trainer pierre = new Trainer("Champion Pierre");
        ////Onix 95
        ////Grolem 76
        ////Amonistar 139
        //pierre.addPokemon(new PokemonTrainer(pokemons.get(94),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //pierre.addPokemon(new PokemonTrainer(pokemons.get(75),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //pierre.addPokemon(new PokemonTrainer(pokemons.get(138),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
//
        //trainers.add(pierre);
//
        //Trainer chercheur = new Trainer("Chercheur");
        ////Grotadmorv 89
        ////Magneton 82
        ////Feunard 38
        //chercheur.addPokemon(new PokemonTrainer(pokemons.get(88),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //chercheur.addPokemon(new PokemonTrainer(pokemons.get(81),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //chercheur.addPokemon(new PokemonTrainer(pokemons.get(37),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
//
        //trainers.add(chercheur);
//
        //Trainer ondine = new Trainer("Champion Ondine");
        ////Staross 121
        ////Poisoroy 119
        ////Aquali 134
        //ondine.addPokemon(new PokemonTrainer(pokemons.get(120),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //ondine.addPokemon(new PokemonTrainer(pokemons.get(118),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //ondine.addPokemon(new PokemonTrainer(pokemons.get(133),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
//
        //trainers.add(ondine);
//
        //Trainer major = new Trainer("Champion Major Bob");
        ////Raichu 26
        ////Electrode 101
        ////Elektek 125
        //major.addPokemon(new PokemonTrainer(pokemons.get(25),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //major.addPokemon(new PokemonTrainer(pokemons.get(100),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //major.addPokemon(new PokemonTrainer(pokemons.get(124),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
//
        //trainers.add(major);
//
        //Trainer tunnelMan = new Trainer("L'expert en tunnels");
        ////Triopikeur 51
        ////Triopikeur 51
        ////Triopikeur 51
        //tunnelMan.addPokemon(new PokemonTrainer(pokemons.get(50),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //tunnelMan.addPokemon(new PokemonTrainer(pokemons.get(50),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //tunnelMan.addPokemon(new PokemonTrainer(pokemons.get(50),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
//
        //trainers.add(tunnelMan);
//
        //Trainer grotte = new Trainer("Le collectionneur");
        ////Flagadoss 80
        ////Noadkoko 103
        //grotte.addPokemon(new PokemonTrainer(pokemons.get(79),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //grotte.addPokemon(new PokemonTrainer(pokemons.get(102),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
//
        //trainers.add(grotte);
//
        //Trainer lavanville = new Trainer("Amateur de fantomes");
        ////Ectoplasma 94
        ////Ectoplasma 94
        //lavanville.addPokemon(new PokemonTrainer(pokemons.get(93),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //lavanville.addPokemon(new PokemonTrainer(pokemons.get(93),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
//
        //trainers.add(lavanville);
//
        //Trainer erica = new Trainer("Champion Erica");
        ////Empiflor 71
        ////Raflesia 45
        ////Florizarre 3
        //erica.addPokemon(new PokemonTrainer(pokemons.get(70),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //erica.addPokemon(new PokemonTrainer(pokemons.get(44),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //erica.addPokemon(new PokemonTrainer(pokemons.get(2),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
//
        //trainers.add(erica);
//
        //Trainer koga = new Trainer("Champion Koga");
        ////Grotadmorv 89
        ////Smogogo 110
        ////Arbok 24
        //koga.addPokemon(new PokemonTrainer(pokemons.get(88),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //koga.addPokemon(new PokemonTrainer(pokemons.get(109),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //koga.addPokemon(new PokemonTrainer(pokemons.get(23),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
//
        //trainers.add(koga);
//
        //Trainer morgane = new Trainer("Champion Morgane");
        ////Alakazam 65
        ////Hypnomade 97
        ////Noadkoko 103
        //morgane.addPokemon(new PokemonTrainer(pokemons.get(64),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //morgane.addPokemon(new PokemonTrainer(pokemons.get(96),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //morgane.addPokemon(new PokemonTrainer(pokemons.get(102),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
//
        //trainers.add(morgane);
//
        //Trainer ecumes = new Trainer("Adorateur du gel");
        ////Lamantine 87
        ////Crustabri 91
        //ecumes.addPokemon(new PokemonTrainer(pokemons.get(86),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //ecumes.addPokemon(new PokemonTrainer(pokemons.get(90),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
//
        //trainers.add(ecumes);
//
        //Trainer auguste = new Trainer("Champion Auguste");
        ////Arcanin 59
        ////Galopa 78
        //ecumes.addPokemon(new PokemonTrainer(pokemons.get(58),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //ecumes.addPokemon(new PokemonTrainer(pokemons.get(77),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
//
        //trainers.add(ecumes);
//
        //Trainer routeVictoire = new Trainer("Regis");
        ////Tortank 9
        ////Voltali 135
        ////Roucarnage 18
        //routeVictoire.addPokemon(new PokemonTrainer(pokemons.get(8),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //routeVictoire.addPokemon(new PokemonTrainer(pokemons.get(134),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //routeVictoire.addPokemon(new PokemonTrainer(pokemons.get(17),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
//
        //trainers.add(routeVictoire);
//
        //Trainer plateauIndigo = new Trainer("Peter le seigneur dragon");
        ////Dracolosse 149
        ////Ptera 142
        ////Dracaufeu 6
        //plateauIndigo.addPokemon(new PokemonTrainer(pokemons.get(148),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //plateauIndigo.addPokemon(new PokemonTrainer(pokemons.get(141),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
        //plateauIndigo.addPokemon(new PokemonTrainer(pokemons.get(5),100, attacks.get(0), attacks.get(0), attacks.get(0), attacks.get(0)));
//
        //trainers.add(plateauIndigo);
//
        return trainers;
    }
}
