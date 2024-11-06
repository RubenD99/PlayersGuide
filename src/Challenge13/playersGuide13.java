/*Objectives:       Watchtower

Ask the user for an x value and a y value. These are coordinates of
the enemy relative to the watchtower’s location. Positive x-values are east, positive y-values are north (as they would be on a normal graph)
Using if statements and relational operators, display a message about what direction the enemy is coming from. For example, “The enemy is to the northwest!” or “The enemy is here!

 */

package Challenge13;

import java.util.Scanner;


public class playersGuide13 {
    public static void main(String[] args) {

        Scanner userValue = new Scanner(System.in);

        System.out.println("please give a x value ");
        int xValue = userValue.nextInt();

        System.out.println("please give a y value ");
        int yValue = userValue.nextInt();

        System.out.println(" enemy coordinates (" + xValue + ","+ yValue + ")");

        String xString;
        String yString;

        if (xValue > 0 ){
            xString = "east";
        } else if (xValue < 0) {
            xString = "west";
        } else {
            xString = "here";
        }

        if (yValue > 0){
            yString = "north";
        } else if (yValue <0 ){
            yString = "south";
        } else {
            yString = "here!";
        }

        System.out.println("the enemy is " + xString + yString);
    }
}
