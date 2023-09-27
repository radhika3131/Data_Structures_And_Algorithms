package com.datastructures.RecursionAndBacktracking;

/*Given a String find the adjacent element if it is same as the previous element so add the star in between

e.g "aabbcc"

output a*ab*bc*c

 */
public class adjacentElement {

    static String result = " ";
    public static void addingStar(String str , int index)
    {

        result = result + str.charAt(index);
        if(str.length()-1 == index )
        {
            return ;
        }
        if(str.charAt(index) == str.charAt(index+1))
        {
            result = result + "*";
        }
        addingStar(str,index+1);


    }

    public static void main(String[] args) {
        String str = "aabbcc";

        addingStar(str,0);
        System.out.println(result);
    }
}
