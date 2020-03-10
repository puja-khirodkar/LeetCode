class Solution {
    public int numIslands(char[][] grid) {

        if(grid==null || grid.length == 0 )
            return 0;
        int nRow = grid.length;
        int nCol = grid[0].length;

        int count = 0;
        for(int i = 0; i<nRow; i++){
           for(int j = 0; j<nCol; j++){
             if(grid[i][j]=='1'){
                dfs(grid, i, j);
                count++;
             }
          }
        }
        return count;
    }

    public  void dfs(char[][] m, int row, int col){

          if(row>=0 && row<m.length && col>=0 && col<m[0].length ){
             if(m[row][col]=='1'){
               m[row][col]='0';
               dfs(m,row-1,col); //moveUp
               dfs(m,row+1,col); //moveDown
               dfs(m,row,col-1); //moveLeft
               dfs(m,row,col+1); //moveRight
             }
        }
   }


}
