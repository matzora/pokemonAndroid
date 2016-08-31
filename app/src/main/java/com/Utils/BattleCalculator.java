package com.Utils;

import com.Core.PokemonCore;
import com.Entity.Attack;
import com.Entity.Multiplicator;
import com.Entity.Pokemon;
import com.Entity.PokemonTrainer;
import com.Entity.Type;
import com.Entity.TypeMatrix;

import java.util.ArrayList;
import java.util.Random;

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
        Double damageDeals = 0.;

        damageDeals = ((((levelAttacker * 0.4 * 2)*attackDamage * attack)/(defense*50))+2);

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

    public static Multiplicator getAttackMultiplicator(Attack atk, PokemonTrainer defensor)
    {
        Type attackingType = PokemonCore.getInstance().getTypeById(atk.getId_type());

        Random r = new Random();
        int i1 = r.nextInt(PokemonCore.getInstance().getTypes().size() - 1);

        Type defendingType = PokemonCore.getInstance().getTypeById(i1);

        ArrayList<TypeMatrix> typeMatrixList = PokemonCore.getInstance().getTypeMatrix();

        for(int i = 1 ; i < typeMatrixList.size() ; i ++ )
        {
            if(typeMatrixList.get(i).getTypeAttacker().getId() == attackingType.getId()
                    && typeMatrixList.get(i).getTypeDefender().getId() == defendingType.getId())
            {
                return typeMatrixList.get(i).getMultiplicator();
            }
        }
        return new Multiplicator(1);
    }

    public static double multiplicator(Type attackingType, Type DefendingType)
    {

        return 1.0;
    }
}
