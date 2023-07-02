package com.dataStructures.StringQuestionDiscussedInClass;

public class ReverseBigString {

    public static String reverse(String str)
    {
        int low =0;
        int high = str.length() - 1;
        char[] charArray = str.toCharArray();
        char temp = '0';

        while(low < high)
        {
                temp = charArray[low];
                charArray[low] = charArray[high];
                charArray[high] = temp;


                low++;
                high--;
        }

        return String.valueOf(charArray);
    }

    public static String ApprochSecond(String str)
    {
        String[] words = str.split(" ");
        String result = "";

        for(int i = words.length - 1; i>= 0 ; i--)
        {
            if(words[i]!= "")
            {
                System.out.println(words[i]);
                result += words[i] + " ";

            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "The sky is blue";
        System.out.println(ApprochSecond(str));

      /*  System.out.println(reverse(str));
       String[] result = str.split("");
        String sentense = "";
       for(String word :result)
        {
            sentense = sentense + reverse(word) + "";
        }

        System.out.println(sentense);

        */
    }
}
