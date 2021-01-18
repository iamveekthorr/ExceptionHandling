package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber = 100;
        int userInput = 0 ;
        System.out.print("Enter a divisor: ");

        try {
            userInput = input.nextInt();
            int answer = firstNumber/userInput;
        }catch (java.util.InputMismatchException e){
            System.out.print("This is the user input: " + userInput);
        }


    }
    public AppError handleInputMismatchException(){
        String message = "Input Mismatch";
        return new AppError(message);
    }
}
