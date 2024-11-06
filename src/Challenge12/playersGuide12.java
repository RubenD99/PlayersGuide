/*Objectives:   Repairing the Clocktower

Take a number as input from the console.
Display the word “Tick” if the number is even. Display the word “Tock” if the number is odd.
Hint: Remember that you can use the remainder operator to determine if a number is even or odd.

 */

package Challenge12;

import java.util.Scanner;

public class playersGuide12 {
    public static void main (String[] args) {

        Scanner inputNumber = new Scanner (System.in);      // Scanner object aangemaakt voor nummer input

        System.out.println(" What number?");

        int clockNumber = inputNumber.nextInt();

        System.out.println(" the chosen number is: " + clockNumber);

        int tickTock = clockNumber%2;

        if (tickTock > 0){
            System.out.println("Tock");
        } else{
            System.out.println("Tick");

        }

    }
}
