/* Objectives: The triangle farmer

Write a program that lets you input the triangle’s base size and height.
Compute the area of a triangle by turning the below equation into code.
Write the result of the computation.

Area = base x height / 2
 */

package Challenge8;

import java.util.Scanner;

public class playersGuide8 {
    public static void main (String[] args) {

    Scanner meten = new Scanner (System.in);

    System.out.println(" enter base size");
    int base = meten.nextInt();

    System.out.println ("enter height size");
    int height = meten.nextInt();

    int multi = base * height;

    System.out.println(" the Area of the triangle is:" + multi/2 );

    }
}
