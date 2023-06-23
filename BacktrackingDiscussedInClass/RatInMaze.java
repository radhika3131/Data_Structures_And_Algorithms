package com.dataStructures.BacktrackingDiscussedInClass;

public class RatInMaze {

    public static boolean isnotBlocked(int board[][] , int row , int col)
    {
        if(row < board.length && col < board.length && board[row][col] == 1)
        {
            return true;
        }
        return false;

    }

    public static boolean ratInMaze(int board[][] , int row , int col , int [][]path)
    {
        if(row == board.length - 1 && col == board.length - 1 && board[row][col] == 1)
        {
            path[row][col] = 1;
            return true;
        }

        if(isnotBlocked(board , row , col))
        {
            path[row][col] = 1;
            // move to next row and col

            if(ratInMaze(board , row + 1 , col , path))
            {
                return true;
            }
            if(ratInMaze(board , row , col+1 , path))
            {
                return true;
            }
            //undo
            path[row][col] = 0;
        }

        return false;
    }
    public static void main(String[] args) {
        int board[][] = {
                {1,0,1,0,1},
                {1,1,1,1,1},
                {0,1,0,1,0},
                {1,0,0,1,1},
                {1,1,1,0,1},
        };
        int path [][]= new int[board.length][board.length]; // fill 0
        boolean result = ratInMaze(board, 0, 0, path);
        if(result){
            System.out.println("Rat Reach and Path Follow...");
            for(int i =0; i<path.length; i++){
                for(int j = 0; j<path[i].length; j++){
                    System.out.print(path[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Rat Not Reached...");
        }

    }


}

