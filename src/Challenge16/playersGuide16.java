/*Objectives:       Day 12 Challenge: The Prototype

Build a program that will allow a user, the pilot, to enter a number.
If the number is above 100 or less than 0, keep asking.
Clear the screen once the program has collected a good number (you can just write 50 blank lines to clear the screen :) ).
Ask a second user, the hunter,to guess numbers.
Indicate whether the user guessed too high, too low, or guessed right.
Loop until they get it right, then end the program.
 */


package Challenge16;


import java.util.Scanner;

public class playersGuide16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pilotNav;
        int hunterGuess;

        do {


            System.out.println("pilot enter a number between 0 and 100 : ");        // vraag naar pilot number
            pilotNav = input.nextInt();

            if (pilotNav < 0) {
                System.out.println(" given number is to low \n choose a new number");

            } else if (pilotNav > 100) {
                System.out.println("given number is to high \n choose a new number");

            } else {

                for (int i = 0; i < 50; i++) {
                    System.out.println("  \n");         // maak scherm leeg
                }
            }
        } while (pilotNav < 0 || pilotNav > 100);       // || returns true if one of the statements is correct.


        do {
            System.out.println(" Hunter guess what number the pilot has chosen : ");        // vraag naar hunter nummer
            hunterGuess = input.nextInt();

            if (hunterGuess < pilotNav){
                System.out.println("too Low \n guess again : ");

            } else if (hunterGuess > pilotNav) {
                System.out.println("too High \n guess again : ");
            } else {
                System.out.println(" target found \n Game End");
                return;
            }

        }while (hunterGuess < pilotNav || hunterGuess > pilotNav);      // || returns true is one of the statements is correct.
    }
}
