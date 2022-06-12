import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] maze=new int[n][n];
        printKnightsTour(maze,r,c,1);
    }

    public static void printKnightsTour(int[][] maze, int sr, int sc, int move) {
        if(sr<0||sc<0||sr>=maze.length||sc>=maze.length||maze[sr][sc]>0){
            return;
        }
        else if(move==maze.length*maze.length){
            maze[sr][sc]=move;
            displayBoard(maze);
            maze[sr][sc]=0;
            return;
        }
        maze[sr][sc]=move;
        printKnightsTour(maze,sr-2,sc+1,move+1);
        printKnightsTour(maze,sr-1,sc+2,move+1);
        printKnightsTour(maze,sr+1,sc+2,move+1);
        printKnightsTour(maze,sr+2,sc+1,move+1);
        printKnightsTour(maze,sr+2,sc-1,move+1);
        printKnightsTour(maze,sr+1,sc-2,move+1);
        printKnightsTour(maze,sr-1,sc-2,move+1);
        printKnightsTour(maze,sr-2,sc-1,move+1);
        maze[sr][sc]=0;
    }

    public static void displayBoard(int[][] maze){
        for(int i = 0; i < maze.length; i++){
            for(int j = 0; j < maze[0].length; j++){
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}