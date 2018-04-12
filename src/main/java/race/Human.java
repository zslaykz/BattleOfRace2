package race;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Human {

    private boolean isLeader;
    private String name;
    private int charisma = 10;
    private int stamina = 30;
    private int intellect = 20;
    private int agility = 15;
    private int concentration = 15;
}
