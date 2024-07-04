// int n = 4;
// int[][] m = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,0}};

import java.util.*;

class Main{
    public static void main(String[] args){
        int n = 4;
        int[][] m = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,0}};
        List<String> paths = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        
        if(findPath(m,0,0,n,visited,paths)){
            System.out.println("Found");
            
            for(String i : paths ){
                System.out.println(i);
            }
            
        }else{
            System.out.println("Not Found");
        }
        
    }
    
    public static boolean findPath(int[][] maze,int row, int col,int n,boolean[][] visited,List<String> paths){
        
        // base case
        if(row == n-1 && col == n-1){
            paths.add("("+row+","+col+")");
            return true;
        }
        
        // current cell
        
        if(row<0 || row>=n || col<0 || col>=n || maze[row][col]==0|| visited[row][col]){
            return false;
        }
        // visited
        visited[row][col] = true;
        
        if(findPath(maze,row,col+1,n,visited,paths) || findPath(maze,row,col-1,n,visited,paths)||findPath(maze,row+1,col,n,visited,paths) || findPath(maze,row-1,col,n,visited,paths)){
            paths.add("("+row+","+col+")");
            return true;
        }
        // backtrack
        visited[row][col] = false;
        
        return false;
        
    }
    
}
