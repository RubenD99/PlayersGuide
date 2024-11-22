/*Objectives:       Day 14 Challenge: Challenge The Replicator of D’To

Make a program that creates an array of length 5.
Ask the user for five numbers and put them in the array.
Make a second array of length 5.
Use a loop to copy the values out of the original array and into the new one.
Display the contents of both arrays one at a time to illustrate that the Replicator of D’To works again.

 */

package Challenge18;

import java.util.Scanner;

public class playersGuide18 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int i = 5;
        int b;
        int[] replicator = new int[i];     // begin array 1
        int a = 5;

        System.out.println("Maak eerste Array, geef 5 numers :");

        for ( b = 0; b < replicator.length; b++){           // maak eerste array met scanner

            System.out.println("give single number");
            int number = input.nextInt();

            replicator[b] = number;

        }

        System.out.println("eerste array:");
        for (int f : replicator){           // print eerste volledige array met for each loop
            System.out.print(f);
        }

        System.out.println("\nnext array");

        int SecondLength = 5;
        int[] array2 = new int[SecondLength];
        int c;

        for( c = 0; c < array2.length; c++){        // copy de waardes van de eerste array over naar de tweede array

            array2[c] = replicator[c];

            System.out.print(array2[c]);

        }

    }
}
