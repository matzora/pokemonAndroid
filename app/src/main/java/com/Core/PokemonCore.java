package com.Core;

import com.Entity.Area;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mathieu on 18/06/2016.
 */
public class PokemonCore {
    private static PokemonCore ourInstance = null;

    protected ArrayList<Area> areas;

    public static PokemonCore getInstance() {

        if(ourInstance == null)
        {
            ourInstance = new PokemonCore();
        }
        return ourInstance;
    }

    private PokemonCore() {

        areas = new ArrayList<Area>();

        //Instanciate Areas
        areas.add(new Area("Bourg Palette","bourgpalette"));
        areas.add(new Area("Jadielle","jadielle"));
        areas.add(new Area("Foret De Jade","foretdejade"));
        areas.add(new Area("Argenta","argenta"));
        areas.add(new Area("Mont Selenite","montselenite"));
        areas.add(new Area("Azuria","azuria"));
        areas.add(new Area("Carmin Sur Mer","carminsurmer"));
        areas.add(new Area("Cave Taupiqueur","cavetaupiqueur"));
        areas.add(new Area("La Grotte","lagrotte"));
        areas.add(new Area("Lavanville","lavanville"));
        areas.add(new Area("Celadopole","celadopole"));
        areas.add(new Area("Parmanie","parmanie"));
        areas.add(new Area("Safrania","safrania"));
        areas.add(new Area("Iles Ecumes","ilesecumes"));
        areas.add(new Area("Cramois Ile","cramoisile"));
        areas.add(new Area("Route Victoire","routevictoire"));
        areas.add(new Area("Plateau Indigo","plateauindigo"));
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
