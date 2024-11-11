/*Objectives:   1 of 2: Buying Inventory

1 Rope
2 Torches
3 Climbing Equipment
4 Clean Water
5 Machete
6 Canoe
7 Food Supplies

Rope: 10 gold, Torches: 15 gold, Climbing Equipment: 25 gold, Clean Water: 1 gold, Machete: 20 gold, Canoe: 200
gold, Food Supplies: 1 gold.

Build a program that will show the menu illustrated above.
Ask the user to enter a number from the menu.
Using the information above, use a switch (either type) to show the item’s cost.

 */

package Challenge14;

import java.util.Scanner;

public class playersGuide14 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Shop menu:  \n 1 Rope \n 2 Torches \n 3 Climbing Equipment \n 4 Clean Water \n 5 machete \n 6 Canoe \n 7 Food Supplies");

        System.out.println("What item do you want?");
        int choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println("Rope: 10 Gold");
                break;
            case 2:
                System.out.println("Torches: 15 Gold");
                break;
            case 3:
                System.out.println("Climbing Equipment: 25 Gold");
                break;
            case 4:
                System.out.println("Clean water: 1 Gold");
                break;
            case 5:
                System.out.println("Machete: 20 Gold");
                break;
            case 6:
                System.out.println("Canoe 200 Gold");
                break;
            case 7:
                System.out.println("Food Supplies: 1 Gold");
                break;
            default:
                System.out.println("we don't have that");
                break;
        }
    }

}
