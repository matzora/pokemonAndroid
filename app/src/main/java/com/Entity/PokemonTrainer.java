package com.Entity;

import com.Utils.BattleCalculator;

/**
 * Created by Mathieu on 18/06/2016.
 */
public class PokemonTrainer extends Pokemon{

    protected int xp;
    protected int level;
    protected String nickname;
    protected boolean isDead;

    protected Attack attack1;
    protected Attack attack2;
    protected Attack attack3;
    protected Attack attack4;

    protected int actualPV;
    protected int actualAtk;
    protected int actualDef;
    protected int actualAtk_Spe;
    protected int actualDef_Spe;
    protected int actualVit;

    protected int battlePV;
    protected int battleAtk;
    protected int battleDef;
    protected int battleAtk_Spe;
    protected int battleDef_Spe;
    protected int battleVit;

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

        actualPV = BattleCalculator.getPVByLevel(pkm.getPv(),level);
        actualAtk = BattleCalculator.getStatByLevel(pkm.getAtk(),level);
        actualDef = BattleCalculator.getStatByLevel(pkm.getDef(),level);
        actualAtk_Spe = BattleCalculator.getStatByLevel(pkm.getAtk_spe(),level);
        actualDef_Spe = BattleCalculator.getStatByLevel(pkm.getDef_spe(),level);
        actualVit = BattleCalculator.getStatByLevel(pkm.getVit(),level);

        battlePV = actualPV;
        battleAtk = actualAtk;
        battleDef = actualDef;
        battleAtk_Spe = actualAtk_Spe;
        battleDef_Spe = actualDef_Spe;
        battleVit = actualVit;

        isDead = ( actualPV == 0);
    }

    public PokemonTrainer(Pokemon pkm, int level, Attack atk1, Attack atk2, Attack atk3, Attack atk4, int pv)
    {
        super(pkm.getId(), pkm.getName(), pkm.getType(), pkm.getPv(), pkm.getAtk(), pkm.getDef()
                ,pkm.getAtk_spe(), pkm.getDef_spe(), pkm.getVit()
                , pkm.getXp_factor(), pkm.getCapture(), pkm.getAppear_chance());

        this.level = level;
        attack1 = atk1;
        attack2 = atk2;
        attack3 = atk3;
        attack4 = atk4;

        actualPV = BattleCalculator.getPVByLevel(pkm.getPv(),level);
        actualAtk = BattleCalculator.getStatByLevel(pkm.getAtk(),level);
        actualDef = BattleCalculator.getStatByLevel(pkm.getDef(),level);
        actualAtk_Spe = BattleCalculator.getStatByLevel(pkm.getAtk_spe(),level);
        actualDef_Spe = BattleCalculator.getStatByLevel(pkm.getDef_spe(),level);
        actualVit = BattleCalculator.getStatByLevel(pkm.getVit(),level);

        battlePV = pv;
        battleAtk = actualAtk;
        battleDef = actualDef;
        battleAtk_Spe = actualAtk_Spe;
        battleDef_Spe = actualDef_Spe;
        battleVit = actualVit;

        isDead = ( actualPV == 0);
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

    public void losePv(int pvLosed)
    {
        int newLife = ( battlePV - pvLosed) < 0 ? 0 : battlePV - pvLosed;
        battlePV = newLife;
        if(battlePV == 0 )
        {
            isDead = true;
        }
    }

    public Attack getAttack(int index)
    {
        switch(index)
        {
            case 0:
                return attack1;
            case 1:
                return attack2;
            case 2:
                return attack3;
            case 3:
                return attack4;
            default:
                return null;
        }
    }

    public boolean isDead() {
        return isDead;
    }

    public int getActualPV() {
        return actualPV;
    }

    public void setActualPV(int actualPV) {
        this.actualPV = actualPV;
    }

    public int getBattlePV() {
        return battlePV;
    }

    public void setBattlePV(int battlePV) {
        this.battlePV = battlePV;
    }

    public int getBattleAtk() {
        return battleAtk;
    }

    public void setBattleAtk(int battleAtk) {
        this.battleAtk = battleAtk;
    }

    public int getBattleDef() {
        return battleDef;
    }

    public void setBattleDef(int battleDef) {
        this.battleDef = battleDef;
    }

    public int getBattleAtk_Spe() {
        return battleAtk_Spe;
    }

    public void setBattleAtk_Spe(int battleAtk_Spe) {
        this.battleAtk_Spe = battleAtk_Spe;
    }

    public int getBattleDef_Spe() {
        return battleDef_Spe;
    }

    public void setBattleDef_Spe(int battleDef_Spe) {
        this.battleDef_Spe = battleDef_Spe;
    }

    public int getBattleVit() {
        return battleVit;
    }

    public void setBattleVit(int battleVit) {
        this.battleVit = battleVit;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public int getActualAtk() {
        return actualAtk;
    }

    public void setActualAtk(int actualAtk) {
        this.actualAtk = actualAtk;
    }

    public int getActualDef() {
        return actualDef;
    }

    public void setActualDef(int actualDef) {
        this.actualDef = actualDef;
    }

    public int getActualAtk_Spe() {
        return actualAtk_Spe;
    }

    public void setActualAtk_Spe(int actualAtk_Spe) {
        this.actualAtk_Spe = actualAtk_Spe;
    }

    public int getActualDef_Spe() {
        return actualDef_Spe;
    }

    public void setActualDef_Spe(int actualDef_Spe) {
        this.actualDef_Spe = actualDef_Spe;
    }

    public int getActualVit() {
        return actualVit;
    }

    public void setActualVit(int actualVit) {
        this.actualVit = actualVit;
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
