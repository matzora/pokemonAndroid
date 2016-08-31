package com.Entity;

import java.io.Serializable;

/**
 * Created by Mathieu on 18/06/2016.
 */
public class Attack  implements Serializable {

    protected int id;
    protected int id_type;
    protected String name;
    protected boolean physical;
    protected int power;
    protected int accuracy;

    public Attack(int id_type, String name, boolean isPhysical, int power, int accuracy) {
        this.id_type = id_type;
        this.name = name;
        this.physical = isPhysical;
        this.power = power;
        this.accuracy = accuracy;
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

    public int getPower() {
        return power;
    }

    public void setPower(int damage) {
        this.power = damage;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getId_type() {
        return id_type;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }
}
