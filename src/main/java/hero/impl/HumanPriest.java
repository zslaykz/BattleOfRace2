package hero.impl;

import abillity.Priest;
import hero.Unit;
import race.Human;

public class HumanPriest extends Human implements Priest, Unit {

    @Override
    public String toString() {
        return ("Human priest " + this.getName() + "\n" +
                "charisma = " + this.getCharisma() + "\n"
                + "stamina = " + this.getStamina() + "\n"
                + "intellect = " + this.getIntellect() + "\n"
                + "agility = " + this.getAgility() + "\n"
                + "concentration = " + this.getConcentration() + "\n");
    }
}
