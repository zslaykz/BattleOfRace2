package games;

import game.team.Team;
import game.util.UserInteraction;

public class Game {

    public static void start(){
        System.out.println("Hellow");

        String teamName = UserInteraction.askName("Team name");
        Team team = new Team(teamName);
        Massage.printTeamInfo(team);

    }
}
