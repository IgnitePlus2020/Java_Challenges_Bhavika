package com.tgt.igniteplus;
import java.util.Scanner;
public class javaC5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n to check if it is a perfect square ");
        int n = in.nextInt();
        int flag = 0;
        for(int i = 1 ; i * i <= n ; i++)
        {
            if(i * i == n)
                flag = 1;
        }
        if(flag == 1)
            System.out.println(n+" is a perfect square ");
        else
            System.out.println(n+" is not a perfect square ");
    }
}
