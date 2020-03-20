package com.tgt.igniteplus;
import java.util.*;
public class javaC11 {
    public static void main(String[] args) {
        System.out.println("Enter word : ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String strUpper = str.toUpperCase();

        System.out.println("String changed to upper case: "+ strUpper);
    }
}
