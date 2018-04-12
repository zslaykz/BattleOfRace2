package hero.impl;

import abillity.Paladin;
import hero.Unit;
import race.Elf;

public class ElfPaladin extends Elf implements Paladin, Unit {

    @Override
    public String toString() {
        return ("Elf Paladin " + this.getName() + "\n" +
                "charisma = " + this.getCharisma() + "\n"
                + "stamina = " + this.getStamina() + "\n"
                + "intellect = " + this.getIntellect() + "\n"
                + "agility = " + this.getAgility() + "\n"
                + "concentration = " + this.getConcentration() + "\n");
    }

}
