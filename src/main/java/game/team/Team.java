package game.team;


import game.util.UserInteraction;
import game.hero.Unit;
import lombok.Getter;
import lombok.Setter;
import game.race.Race;

@Getter
@Setter
public class Team {

    private static final int TEAM_MEAMBERS = 3;

    @Getter
    private Unit[] units;

    @Getter
    private Race[] heroes;

    @Getter
    private String name;


    public Team(String name){
        heroes = createTeam();
        this.name = name;

    }

    private Race[] createTeam() {
        Race[] selectedHero = UserInteraction.askHeroes(TEAM_MEAMBERS);
        selectedHero[0].isLeader();
        return selectedHero;
    }

    private String printTeamMembers(){
        String[] heroesName = new String[heroes.length];
        for (int i = 0; i < heroes.length; i++){
            heroesName[i] = String.format(heroes[i].getName());
        }
        return String.join(", ", heroesName);
    }


}
