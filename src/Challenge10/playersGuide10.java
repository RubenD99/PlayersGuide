/*Objectives:    The Dominion of Kings

Create a program that allows users to enter how many provinces, duchies, and estates they have.
Add up the user’s total score, giving 1 point per estate, 3 per duchy, and 6 per province.
Display the point total to the user.

 */

package Challenge10;

import java.util.Scanner;

public class playersGuide10 {
    public static void main (String[] args) {

    Scanner userInput = new Scanner (System.in);       //Scanner aangemaakt voor input van users

    System.out.println("How many estates do you have? ");
    int estate = userInput.nextInt();
    System.out.println("estates is : " + estate);

    System.out.println("How many duchy's do you have? ");
    int duchy = userInput.nextInt();
    System.out.println ("duchy's is :" + duchy);

    System.out.println (" how many provinces do you have?");
    int province = userInput.nextInt();
    System.out.println ("provinces is : " + province);


    int pointEstate = estate * 1;
    int pointDuchy = duchy * 3;
    int pointProvince = province * 6;

    System.out.println ("points for provinces :" + pointProvince);
    System.out.println("Points for estates :" + pointEstate);
    System.out.println("Points for duchy's :" + pointDuchy);

    int totalPoints = pointEstate + pointDuchy + pointProvince;

    System.out.println ("Your total points are:" + totalPoints);

    }
}
