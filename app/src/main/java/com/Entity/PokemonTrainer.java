package com.Entity;

/**
 * Created by Mathieu on 18/06/2016.
 */
public class PokemonTrainer extends Pokemon{

    protected int xp;
    protected int level;
    protected String nickname;

    protected Attack attack1;
    protected Attack attack2;
    protected Attack attack3;
    protected Attack attack4;

    public int getCurrentPV() {
        return currentPV;
    }

    public void setCurrentPV(int currentPV) {
        this.currentPV = currentPV;
    }

    protected int currentPV;

    public PokemonTrainer(Pokemon pkm, int level, Attack atk1, Attack atk2, Attack atk3, Attack atk4)
    {
        super(pkm.getId(), pkm.getName(), pkm.getType(), pkm.getPv(), pkm.getAtk(), pkm.getDef()
                ,pkm.getAtk_spe(), pkm.getDef_spe(), pkm.getVit()
                , pkm.getXp_factor(), pkm.getCapture(), pkm.getAppear_chance());

        this.level = level;
        attack1 = atk1;
        attack2 = atk2;
        attack3 = atk3;
        attack4 = atk4;
    }

    public PokemonTrainer(int id, String name, Type type, int pv, int atk, int def, int atk_spe, int def_spe, int vit, int xp_factor, int capture, int appear_chance, int xp, int level, String nickname, Attack attack1, Attack attack2, Attack attack3, Attack attack4) {
        super(id, name, type, pv, atk, def, atk_spe, def_spe, vit, xp_factor, capture, appear_chance);
        this.xp = xp;
        this.level = level;
        this.nickname = nickname;
        this.attack1 = attack1;
        this.attack2 = attack2;
        this.attack3 = attack3;
        this.attack4 = attack4;
    }

    public void addAttack(Attack attack, int position)
    {
        switch(position)
        {
            case 0:
                this.attack1 = attack;
                break;
            case 1:
                this.attack2 = attack;
                break;
            case 2:
                this.attack3 = attack;
                break;
            case 3:
                this.attack4 = attack;
                break;
        }
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Attack getAttack1() {
        return attack1;
    }

    public void setAttack1(Attack attack1) {
        this.attack1 = attack1;
    }

    public Attack getAttack2() {
        return attack2;
    }

    public void setAttack2(Attack attack2) {
        this.attack2 = attack2;
    }

    public Attack getAttack3() {
        return attack3;
    }

    public void setAttack3(Attack attack3) {
        this.attack3 = attack3;
    }

    public Attack getAttack4() {
        return attack4;
    }

    public void setAttack4(Attack attack4) {
        this.attack4 = attack4;
    }
}
