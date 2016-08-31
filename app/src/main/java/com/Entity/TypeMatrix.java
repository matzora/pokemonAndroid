package com.Entity;

/**
 * Created by Mathieu on 29/07/2016.
 */
public class TypeMatrix {

    protected int id;
    protected Type id_type1;
    protected Type id_type2;
    protected Multiplicator id_multiplicator;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Type getTypeAttacker() {
        return id_type1;
    }

    public void setTypeAttacker(Type typeAttacker) {
        this.id_type1 = typeAttacker;
    }

    public Type getTypeDefender() {
        return id_type2;
    }

    public void setTypeDefender(Type typeDefender) {
        this.id_type2 = typeDefender;
    }

    public Multiplicator getMultiplicator() {
        return id_multiplicator;
    }

    public void setMultiplicator(Multiplicator multiplicator) {
        this.id_multiplicator = multiplicator;
    }
}
