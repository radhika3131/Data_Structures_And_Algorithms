package com.dataStructures.BranchRecursionAssignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePathFirst {
public static ArrayList<String> MazePath(int sr , int sc , int dr , int dc)
{
    // sr = source row
    // sc = source column
    // dr = destination row
    // dc = destination column
    // Termination condition
    if(sr == dr && sc == dc)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add(" ");
        return list;
    }

    ArrayList<String> rightPaths =new ArrayList<>();
    ArrayList<String> leftPaths =new ArrayList<>();

  if(sc < dc )
  {
      rightPaths = MazePath(sr , sc + 1 , dr , dc);
  }

    if(sr < dr)
    {
        leftPaths = MazePath(sr + 1, sc  , dr , dc);
    }

    ArrayList<String> paths = new ArrayList<>();

    for(String rpaths : rightPaths)
    {
        paths.add(" r " + rpaths);
    }

    for(String lpaths : leftPaths)
    {
        paths.add(" l " + lpaths);
    }

    return paths;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<String> a = MazePath(0,0,n-1,m-1);
        System.out.println(a);
    }
}
