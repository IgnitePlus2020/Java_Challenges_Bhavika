package com.tgt.igniteplus;
import java.util.Scanner;
public class javaC4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Character : ");
        char val = in.next().charAt(0);
        int ascii = (int) val;
        System.out.println("Ascii : "+ ascii);
    }

}
