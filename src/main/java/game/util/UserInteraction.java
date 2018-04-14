package game.util;

import game.race.RaceMap;
import game.race.Race;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class UserInteraction {

  public static Race[] askHeroes(int teamMembers){
      ArrayList<Race> teamHeroes = new ArrayList();

      while (teamHeroes.size() < teamMembers){
          initialHero(teamHeroes);
          int currentTeamSize = teamHeroes.size();
          if (currentTeamSize < teamMembers){
              System.out.println("Plese ente one more");
          }
      }
      return teamHeroes.toArray(new Race[teamHeroes.size()]);
  }

  private static void initialHero(ArrayList<Race> teamHeroes){
      Map<String,Map<String,Race>> raceMap =RaceMap.getRace();
      String name = askName("Hero name");
      String race = askRace();
      Race hero = askHero(raceMap.get(race),race);
      hero.setName(name);
      teamHeroes.add(hero);
  }

    private static Race askHero(Map<String,Race> heroesMap, String race) {
      Set<String> heroesKey = heroesMap.keySet();
      String[] heroes = heroesKey.toArray(new String[heroesKey.size()]);
      int option = cohoseOption(heroes);
      return heroesMap.get(heroes[option]);
    }

    public static String askName(String string){
      while (true){
         String userInput = ScannerUtil.getString().toUpperCase().trim();
          return userInput;
      }
  }

  private static String askRace(){
      Set<String> raceKey = RaceMap.getRace().keySet();
      String[] races = raceKey.toArray(new String[raceKey.size()]);
      int option = cohoseOption(races);
      return races[option];
  }

  private static int cohoseOption(String[] items){
      while (true){
          String userInput = ScannerUtil.getString();
          if (userInput.matches("\\d+")){
              int option = Integer.parseInt(userInput);
              if (option >= 1 && option <= items.length){
                  return option -1;
              }
          }
      }
  }

}
