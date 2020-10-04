package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int firstNumber = 4;
        int secondNumber = 3;

        // inferred type ok here as there is an assignment
        var result = 7;

        System.out.println("Think of a number between 1 and 10. Press ENTER when ready");
        myScanner.nextLine();
        myScanner.close();
    }
}
