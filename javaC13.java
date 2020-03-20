package com.tgt.igniteplus;
import java.util.Scanner;
public class javaC13 {
    public static void main(String args[])
    {
        String text;
        int words = 0;

        Scanner  in = new Scanner(System.in);

        System.out.print("Enter string: ");
        text = in.nextLine();


        for(int i = 0; i < text.length() - 1 ; i++)
        {
            if( text.charAt(i) ==' ' && text.charAt( i + 1 ) != ' ')
                words ++;
        }

        System.out.println("Total number of words in string are: "+ ( words + 1));


    }
}
