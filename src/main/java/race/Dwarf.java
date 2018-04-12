package race;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Dwarf {

    private boolean isLeader;
    private String name;
    private int charisma = 5;
    private int stamina = 45;
    private int intellect = 15;
    private int agility = 20;
    private int concentration = 5;
}
