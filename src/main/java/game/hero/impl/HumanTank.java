package game.hero.impl;

import game.abillity.Tank;
import game.hero.Unit;
import game.race.Human;

public class HumanTank extends Human implements Tank, Unit {

    @Override
    public String toString() {
        return ("Human Tank " + this.getName() + "\n" +
                "charisma = " + this.getCharisma() + "\n"
                + "stamina = " + this.getStamina() + "\n"
                + "intellect = " + this.getIntellect() + "\n"
                + "agility = " + this.getAgility() + "\n"
                + "concentration = " + this.getConcentration() + "\n");
    }
}
