package com.tgt.igniteplus;
import java.util.Scanner;
public class javaC2 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter values for height and radius:\n");
        int height = in.nextInt();
        int radius = in.nextInt();
        double pie=3.14285714286;
        double volume = pie * (radius * radius) * height;
        System.out.println("Volume of the cylinder is : " + volume);
    }
}
