package com.Entity;

import java.io.Serializable;

/**
 * Created by Mathieu on 18/06/2016.
 */
public class Attack  implements Serializable {

    protected int id;
    protected int id_type;
    protected Type type;
    protected String name;
    protected boolean physical;
    protected int damage;
    protected int accuracy;

    public Attack(int id_type, String name, boolean isPhysical, int damage, int accuracy) {
        this.id_type = id_type;
        this.name = name;
        this.physical = isPhysical;
        this.damage = damage;
        this.accuracy = accuracy;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPhysical() {
        return physical;
    }

    public void setPhysical(boolean physical) {
        physical = physical;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
}
