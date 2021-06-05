package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 05
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        double number01 = firstNumber();
        double number02 = secondNumber();

        double sum = number01 + number02;
        double dif = number01 - number02;
        double mul = number01 * number02;
        double div = number01 / number02;

        System.out.println(""+number01+" + "+number02+" = "+sum);
        System.out.println(""+number01+" - "+number02+" = "+dif);
        System.out.println(""+number01+" * "+number02+" = "+mul);
        System.out.println(""+number01+" / "+number02+" = "+div);


    }

    private static double firstNumber() {

        System.out.print("What is the first number? ");
        String numberInput01 = in.nextLine();
        double number01 = Integer.parseInt(numberInput01);
        return number01;
    }

    private static double secondNumber() {

        System.out.print("What is the second number? ");
        String numberInput02 = in.nextLine();
        double number02 = Integer.parseInt(numberInput02);
        return number02;

    }



}
