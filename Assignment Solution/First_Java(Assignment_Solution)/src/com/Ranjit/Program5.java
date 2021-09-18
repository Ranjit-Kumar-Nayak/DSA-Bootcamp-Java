package com.Ranjit;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" enter the Amount In rupee");
        float Rupee = input.nextFloat();
    Double Usd=0.014*Rupee;
        System.out.println(" The USD Value is : "+ Usd);

    }
}
