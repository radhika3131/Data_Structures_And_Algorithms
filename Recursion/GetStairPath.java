package com.datastructures.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPath {
    //1. You are given a number n representing number of stairs in a staircase.
    //2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
    //3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
    //Use sample input and output to take idea about output.
    public static ArrayList< String> getStairPaths(int n) {
        if (n == 0) {                                      //1.1
            ArrayList< String> bres = new ArrayList< >();
            bres.add("");
            return bres;
        } else if (n < 0) {
            ArrayList< String> bres = new ArrayList< >();         //1.2
            return bres;
        }

        ArrayList< String> path1 = getStairPaths(n - 1);         //2.1
        ArrayList< String> path2 = getStairPaths(n - 2);         //2.2
        ArrayList< String> path3 = getStairPaths(n - 3);         //2.3

        ArrayList< String> paths = new ArrayList< >();            //3

        for (String path : path1) {
            paths.add("1" + path);                               //4.1
        }
        for (String path : path2) {
            paths.add("2" + path);                               //4.2
        }
        for (String path : path3) {
            paths.add("3" + path);                               //4.3
        }
        return paths;                                           //5

    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         ArrayList<String> a = getStairPaths(n);
         System.out.println(a);
    }
}
