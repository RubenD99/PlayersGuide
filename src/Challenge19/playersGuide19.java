/*Objectives:       Challenge 19: The Laws of Freach

Start with the code for computing an array’s minimum and average values (see below)

int[] array = { 4, 51, -7, 13, -99, 15, -8, 45, 90 };
int currentSmallest = Integer.MAX_VALUE; // Start higher than anything in the array.
for (int index = 0; index < array.length; index++)
{
    if (array[index] < currentSmallest)
        currentSmallest = array[index];
}
System.out.println(currentSmallest);

int total = 0;
for (int index = 0; index < array.length; index++)
    total += array[index];
double average = (double)total / array.length;
System.out.println(average);

Modify the code to use foreach loops instead of for loops
 */


package Challenge19;

import java.util.Arrays;
import java.util.Iterator;

public class playersGuide19 {
    public static void main(String[] args) {


        int[] array = { 4, 51, -7, 13, -99, 15, -8, 45, 90 };       // Array met int waardes
        int currentSmallest = Integer.MAX_VALUE;            // Start higher than anything in the array.

        /*for (int i = 0; i < array.length; i++) {
            int value = array[i];
            {

            }
        }*/

        //Iterator<Integer> ints = Arrays.stream(array).iterator();

        /*while (ints.hasNext()) {
            System.out.println(ints.next());
        } */

        // for (int index = 0; index < array.length; index++)
        for ( int value : array)          // for loop die met index waardes telt en doorgaat to lengte van de array
        {
            // int value = array[index];
            if (value < currentSmallest)             // als de array waarde kleiner is dan currentSmallest dan
                currentSmallest = value;             // wordt current smallest de array waarde

        }
        System.out.println(currentSmallest);                // print de current smallest

        int total = 0;                                          // zet total op 0;
        for (int waarde : array)          // for loop, telt met index en gaat door tot einde van array
            total += waarde;                                  // totaal wordt waarde van array index
        double average = (double)total / array.length;              // avarage wordt berekend met totaal en array lengte
        System.out.println(average);                                // print avarage

    }
}