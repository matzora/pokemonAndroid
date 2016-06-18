package com.Entity;

/**
 * Created by Mathieu on 18/06/2016.
 */
public class Attack {

    protected Type type;
    protected String name;
    protected boolean isPhysical;
    protected int damage;
    protected int accuracy;

    public Attack(Type type, String name, boolean isPhysical, int damage, int accuracy) {
        this.type = type;
        this.name = name;
        this.isPhysical = isPhysical;
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
        return isPhysical;
    }

    public void setPhysical(boolean physical) {
        isPhysical = physical;
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
