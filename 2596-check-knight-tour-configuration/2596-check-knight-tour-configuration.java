class Solution {
    public boolean checkValidGrid(int[][] grid) {
        return isknight(grid,1);
    }
    public static boolean isknight(int [][]grid,int target){
    int x[] = {-2,-2,-1,-1,1,1,2,2};
    int y[] = {-1,1,-2,2,-2,2,-1,1};
    int row=0,col=0;
    if(grid[0][0]!=0){
        return false;
    }
    while(target<grid.length*grid.length){
    boolean isfound = false;
    for(int i=0;i<x.length;i++){
    if(row+x[i]>=0 && row+x[i]<grid.length && col+y[i]>=0 && col+y[i]<grid.length){
        if(grid[row+x[i]][col+y[i]]==target){
            target++;
            isfound = true;
            row = row+x[i];
            col = col+y[i];
            break;
        }
    }
    }
    if(!isfound){
        return false;
    }
}
return true;
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna