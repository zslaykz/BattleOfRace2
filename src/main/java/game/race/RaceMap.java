package game.race;

import game.hero.impl.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class RaceMap {

    public static Map<String, Map<String, Race>> getRace(){
        Map<String, Map<String, Race>> races = new LinkedHashMap();

        races.put("human", getHumanHeroes() );
        races.put("elf", getElfHeroes() );
        races.put("dwarf", getDwarfHeroes() );

        return races;
    }

    private static Map<String,Race> getDwarfHeroes() {
        Map<String, Race> raceHeroes = new LinkedHashMap();
        raceHeroes.put("priest" , new HumanPriest());
        raceHeroes.put("tank", new HumanTank());
        return raceHeroes;
    }

    private static Map<String,Race> getElfHeroes() {
        Map<String, Race> raceHeroes = new LinkedHashMap();
        raceHeroes.put("Mage" , new ElfMage());
        raceHeroes.put("Elf paladin", new ElfPaladin());
        return raceHeroes;
    }

    private static Map<String, Race> getHumanHeroes(){
        Map<String, Race> raceHeroes = new LinkedHashMap();
        raceHeroes.put("Crafter" , new DwarfCrafter());
        raceHeroes.put("Warrior", new DwarfWarrior());
        return raceHeroes;
    }
}
