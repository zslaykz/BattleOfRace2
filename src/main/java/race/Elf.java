package race;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Elf {

    private boolean isLeader;
    private String name;
    private int charisma = 5;
    private int stamina = 10;
    private int intellect = 25;
    private int agility = 22;
    private int concentration = 18;

}
