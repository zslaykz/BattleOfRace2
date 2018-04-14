package maze;

import java.util.HashMap;
import java.util.Map;

public class MapMaze {

    public static Map<String, Location> getMazeMap(int[][] maze){
        int width = maze.length;
        int height = maze[0].length;

        Map<String, Location> mazeMap = new HashMap();

        for (int i = 0; i <width ; i++) {
            for (int j = 0; j <height ; j++) {
                String key = String.format("%d|%d",i,j);
                mazeMap.put(key, new Location(maze[i][j] != 0, key));
            }
        }
        return mazeMap;
    }
    
}
