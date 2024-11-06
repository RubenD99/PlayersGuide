/*Objectives: Consolas and Telim

Make a program that runs as shown below, including taking a name from the user
A sample run of this program looks like this:

Bread is ready.
Who is the bread for?
RB
Noted: RB got bread.
 */

package Challenge4;

import java.util.Scanner; // import the scanner class

public class playersGuide4 {
    public static void main (String[] args) {
        Scanner breadForWho = new Scanner(System.in); // create scanner object
        System.out.println(" bread is ready");
        System.out.println(" Who is the bread for?");

        String name = breadForWho.nextLine();       // Read user input
        System.out.println(" Noted: " + name + " got bread"); // output user input
    }
}
