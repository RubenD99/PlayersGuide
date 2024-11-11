/*Objectives:

Modify your program from before to also ask the user for their name.
If their name equals your name, divide the cost in half.
 */

package Challenge15;

import java.util.Scanner;

public class playersGuide15 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Shop menu:  \n 1 Rope \n 2 Torches \n 3 Climbing Equipment \n 4 Clean Water \n 5 machete \n 6 Canoe \n 7 Food Supplies");

        System.out.println("What is your name? ");
        String userName = input.nextLine();



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
