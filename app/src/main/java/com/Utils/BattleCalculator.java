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

    public static boolean isSucceedAttack(int precisionAttack, int precisionPkm, int escapePkm)
    {
        double succeedValue = precisionAttack * (precisionPkm / escapePkm);

        //LOG_TODO get the boolean value from double
        return true;
    }

    public static int getDamageDeals(int attack, int defense, int levelAttacker, int attackDamage, double multiplicator)
    {
        Double damageDeals = ((((levelAttacker * 0.4 + 2) * attack * attackDamage)/(defense * 50))+2)*multiplicator;
        return damageDeals.intValue();
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


        return 0;
        //return PokemonCore.getInstance().getTypeMatrix().getMultiplier(attackingType,defendingType);
    }
}
