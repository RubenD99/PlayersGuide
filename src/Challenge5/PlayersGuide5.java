// Challenge 5 the thing namer
package Challenge5;

import java.util.Scanner;


public class PlayersGuide5 {
    public static void main(String[] args) {

        System.out.println("What kind of thing are we talking about?");
        Scanner input = new Scanner(System.in);
        String a = input.next();        // the thing
        System.out.println("How would you describe it? Big? Azure? Tattered?");
        String b = input.next();        //description
        String c = "Doom";       // added title
        String d = "3000";          // number
        System.out.println("The " + b + " " + a + " of " + c + " " + d + "!");

    }
}