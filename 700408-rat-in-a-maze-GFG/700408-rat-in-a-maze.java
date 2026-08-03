class Solution {
    ArrayList<String> ans = new ArrayList<>();
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
         if (maze[0][0] == 0) {
            return ans;
        }

        maze[0][0] = 0;          // mark start as visited
        mouse(maze, 0, 0, "");
        maze[0][0] = 1;

        return ans;
    }

    public void mouse(int[][] maze, int row, int col, String path) {

        int[] x = {1, 0, 0, -1};
        int[] y = {0, -1, 1, 0};
        char[] dir = {'D', 'L', 'R', 'U'};

        if (row == maze.length - 1 && col == maze.length - 1) {
            ans.add(path);
            return;
        }

        for (int i = 0; i < 4; i++) {

            int nextx = row + x[i];
            int nexty = col + y[i];

            if (nextx >= 0 && nextx < maze.length &&
                nexty >= 0 && nexty < maze.length &&
                maze[nextx][nexty] == 1) {

                maze[nextx][nexty] = 0;

                mouse(maze, nextx, nexty, path + dir[i]);

                maze[nextx][nexty] = 1;
            }
        }
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna