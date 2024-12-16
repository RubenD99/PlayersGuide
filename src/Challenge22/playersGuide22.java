/*Challenge 22: Hunting the Manticore
Objectives:

Establish the game’s starting state: the Manticore begins with 10 health points and the city with 15.
The game starts at round 1.
Ask the first player to choose the Manticore’s distance from the city (0 to 100). Clear the screen
afterward.
Run the game in a loop until either the Manticore’s or city’s health reaches 0.
Before the second player’s turn, display the round number, the city’s health, and the Manticore’s
health.
Compute how much damage the cannon will deal this round: 10 points if the round number is a
multiple of both 3 and 5, 3 if it is a multiple of 3 or 5 (but not both), and 1 otherwise. Display this to
the player.
Get a target range from the second player, and resolve its effect. Tell the user if they overshot (too
far), fell short, or hit the Manticore. If it was a hit, reduce the Manticore’s health by the expected
amount.
If the Manticore is still alive, reduce the city’s health by 1.
Advance to the next round.
When the Manticore or the city’s health reaches 0, end the game and display the outcome.
Use different colors for different types of messages.
Note: This is the largest program you have made so far. Expect it to take some time!
Note: Use methods to focus on solving one problem at a time.
Note: This version requires two players, but in the future, we will modify it to allow the computer
to randomly place the Manticore so that it can be a single-player game.

 */

package Challenge22;


import java.util.Scanner;

public class playersGuide22 {
    int shots = 0;
    int mantHealth = 10;
    int cityHealth = 15;



    public static void main(String[] args) {

        playersGuide22 varis = new playersGuide22();
        Scanner input = new Scanner(System.in);

        System.out.println(distanceFromCity());
        spaces();

        for (int ronden = 0; varis.mantHealth >= 0; ronden++ ) {
            System.out.print("Ronden : " + ronden + "\n");
            System.out.print("City Health : " + varis.cityHealth );
            System.out.print(" Manticore Health : " + varis.mantHealth + "\n");


            //System.out.println(cannon(varis.shots));


            //varis.shots++;

            varis.mantHealth--;
        }
    }


    static int distanceFromCity (){
                                                                    // methode voor het vragen van de afstand van het schip
        Scanner input = new Scanner(System.in);

        System.out.println(" wat is de afstand van het schip? (geef nummer tussen 0 - 100");
        int distance = input.nextInt();
        do {

            System.out.println("gekozen afstand is niet correct. \n kies een nieuwe afstand tussen 0 - 100");
            distance = input.nextInt();


        }while (distance < 0 || distance > 100);

        return distance;
    }


    static void spaces (){
        for (int i = 0; i <= 50; i++){          // methode voor het legen van de scherm
            System.out.println(" ");

        }
    }

    static int vraagAfstand (int afstand){

        return afstand;
    }



    static String cannon (int schoten){
                                                    // shots and damage

        int rate3 = schoten % 3;
        int rate5 = schoten % 5;

        if (rate3 == 0 && rate5 == 0){
            return "10 damage";
        }else {


            if (rate3 == 0) {
            return "3 damage";
            } else if (rate5 == 0) {
            return "3 damage";
            }
        }
        return "1 damage";
    }


}

/*
 playersGuide22 game = new playersGuide22();
        game.setDistance();
        spaces();
        game.cannon();
 */
/*playersGuide22 game2 = new playersGuide22();
        game2.setDistance();
        spaces(); */
// if args.length != 0
//   throw tooManyArgsException
//
// Program program = new Program
// program.run();
// program.shutdown()