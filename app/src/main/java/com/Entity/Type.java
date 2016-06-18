package com.Entity;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mathieu on 18/06/2016.
 */
public enum Type {

    Normal("Normal"),
    Fight("Fight"),
    Flying("Flying"),
    Poison("Poison"),
    Ground("Ground"),
    Rock("Rock"),
    Bug("Bug"),
    Ghost("Ghost"),
    Fire("Fire"),
    Water("Water"),
    Grass("Grass"),
    Electric("Electric"),
    Psychic("Psychic"),
    Ice("Ice"),
    Dragon("Dragon");

    protected int index;
    protected String name;

    Type(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
