package com.Ranjit;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print(" enter the Principle Amount :");
        float Principle = input.nextInt();
        System.out.println(" enter the Time : ");
        float Time=input.nextInt();
        System.out.println(" enter the Interest Rate : ");
        float Interest= input.nextInt();
         float SimpleInterest=Principle*Time*Interest/100;
        System.out.println(" the Simple Interest Is : " + SimpleInterest);
    }
}
