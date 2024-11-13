/*Objectives:   Day 13 Challenge: The Magic Cannon

Write a program that will loop through the values between 1 and 100 and display what kind of blast
the crew should expect. (The % operator may be of use.)
Change the color of the output based on the type of blast. (For example, red for Fire, yellow for
Electric, and blue for Electric and Fire).

Every third turn of a crank, the fire gem activates, and the cannon
produces a fire blast. The electric gem activates every fifth turn of the crank, and the cannon makes an
electric blast. When the two line up, it generates a potent combined blast.

1: Normal
2: Normal
3: Fire
4: Normal
5: Electric
6: Fire
7: Normal

 */

package Challenge17;

public class playersGuide17 {
    public static void main(String[] args) {

        int value;


        for (value = 1; value <= 100; value++){         // for loop voor alle waardes
            System.out.print(value + " : ");            // print waarde

            int third = value%3;
            int fifth = value%5;

            String RESET = "\033[0m";               // reset kleur
            String RED = "\033[0;31m";              // variable voor kleur rood (online gevonden)
            String YELLOW = "\033[0;33m";            // kleur geel (online gevonden)
            String BLUE = "\033[0;34m";                 // Kleur blauw (online gevonden)

            if (third == 0 && fifth ==0){               // als het een derde en vijfde crank is
                System.out.println(BLUE + " Blue shot" + RESET);
            }else {


                if (third == 0) {                       // als alleen derde crank is
                    System.out.println(RED + " FIRE third crank" + RESET);
                } else if (fifth == 0) {                // als alleen vijfde crank is
                    System.out.println(YELLOW + " ELECTRIC fifth crank" + RESET);
                } else {                        // anders normal
                    System.out.println(" Normal");
                }

            }

        }
    }
}
