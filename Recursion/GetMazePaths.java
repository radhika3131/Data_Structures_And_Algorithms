package com.datastructures.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {
    //1. You are given a number n and a number m representing number of rows and columns in a maze.
    //2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
    //3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
    //Use sample input and output to take idea about output.

    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    ArrayList<String> a = getMazePaths(1,1,n,m);
    System.out.println(a);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if(sr == dr && sc == dc)
        {
            ArrayList<String> a = new ArrayList<>();
            a.add(" ");
            return a;
        }

        //Faith
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        if(sc < dc)
        {
            hpaths = getMazePaths(sr , sc + 1 , dr , dc);
        }

        if(sr < dr)
        {
            vpaths = getMazePaths(sr+1 , sc , dr , dc);
        }
        ArrayList<String> path = new ArrayList<>();

        for(String hpath : hpaths)
        {
           path.add("h" + hpath);
        }

        for(String vpath : vpaths)
        {
            path.add("v" + vpath);
        }

        return path;
    }
}
