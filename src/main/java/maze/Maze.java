package maze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Maze extends AbsMaze {
    public Maze(int width, int height) {
        super(width, height);
    }

    private void generate(int width, int height){
        this.maze = new int[width][height];
        ArrayList<int[]> walls = new ArrayList<>();

        Random random = new Random();
        walls.add(randomStartPoint(random));

        while (!walls.isEmpty()){
            final int[] contidateToCheck = walls.remove(random.nextInt(walls.size()));
            int x = contidateToCheck[2];
            int y = contidateToCheck[3];

            if (maze[x][y] == WALL){
                maze[contidateToCheck[0]][contidateToCheck[1]] = maze[x][y] = PATH;

                if (x >= 2 && maze[x - 2][y] == WALL)
                    walls.add(new int[]{x -1, y , x - 2, y});
                if (y >= 2 && maze[x][y - 2] == WALL)
                    walls.add(new int[]{x, y -1  , x, y - 2});
                if (x < width && maze[x + 2][y] == WALL)
                    walls.add(new int[]{x + 1, y , x + 2, y});
                if (x < height && maze[x][y + 2] == WALL)
                    walls.add(new int[]{x, y + 1, x, y + 2});

            }
        }
    }

    private int[] randomStartPoint(Random random){
        int x = random.nextInt(width);
        int y = random.nextInt(height);
        return new int[]{x,y,x,y};
    }

    @Override
    public void print() {
        String border = String.join("", Collections.nCopies(width-1,""));
        System.out.format("%s%s%s", "\n\n\t\u2593\u2593", border, "\u2593\u2593\u2593\n");
        for (int i = 0; i <height ; i++) {
            for (int j = 0; j <width ; j++) {
                printMazeElement(i,j);

            }

        }

    }

    private void printMazeElement(int i, int j) {
        switch (maze[i][j]){
            case PATH:
                printMazeElements(j, PATH_ICON);
                break;

            case TEAM:
                printMazeElements(j, TEAM_ICON);
                break;

            case ENEMY:
                printMazeElements(j,ENEMY_ICON);
                break;
            case OBJECTIVE:
                printMazeElements(j, OBJECTIVE_ICON);
                break;
        }
    }

    private void printMazeElements(int j, String icon){
        if (j == 0){
            System.out.format("%s", "\t\u2593\u2593" + icon);
        }else {
            System.out.format("%s", j < width - 1 ? icon : icon + "\u2593\n");
        }
    }


}
