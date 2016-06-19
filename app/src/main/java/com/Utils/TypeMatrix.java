package com.Utils;

import com.Entity.Type;

/**
 * Created by Mathieu on 18/06/2016.
 */
public class TypeMatrix {

    double[][] typeMatrix;

    private int numberOfTypes;
    public TypeMatrix(int numberOfTypes)
    {
        this.numberOfTypes = numberOfTypes;
        typeMatrix = new double[numberOfTypes][numberOfTypes];

        typeMatrix[Type.Normal.ordinal()][Type.Normal.ordinal()] = 1;
        typeMatrix[Type.Normal.ordinal()][Type.Fight.ordinal()] = 1;
        typeMatrix[Type.Normal.ordinal()][Type.Flying.ordinal()] = 1;
        typeMatrix[Type.Normal.ordinal()][Type.Poison.ordinal()] = 1;
        typeMatrix[Type.Normal.ordinal()][Type.Ground.ordinal()] = 1;
        typeMatrix[Type.Normal.ordinal()][Type.Rock.ordinal()] = 0.5;
        typeMatrix[Type.Normal.ordinal()][Type.Bug.ordinal()] = 1;
        typeMatrix[Type.Normal.ordinal()][Type.Ghost.ordinal()] = 0;
        typeMatrix[Type.Normal.ordinal()][Type.Fire.ordinal()] = 1;
        typeMatrix[Type.Normal.ordinal()][Type.Water.ordinal()] = 1;
        typeMatrix[Type.Normal.ordinal()][Type.Grass.ordinal()] = 1;
        typeMatrix[Type.Normal.ordinal()][Type.Electric.ordinal()] = 1;
        typeMatrix[Type.Normal.ordinal()][Type.Psychic.ordinal()] = 1;
        typeMatrix[Type.Normal.ordinal()][Type.Ice.ordinal()] = 1;
        typeMatrix[Type.Normal.ordinal()][Type.Dragon.ordinal()] = 1;

        typeMatrix[Type.Fight.ordinal()][Type.Normal.ordinal()] = 1;
        typeMatrix[Type.Fight.ordinal()][Type.Fight.ordinal()] = 2;
        typeMatrix[Type.Fight.ordinal()][Type.Flying.ordinal()] = 1;
        typeMatrix[Type.Fight.ordinal()][Type.Poison.ordinal()] = 0.5;
        typeMatrix[Type.Fight.ordinal()][Type.Ground.ordinal()] = 0.5;
        typeMatrix[Type.Fight.ordinal()][Type.Rock.ordinal()] = 1;
        typeMatrix[Type.Fight.ordinal()][Type.Bug.ordinal()] = 2;
        typeMatrix[Type.Fight.ordinal()][Type.Ghost.ordinal()] = 0.5;
        typeMatrix[Type.Fight.ordinal()][Type.Fire.ordinal()] = 1;
        typeMatrix[Type.Fight.ordinal()][Type.Water.ordinal()] = 1;
        typeMatrix[Type.Fight.ordinal()][Type.Grass.ordinal()] = 1;
        typeMatrix[Type.Fight.ordinal()][Type.Electric.ordinal()] = 1;
        typeMatrix[Type.Fight.ordinal()][Type.Psychic.ordinal()] = 0.5;
        typeMatrix[Type.Fight.ordinal()][Type.Ice.ordinal()] = 2;
        typeMatrix[Type.Fight.ordinal()][Type.Dragon.ordinal()] = 1;

        typeMatrix[Type.Flying.ordinal()][Type.Normal.ordinal()] = 1;
        typeMatrix[Type.Flying.ordinal()][Type.Fight.ordinal()] = 2;
        typeMatrix[Type.Flying.ordinal()][Type.Flying.ordinal()] = 1;
        typeMatrix[Type.Flying.ordinal()][Type.Poison.ordinal()] = 0.5;
        typeMatrix[Type.Flying.ordinal()][Type.Ground.ordinal()] = 0.5;
        typeMatrix[Type.Flying.ordinal()][Type.Rock.ordinal()] = 1;
        typeMatrix[Type.Flying.ordinal()][Type.Bug.ordinal()] = 2;
        typeMatrix[Type.Flying.ordinal()][Type.Ghost.ordinal()] = 1;
        typeMatrix[Type.Flying.ordinal()][Type.Fire.ordinal()] = 1;
        typeMatrix[Type.Flying.ordinal()][Type.Water.ordinal()] = 1;
        typeMatrix[Type.Flying.ordinal()][Type.Grass.ordinal()] = 2;
        typeMatrix[Type.Flying.ordinal()][Type.Electric.ordinal()] = 0.5;
        typeMatrix[Type.Flying.ordinal()][Type.Psychic.ordinal()] = 1;
        typeMatrix[Type.Flying.ordinal()][Type.Ice.ordinal()] = 1;
        typeMatrix[Type.Flying.ordinal()][Type.Dragon.ordinal()] = 1;

        typeMatrix[Type.Poison.ordinal()][Type.Normal.ordinal()] = 1;
        typeMatrix[Type.Poison.ordinal()][Type.Fight.ordinal()] = 1;
        typeMatrix[Type.Poison.ordinal()][Type.Flying.ordinal()] = 1;
        typeMatrix[Type.Poison.ordinal()][Type.Poison.ordinal()] = 0.5;
        typeMatrix[Type.Poison.ordinal()][Type.Ground.ordinal()] = 0.5;
        typeMatrix[Type.Poison.ordinal()][Type.Rock.ordinal()] = 0.5;
        typeMatrix[Type.Poison.ordinal()][Type.Bug.ordinal()] = 1;
        typeMatrix[Type.Poison.ordinal()][Type.Ghost.ordinal()] = 0.5;
        typeMatrix[Type.Poison.ordinal()][Type.Fire.ordinal()] = 1;
        typeMatrix[Type.Poison.ordinal()][Type.Water.ordinal()] = 1;
        typeMatrix[Type.Poison.ordinal()][Type.Grass.ordinal()] = 0.5;
        typeMatrix[Type.Poison.ordinal()][Type.Electric.ordinal()] = 1;
        typeMatrix[Type.Poison.ordinal()][Type.Psychic.ordinal()] = 1;
        typeMatrix[Type.Poison.ordinal()][Type.Ice.ordinal()] = 1;
        typeMatrix[Type.Poison.ordinal()][Type.Dragon.ordinal()] = 1;

        typeMatrix[Type.Ground.ordinal()][Type.Normal.ordinal()] = 1;
        typeMatrix[Type.Ground.ordinal()][Type.Fight.ordinal()] = 1;
        typeMatrix[Type.Ground.ordinal()][Type.Flying.ordinal()] = 0;
        typeMatrix[Type.Ground.ordinal()][Type.Poison.ordinal()] = 2;
        typeMatrix[Type.Ground.ordinal()][Type.Ground.ordinal()] = 1;
        typeMatrix[Type.Ground.ordinal()][Type.Rock.ordinal()] = 2;
        typeMatrix[Type.Ground.ordinal()][Type.Bug.ordinal()] = 0.5;
        typeMatrix[Type.Ground.ordinal()][Type.Ghost.ordinal()] = 1;
        typeMatrix[Type.Ground.ordinal()][Type.Fire.ordinal()] = 2;
        typeMatrix[Type.Ground.ordinal()][Type.Water.ordinal()] = 1;
        typeMatrix[Type.Ground.ordinal()][Type.Grass.ordinal()] = 0.5;
        typeMatrix[Type.Ground.ordinal()][Type.Electric.ordinal()] = 2;
        typeMatrix[Type.Ground.ordinal()][Type.Psychic.ordinal()] = 1;
        typeMatrix[Type.Ground.ordinal()][Type.Ice.ordinal()] = 1;
        typeMatrix[Type.Ground.ordinal()][Type.Dragon.ordinal()] = 1;

        typeMatrix[Type.Rock.ordinal()][Type.Normal.ordinal()] = 1;
        typeMatrix[Type.Rock.ordinal()][Type.Fight.ordinal()] = 0.5;
        typeMatrix[Type.Rock.ordinal()][Type.Flying.ordinal()] = 2;
        typeMatrix[Type.Rock.ordinal()][Type.Poison.ordinal()] = 1;
        typeMatrix[Type.Rock.ordinal()][Type.Ground.ordinal()] = 0.5;
        typeMatrix[Type.Rock.ordinal()][Type.Rock.ordinal()] = 1;
        typeMatrix[Type.Rock.ordinal()][Type.Bug.ordinal()] = 2;
        typeMatrix[Type.Rock.ordinal()][Type.Ghost.ordinal()] = 1;
        typeMatrix[Type.Rock.ordinal()][Type.Fire.ordinal()] = 2;
        typeMatrix[Type.Rock.ordinal()][Type.Water.ordinal()] = 1;
        typeMatrix[Type.Rock.ordinal()][Type.Grass.ordinal()] = 1;
        typeMatrix[Type.Rock.ordinal()][Type.Electric.ordinal()] = 1;
        typeMatrix[Type.Rock.ordinal()][Type.Psychic.ordinal()] = 1;
        typeMatrix[Type.Rock.ordinal()][Type.Ice.ordinal()] = 1;
        typeMatrix[Type.Rock.ordinal()][Type.Dragon.ordinal()] = 1;

        typeMatrix[Type.Bug.ordinal()][Type.Normal.ordinal()] = 1;
        typeMatrix[Type.Bug.ordinal()][Type.Fight.ordinal()] = 0.5;
        typeMatrix[Type.Bug.ordinal()][Type.Flying.ordinal()] = 0.5;
        typeMatrix[Type.Bug.ordinal()][Type.Poison.ordinal()] = 0.5;
        typeMatrix[Type.Bug.ordinal()][Type.Ground.ordinal()] = 1;
        typeMatrix[Type.Bug.ordinal()][Type.Rock.ordinal()] = 1;
        typeMatrix[Type.Bug.ordinal()][Type.Bug.ordinal()] = 1;
        typeMatrix[Type.Bug.ordinal()][Type.Ghost.ordinal()] = 0.5;
        typeMatrix[Type.Bug.ordinal()][Type.Fire.ordinal()] = 0.5;
        typeMatrix[Type.Bug.ordinal()][Type.Water.ordinal()] = 1;
        typeMatrix[Type.Bug.ordinal()][Type.Grass.ordinal()] = 2;
        typeMatrix[Type.Bug.ordinal()][Type.Electric.ordinal()] = 1;
        typeMatrix[Type.Bug.ordinal()][Type.Psychic.ordinal()] = 2;
        typeMatrix[Type.Bug.ordinal()][Type.Ice.ordinal()] = 1;
        typeMatrix[Type.Bug.ordinal()][Type.Dragon.ordinal()] = 1;

        typeMatrix[Type.Ghost.ordinal()][Type.Normal.ordinal()] = 0;
        typeMatrix[Type.Ghost.ordinal()][Type.Fight.ordinal()] = 1;
        typeMatrix[Type.Ghost.ordinal()][Type.Flying.ordinal()] = 1;
        typeMatrix[Type.Ghost.ordinal()][Type.Poison.ordinal()] = 1;
        typeMatrix[Type.Ghost.ordinal()][Type.Ground.ordinal()] = 1;
        typeMatrix[Type.Ghost.ordinal()][Type.Rock.ordinal()] = 1;
        typeMatrix[Type.Ghost.ordinal()][Type.Bug.ordinal()] = 1;
        typeMatrix[Type.Ghost.ordinal()][Type.Ghost.ordinal()] = 2;
        typeMatrix[Type.Ghost.ordinal()][Type.Fire.ordinal()] = 1;
        typeMatrix[Type.Ghost.ordinal()][Type.Water.ordinal()] = 1;
        typeMatrix[Type.Ghost.ordinal()][Type.Grass.ordinal()] = 1;
        typeMatrix[Type.Ghost.ordinal()][Type.Electric.ordinal()] = 1;
        typeMatrix[Type.Ghost.ordinal()][Type.Psychic.ordinal()] = 2;
        typeMatrix[Type.Ghost.ordinal()][Type.Ice.ordinal()] = 1;
        typeMatrix[Type.Ghost.ordinal()][Type.Dragon.ordinal()] = 1;

        typeMatrix[Type.Fire.ordinal()][Type.Normal.ordinal()] = 1;
        typeMatrix[Type.Fire.ordinal()][Type.Fight.ordinal()] = 1;
        typeMatrix[Type.Fire.ordinal()][Type.Flying.ordinal()] = 1;
        typeMatrix[Type.Fire.ordinal()][Type.Poison.ordinal()] = 1;
        typeMatrix[Type.Fire.ordinal()][Type.Ground.ordinal()] = 1;
        typeMatrix[Type.Fire.ordinal()][Type.Rock.ordinal()] = 0.5;
        typeMatrix[Type.Fire.ordinal()][Type.Bug.ordinal()] = 2;
        typeMatrix[Type.Fire.ordinal()][Type.Ghost.ordinal()] = 1;
        typeMatrix[Type.Fire.ordinal()][Type.Fire.ordinal()] =0.5;
        typeMatrix[Type.Fire.ordinal()][Type.Water.ordinal()] = 0.5;
        typeMatrix[Type.Fire.ordinal()][Type.Grass.ordinal()] = 1;
        typeMatrix[Type.Fire.ordinal()][Type.Electric.ordinal()] = 1;
        typeMatrix[Type.Fire.ordinal()][Type.Psychic.ordinal()] = 1;
        typeMatrix[Type.Fire.ordinal()][Type.Ice.ordinal()] = 2;
        typeMatrix[Type.Fire.ordinal()][Type.Dragon.ordinal()] = 0.5;

        typeMatrix[Type.Water.ordinal()][Type.Normal.ordinal()] = 1;
        typeMatrix[Type.Water.ordinal()][Type.Fight.ordinal()] = 1;
        typeMatrix[Type.Water.ordinal()][Type.Flying.ordinal()] = 1;
        typeMatrix[Type.Water.ordinal()][Type.Poison.ordinal()] = 1;
        typeMatrix[Type.Water.ordinal()][Type.Ground.ordinal()] = 2;
        typeMatrix[Type.Water.ordinal()][Type.Rock.ordinal()] = 2;
        typeMatrix[Type.Water.ordinal()][Type.Bug.ordinal()] = 1;
        typeMatrix[Type.Water.ordinal()][Type.Ghost.ordinal()] = 1;
        typeMatrix[Type.Water.ordinal()][Type.Fire.ordinal()] = 2;
        typeMatrix[Type.Water.ordinal()][Type.Water.ordinal()] = 0.5;
        typeMatrix[Type.Water.ordinal()][Type.Grass.ordinal()] = 0.5;
        typeMatrix[Type.Water.ordinal()][Type.Electric.ordinal()] = 1;
        typeMatrix[Type.Water.ordinal()][Type.Psychic.ordinal()] = 1;
        typeMatrix[Type.Water.ordinal()][Type.Ice.ordinal()] = 1;
        typeMatrix[Type.Water.ordinal()][Type.Dragon.ordinal()] = 0.5;

        typeMatrix[Type.Grass.ordinal()][Type.Normal.ordinal()] = 1;
        typeMatrix[Type.Grass.ordinal()][Type.Fight.ordinal()] = 0.5;
        typeMatrix[Type.Grass.ordinal()][Type.Flying.ordinal()] = 0.5;
        typeMatrix[Type.Grass.ordinal()][Type.Poison.ordinal()] = 1;
        typeMatrix[Type.Grass.ordinal()][Type.Ground.ordinal()] = 2;
        typeMatrix[Type.Grass.ordinal()][Type.Rock.ordinal()] = 2;
        typeMatrix[Type.Grass.ordinal()][Type.Bug.ordinal()] = 0.5;
        typeMatrix[Type.Grass.ordinal()][Type.Ghost.ordinal()] = 1;
        typeMatrix[Type.Grass.ordinal()][Type.Fire.ordinal()] = 0.5;
        typeMatrix[Type.Grass.ordinal()][Type.Water.ordinal()] = 2;
        typeMatrix[Type.Grass.ordinal()][Type.Grass.ordinal()] = 0.5;
        typeMatrix[Type.Grass.ordinal()][Type.Electric.ordinal()] = 1;
        typeMatrix[Type.Grass.ordinal()][Type.Psychic.ordinal()] = 1;
        typeMatrix[Type.Grass.ordinal()][Type.Ice.ordinal()] = 1;
        typeMatrix[Type.Grass.ordinal()][Type.Dragon.ordinal()] = 0.5;

        typeMatrix[Type.Electric.ordinal()][Type.Normal.ordinal()] = 1;
        typeMatrix[Type.Electric.ordinal()][Type.Fight.ordinal()] = 1;
        typeMatrix[Type.Electric.ordinal()][Type.Flying.ordinal()] = 2;
        typeMatrix[Type.Electric.ordinal()][Type.Poison.ordinal()] = 1;
        typeMatrix[Type.Electric.ordinal()][Type.Ground.ordinal()] = 0;
        typeMatrix[Type.Electric.ordinal()][Type.Rock.ordinal()] = 1;
        typeMatrix[Type.Electric.ordinal()][Type.Bug.ordinal()] = 1;
        typeMatrix[Type.Electric.ordinal()][Type.Ghost.ordinal()] = 1;
        typeMatrix[Type.Electric.ordinal()][Type.Fire.ordinal()] = 1;
        typeMatrix[Type.Electric.ordinal()][Type.Water.ordinal()] = 2;
        typeMatrix[Type.Electric.ordinal()][Type.Grass.ordinal()] = 0.5;
        typeMatrix[Type.Electric.ordinal()][Type.Electric.ordinal()] = 0.5;
        typeMatrix[Type.Electric.ordinal()][Type.Psychic.ordinal()] = 1;
        typeMatrix[Type.Electric.ordinal()][Type.Ice.ordinal()] = 1;
        typeMatrix[Type.Electric.ordinal()][Type.Dragon.ordinal()] = 0.5;

        typeMatrix[Type.Psychic.ordinal()][Type.Normal.ordinal()] = 1;
        typeMatrix[Type.Psychic.ordinal()][Type.Fight.ordinal()] = 2;
        typeMatrix[Type.Psychic.ordinal()][Type.Flying.ordinal()] = 1;
        typeMatrix[Type.Psychic.ordinal()][Type.Poison.ordinal()] = 23;
        typeMatrix[Type.Psychic.ordinal()][Type.Ground.ordinal()] = 1;
        typeMatrix[Type.Psychic.ordinal()][Type.Rock.ordinal()] = 1;
        typeMatrix[Type.Psychic.ordinal()][Type.Bug.ordinal()] = 1;
        typeMatrix[Type.Psychic.ordinal()][Type.Ghost.ordinal()] = 1;
        typeMatrix[Type.Psychic.ordinal()][Type.Fire.ordinal()] = 1;
        typeMatrix[Type.Psychic.ordinal()][Type.Water.ordinal()] = 1;
        typeMatrix[Type.Psychic.ordinal()][Type.Grass.ordinal()] = 1;
        typeMatrix[Type.Psychic.ordinal()][Type.Electric.ordinal()] = 1;
        typeMatrix[Type.Psychic.ordinal()][Type.Psychic.ordinal()] = 0.5;
        typeMatrix[Type.Psychic.ordinal()][Type.Ice.ordinal()] = 1;
        typeMatrix[Type.Psychic.ordinal()][Type.Dragon.ordinal()] = 1;

        typeMatrix[Type.Ice.ordinal()][Type.Normal.ordinal()] = 1;
        typeMatrix[Type.Ice.ordinal()][Type.Fight.ordinal()] = 1;
        typeMatrix[Type.Ice.ordinal()][Type.Flying.ordinal()] = 2;
        typeMatrix[Type.Ice.ordinal()][Type.Poison.ordinal()] = 1;
        typeMatrix[Type.Ice.ordinal()][Type.Ground.ordinal()] = 2;
        typeMatrix[Type.Ice.ordinal()][Type.Rock.ordinal()] = 1;
        typeMatrix[Type.Ice.ordinal()][Type.Bug.ordinal()] = 1;
        typeMatrix[Type.Ice.ordinal()][Type.Ghost.ordinal()] = 1;
        typeMatrix[Type.Ice.ordinal()][Type.Fire.ordinal()] = 0.5;
        typeMatrix[Type.Ice.ordinal()][Type.Water.ordinal()] = 0.5;
        typeMatrix[Type.Ice.ordinal()][Type.Grass.ordinal()] = 1;
        typeMatrix[Type.Ice.ordinal()][Type.Electric.ordinal()] = 1;
        typeMatrix[Type.Ice.ordinal()][Type.Psychic.ordinal()] = 1;
        typeMatrix[Type.Ice.ordinal()][Type.Ice.ordinal()] = 0.5;
        typeMatrix[Type.Ice.ordinal()][Type.Dragon.ordinal()] = 2;

        typeMatrix[Type.Dragon.ordinal()][Type.Normal.ordinal()] = 1;
        typeMatrix[Type.Dragon.ordinal()][Type.Fight.ordinal()] = 1;
        typeMatrix[Type.Dragon.ordinal()][Type.Flying.ordinal()] = 1;
        typeMatrix[Type.Dragon.ordinal()][Type.Poison.ordinal()] = 1;
        typeMatrix[Type.Dragon.ordinal()][Type.Ground.ordinal()] = 1;
        typeMatrix[Type.Dragon.ordinal()][Type.Rock.ordinal()] = 1;
        typeMatrix[Type.Dragon.ordinal()][Type.Bug.ordinal()] = 1;
        typeMatrix[Type.Dragon.ordinal()][Type.Ghost.ordinal()] = 1;
        typeMatrix[Type.Dragon.ordinal()][Type.Fire.ordinal()] = 1;
        typeMatrix[Type.Dragon.ordinal()][Type.Water.ordinal()] = 1;
        typeMatrix[Type.Dragon.ordinal()][Type.Grass.ordinal()] = 1;
        typeMatrix[Type.Dragon.ordinal()][Type.Electric.ordinal()] = 1;
        typeMatrix[Type.Dragon.ordinal()][Type.Psychic.ordinal()] = 1;
        typeMatrix[Type.Dragon.ordinal()][Type.Ice.ordinal()] = 1;
        typeMatrix[Type.Dragon.ordinal()][Type.Dragon.ordinal()] = 2;
    }

    public double getMultiplier(Type fighter, Type defender)
    {
        return typeMatrix[fighter.ordinal()][defender.ordinal()];
    }
}
