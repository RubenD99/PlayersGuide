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

        float value;
        float multiplier = 1;


        if(userName.equalsIgnoreCase ("Ruben")){
            multiplier = 0.5f;

        }

        System.out.println("What item do you want?");
        int choice = input.nextInt();

        switch (choice){
            case 1:
                value = 10 * multiplier;
                System.out.println("Rope:" + value + "Gold");
                break;
            case 2:
                value = 15 * multiplier;
                System.out.println("Torches: " + value + " Gold");
                break;
            case 3:
                value = 25 * multiplier;
                System.out.println("Climbing Equipment:"+ value + " Gold");
                break;
            case 4:
                value = 1 * multiplier;
                System.out.println("Clean water: "+ value +"  Gold");
                break;
            case 5:
                value = 20 * multiplier;
                System.out.println("Machete: "+ value +"  Gold");
                break;
            case 6:
                value = 200 * multiplier;
                System.out.println("Canoe "+ value +" Gold");
                break;
            case 7:
                value = 1 * multiplier;
                System.out.println("Food Supplies: " + value + "Gold");
                break;
            default:
                System.out.println("we don't have that");
                break;
        }
    }
}