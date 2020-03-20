package com.tgt.igniteplus;
import java.util.*;

public class javaC12 {
    public static void main(String[] args)
    {
        String a, b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first string: ");
        a = s.nextLine();
        System.out.print("Enter second string: ");
        b = s.nextLine();
         a = a.concat(b);

        System.out.println("New String: " + a);
    }
}
