package game.hero.impl;

import game.abillity.Warlord;
import game.hero.Unit;
import game.race.Dwarf;

public class DwarfWarrior extends Dwarf implements Warlord, Unit {

    @Override
    public String toString() {
        return ("Dwarf Warlord " + this.getName() + "\n" +
                "charisma = " + this.getCharisma() + "\n"
                + "stamina = " + this.getStamina() + "\n"
                + "intellect = " + this.getIntellect() + "\n"
                + "agility = " + this.getAgility() + "\n"
                + "concentration = " + this.getConcentration() + "\n");
    }
}