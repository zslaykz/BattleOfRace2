package maze;

import lombok.Getter;

public abstract class AbsMaze {

    public static final int WALL = 0;
    public static final int PATH = 1;
    public static final int TEAM = 2;
    public static final int ENEMY = 3;
    public static final int OBJECTIVE = 4;

    public static final String WALL_ICON = "\u2593\u2593";
    public static final String PATH_ICON = "  ";
    public static final String TEAM_ICON ="\u29EA ";
    public static final String ENEMY_ICON ="\u26BF";
    public static final String OBJECTIVE_ICON ="\u26C7";

    @Getter
    public int width;
    @Getter
    public int height;
    @Getter
    public  int[][] maze;

    public AbsMaze(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public abstract void print();


}
