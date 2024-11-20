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

        int i = 8;
        int b;
        int[] replicator = new int[i];     // begin array 1
        int a = 1;

        for ( b = 0; b < replicator.length; b++){

            replicator[b] = a;

            System.out.print(replicator[b]);
            a++;

        }



    }
}
