package util;

import hero.Unit;
import hero.impl.*;

public class Menu {

    public static void welcome() {
        System.out.println("Hello welcome to oue game");
        System.out.println("Now you have to create command");
    }

    public static void printHeroesVariants() {
        System.out.println("Please choose a hero \n press 1 for Human Priest\n " +
                "press 2 for Human Paladin\n press 3 for Dwarf Warrior\n " +
                "press 4 for Dwarf Mechanist\n press 5 for Elf Mage\n press 6 for Elf Gunslinger");
    }


    public static void heroChoose() {

        int input = ScannerUtil.getInt();
        if (input == 1) {
            Unit unit = new HumanPriest();
            setHeroStats(unit);
            System.out.println(unit);
        } else if (input == 2) {
            Unit unit = new HumanTank();
            setHeroStats(unit);
            System.out.println(unit);
        } else if (input == 3) {
            Unit unit = new DwarfWarrior();
            setHeroStats(unit);
            System.out.println(unit);
        } else if (input == 4) {
            Unit unit = new DwarfCrafter();
            setHeroStats(unit);
            System.out.println(unit);
        } else if (input == 5) {
            Unit unit = new ElfMage();
            setHeroStats(unit);
            System.out.println(unit);
        } else if (input == 6) {
            Unit unit = new ElfPaladin();
            setHeroStats(unit);
            System.out.println(unit);
        } else System.out.println("Invalid input");
    }

    private static void setHeroStats(Unit unit) {
        System.out.println("Set hero name");
        String name = ScannerUtil.getString();
        unit.setName(name);
        System.out.println("Set hero Charisma. (Basic " + unit.getClass().getSimpleName() +
                " Charisma = " + unit.getCharisma() + ")");
        unit.setCharisma(unit.getCharisma() + ScannerUtil.getInt());
        System.out.println("Set hero Stamina. (Basic " + unit.getClass().getSimpleName() +
                " Stamina = " + unit.getStamina() + ")");
        unit.setStamina(unit.getStamina() + ScannerUtil.getInt());
        System.out.println("Set hero Intellect. (Basic " + unit.getClass().getSimpleName() +
                " Intellect = " + unit.getIntellect() + ")");
        unit.setIntellect(unit.getIntellect() + ScannerUtil.getInt());
        System.out.println("Set hero Agility. (Basic " + unit.getClass().getSimpleName() +
                " Agility = " + unit.getAgility() + ")");
        unit.setAgility(unit.getAgility() + ScannerUtil.getInt());
        System.out.println("Set hero Concentration. (Basic " + unit.getClass().getSimpleName() +
                " Concentration = " + unit.getCharisma() + ")");
        unit.setConcentration(unit.getConcentration() + ScannerUtil.getInt());
    }

    private static int pointsValue(int maxPointValue) {
        while (true) {
            int inputPointValue = ScannerUtil.getInt();
            if (maxPointValue >= inputPointValue && inputPointValue < 0) {
                return inputPointValue;
            }
            System.out.println("To much points");
        }


    }

}