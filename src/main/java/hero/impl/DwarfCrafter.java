package hero.impl;

import abillity.Crafter;
import hero.Unit;
import race.Dwarf;

public class DwarfCrafter extends Dwarf implements Unit, Crafter {

    @Override
    public String toString(){
        return ("Dwarf Mechanist " + this.getName() + "\n" +
                "charisma = " + this.getCharisma() + "\n"
                + "stamina = " + this.getStamina() + "\n"
                + "intellect = " + this.getIntellect() + "\n"
                + "agility = " + this.getAgility() + "\n"
                + "concentration = " + this.getConcentration() + "\n");
    }
}
