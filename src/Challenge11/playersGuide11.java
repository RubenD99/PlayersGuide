/*Objectives:       The Defense of Consolas
Something like this:

Target Row? 6
Target Column? 5
Deploy to:
(6, 4)
(5, 5)
(6, 6)
(7, 5)

Ask the user for the target row and column.
Compute the neighboring rows and columns of where to deploy the squad.
Display the deployment instructions in a different color of your choosing.
Play a sound with Toolkit.getDefaultToolkit().beep(); when the results have been computed and displayed.

 */
package Challenge11;

import java.awt.Toolkit;
import java.util.Scanner;


public class playersGuide11 {
    public static void main (String[] args) {

       Scanner targetInput = new Scanner(System.in);        // Scanner object gemaakt voor target input

       System.out.println("Target row? ");
       int targetRow = targetInput.nextInt();
       System.out.println("Target column? ");
       int targetColumn = targetInput.nextInt();

       System.out.println("Deploy defenders to:");

       int defender1Row = targetRow +1;
       int defender1Column = targetColumn;

       int defender2Row = targetRow -1;
       int defender2Column = targetColumn;

       int defender3Row = targetRow;
       int defender3Column = targetColumn + 1;

       int defender4Row = targetRow;
       int defender4Column = targetColumn -1;

       String RESET = "\033[0m";        //Variable met code voor reset van Kleur
       String RED = "\033[0;31m";       //Variable met code voor kleur rood
       String BLUE = "\033[0;34m";      //Variable met code voor kleur blauw

        System.out.println(RED + "( "+ defender1Row + "," + defender1Column + " )" + RESET);
        System.out.println(BLUE + "( "+ defender2Row + "," + defender2Column + " )" + RESET);
        System.out.println(RED + "( "+ defender3Row + "," + defender3Column + " )" + RESET);
        System.out.println(BLUE + "( "+ defender4Row + "," + defender4Column + " )" + RESET);
        Toolkit.getDefaultToolkit().beep();
    }
}
