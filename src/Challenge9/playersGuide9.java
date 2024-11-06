/*Objectives: The Four Sisters and the Duckbear

Create a program that lets the user enter the number of chocolate eggs gathered that day.
Using / and %, compute how many eggs each sister should get and how many are left over for the
duckbear.
Answer this question: What are the total egg counts where the duckbear gets more than each
sister does? You can use the program you created to help you find the answer. */


package Challenge9;

import java.util.Scanner;


public class playersGuide9 {
    public static void main (String[] args) {
        Scanner howManyEggs = new Scanner (System.in);
        System.out.println(" How many eggs in total have the sisters gathered?");

        int gatheredEggs = howManyEggs.nextInt();
        System.out.println("the sisters have gathered: " + gatheredEggs + " total");
        System.out.println("divided bij 4 means " + gatheredEggs/4 + " whole eggs per sister");
        System.out.println(" That is " + gatheredEggs%4 + " eggs for the duckbear");

        int perSister = gatheredEggs/4;
        int eggsDuckbear = gatheredEggs%4;

        System.out.println("per sister: " + perSister + "for duckbear: " + eggsDuckbear);

        for(int totalEggs = 1; totalEggs <= 200; totalEggs ++) {        //loop for totalcount of eggs

            int eggsSister = totalEggs/4;           // whole eggs per sister
            int eggsBear = totalEggs%4;             //remaining eggs for bear

            if (eggsBear > eggsSister)              // if bear gets more eggs than each sister print
            System.out.println("at" + totalEggs + " duckbear gets more eggs than each sister" + " eggsBear:"+ eggsBear + " eggsSister:" + eggsSister);
            else{

            }
        }



    }
}
