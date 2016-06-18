package com.Utils;

import com.Entity.Area;
import com.Entity.Trainer;

import java.util.ArrayList;

/**
 * Created by Mathieu on 18/06/2016.
 */
public class AreaBuilder {

    public static ArrayList<Area> getAreaList(ArrayList<Trainer> trainers)
    {
        ArrayList<Area> areas = new ArrayList<Area>();

        //Instanciate Areas
        areas.add(new Area("Bourg Palette","bourgpalette",trainers.get(0)));
        areas.add(new Area("Jadielle","jadielle",trainers.get(1)));
        areas.add(new Area("Foret De Jade","foretdejade",trainers.get(2)));
        areas.add(new Area("Argenta","argenta",trainers.get(3)));
        areas.add(new Area("Mont Selenite","montselenite",trainers.get(4)));
        areas.add(new Area("Azuria","azuria",trainers.get(5)));
        areas.add(new Area("Carmin Sur Mer","carminsurmer",trainers.get(6)));
        areas.add(new Area("Cave Taupiqueur","cavetaupiqueur",trainers.get(7)));
        areas.add(new Area("La Grotte","lagrotte",trainers.get(8)));
        areas.add(new Area("Lavanville","lavanville",trainers.get(9)));
        areas.add(new Area("Celadopole","celadopole",trainers.get(10)));
        areas.add(new Area("Parmanie","parmanie",trainers.get(11)));
        areas.add(new Area("Safrania","safrania",trainers.get(12)));
        areas.add(new Area("Iles Ecumes","ilesecumes",trainers.get(13)));
        areas.add(new Area("Cramois Ile","cramoisile",trainers.get(14)));
        areas.add(new Area("Route Victoire","routevictoire",trainers.get(15)));
        areas.add(new Area("Plateau Indigo","plateauindigo",trainers.get(16)));

        return areas;
    }
}
