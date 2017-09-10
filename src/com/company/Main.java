package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int number = 0;  //declare and initialize variable
        String numString = "";  //declare and initialize string variable

        Scanner scanner = new Scanner(System.in);  //create scanner to read user input

        System.out.println("Enter a whole number between 1-10: ");  //prompt user for input
        number = scanner.nextInt();  //get number as an Int

        switch (number){
            case 1: numString = "een";
                break;
            case 2: numString = "twee";
                break;
            case 3: numString = "drie";
                break;
            case 4: numString = "vier";
                break;
            case 5: numString = "vijf";
                break;
            case 6: numString = "zes";
                break;
            case 7: numString = "zeven";
                break;
            case 8: numString = "acht";
                break;
            case 9: numString = "negen";
                break;
            case 10: numString = "tien";
                break;
            default: numString = "That was an invalid entry";
                System.out.println(numString);
                System.exit(0);
         }

         System.out.println("The number " + number + " is " + numString + " in Dutch.");



    }
}
