package com.datastructures.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathWithJumps {
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
        if (sr == dr && sc == dc)
        {
            ArrayList< String> bres = new ArrayList< >();
            bres.add("");
            return bres;
        }
        else if (sr > dr || sc > dc)
        {
            ArrayList< String> bres = new ArrayList< >();
            return bres;
        }

        ArrayList<String> paths = new ArrayList<>();
        for(int hmoves = 1; hmoves <= dc - sc ; hmoves ++)
        {
            ArrayList<String> hpaths = getMazePaths(sr , sc + hmoves , dr , dc);
            for(String path:hpaths)
            {
                paths.add("h" + hmoves + path);
            }
        }

        for(int vmoves = 1; vmoves <= dc - sc ; vmoves ++)
        {
            ArrayList<String> vpaths = getMazePaths(sr + vmoves , sc  , dr , dc);
            for(String path:vpaths)
            {
                paths.add("v" + vmoves + path);
            }
        }

        for(int dmoves = 1; dmoves <= dc - sc && dmoves <= dr - sr ; dmoves ++)
        {
            ArrayList<String> hpaths = getMazePaths(sr + dmoves , sc + dmoves , dr , dc);
            for(String path:hpaths)
            {
                paths.add("d" + dmoves + path);
            }
        }

        return paths;
    }

}
