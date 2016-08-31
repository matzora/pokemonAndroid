package com.Entity;

import com.Utils.BattleCalculator;

import java.util.ArrayList;

/**
 * Created by Mathieu on 18/06/2016.
 */
public class PokemonTrainer extends Pokemon{

    protected int xp;
    protected int level;
    protected String nickname;
    protected boolean isDead;

    ArrayList<Attack> attacks;

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

    public PokemonTrainer(Pokemon pkm, int level, ArrayList<Attack> _attacks)
    {
        super(pkm.getId(), pkm.getName(), pkm.getType(), pkm.getPv(), pkm.getAtk(), pkm.getDef()
                ,pkm.getAtk_spe(), pkm.getDef_spe(), pkm.getVit()
                , pkm.getXp_factor(), pkm.getCapture(), pkm.getAppear_chance());

        this.level = level;
        this.attacks = _attacks;

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

    public PokemonTrainer(Pokemon pkm, int level, ArrayList<Attack> _attacks, int pv)
    {
        super(pkm.getId(), pkm.getName(), pkm.getType(), pkm.getPv(), pkm.getAtk(), pkm.getDef()
                ,pkm.getAtk_spe(), pkm.getDef_spe(), pkm.getVit()
                , pkm.getXp_factor(), pkm.getCapture(), pkm.getAppear_chance());

        this.level = level;
        this.attacks = _attacks;

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

    public Attack getAttack(int index)
    {
        if(index > attacks.size() - 1)
        {
            return null;
        }
        return attacks.get(index);
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

    public ArrayList<Attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(ArrayList<Attack> attacks) {
        this.attacks = attacks;
    }
}
