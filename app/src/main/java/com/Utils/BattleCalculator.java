package com.Utils;

import com.Core.PokemonCore;
import com.Entity.Attack;
import com.Entity.Pokemon;
import com.Entity.PokemonTrainer;
import com.Entity.Type;

/**
 * Created by Mathieu on 19/06/2016.
 */
public class BattleCalculator {

    public static int getStatByLevel(int baseStat, int level)
    {
        return ((2 * baseStat * level) / 100 ) + 5;
    }

    public static int getPVByLevel(int basePv, int level)
    {
        return ((2 * basePv * level) / 100 ) + level + 10;
    }

    public static double isSucceedAttack(int precisionAttack, int precisionPkm, int escapePkm)
    {
        return precisionAttack * (precisionPkm / escapePkm);
    }

    public static String getMessageAttackFromMultiplicator(double multiplicator)
    {
        if(multiplicator == 0.0)
        {
            return "Cette attaque est sans effet !";
        }
        else if(multiplicator == 0.5)
        {
            return "Ce n'est pas très efficace !";
        }
        else if(multiplicator == 2.0)
        {
            return "C'est super efficace !";
        }
        else
        {
            return "";
        }
    }

    public static double getAttackMultiplicator(Attack atk, PokemonTrainer defensor)
    {
        Type attackingType = atk.getType();
        Type defendingType = defensor.getType();

        return PokemonCore.getInstance().getTypeMatrix().getMultiplier(attackingType,defendingType);
    }
}
