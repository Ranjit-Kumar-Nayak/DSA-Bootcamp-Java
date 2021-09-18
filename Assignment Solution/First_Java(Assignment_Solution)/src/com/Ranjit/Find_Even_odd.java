package com.Ranjit;

import java.util.Scanner;

public class Find_Even_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter a number for Find Even or Odd : ");
        int num = input.nextInt();
        if (num == 0) {
            System.out.println(" Neither Even Nor Odd");
        } else if (num % 2 == 0) {
            System.out.println(" its a Even Number");
        } else {
            System.out.println(" its A ODD Number");
        }
    }
    }
