package com.Entity;

/**
 * Created by Mathieu on 29/07/2016.
 */
public class Multiplicator {

    protected int id;
    protected String text;
    protected double factor;

    public Multiplicator(double _factor)
    {
        this.factor = _factor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getFactor() {
        return factor;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }
}
