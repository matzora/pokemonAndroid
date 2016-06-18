package com.Entity;

/**
 * Created by Mathieu on 18/06/2016.
 */
public class Pokemon {
    protected String name;
    protected int pv;
    protected int atk;
    protected int def;
    protected int vit;
    protected int atk_spe;
    protected int def_spe;
    protected int xp_factor;
    protected int capture;
    protected int appear_chance;

    public Pokemon(String name, int pv, int atk, int def, int atk_spe, int def_spe, int vit, int xp_factor, int capture, int appear_chance) {

        this.name = name;
        this.pv = pv;
        this.atk = atk;
        this.def = def;
        this.vit = vit;
        this.atk_spe = atk_spe;
        this.def_spe = def_spe;
        this.xp_factor = xp_factor;
        this.capture = capture;
        this.appear_chance = appear_chance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk_spe() {
        return atk_spe;
    }

    public void setAtk_spe(int atk_spe) {
        this.atk_spe = atk_spe;
    }

    public int getDef_spe() {
        return def_spe;
    }

    public void setDef_spe(int def_spe) {
        this.def_spe = def_spe;
    }

    public int getXp_factor() {
        return xp_factor;
    }

    public void setXp_factor(int xp_factor) {
        this.xp_factor = xp_factor;
    }

    public int getCapture() {
        return capture;
    }

    public void setCapture(int capture) {
        this.capture = capture;
    }

    public int getAppear_chance() {
        return appear_chance;
    }

    public void setAppear_chance(int appear_chance) {
        this.appear_chance = appear_chance;
    }
}
