/*Objectives: Challenge 20: Taking a Number

Make a method with the signature int askForNumber(String text). Display the text parameter in the console window, get a response from the user,
convert it to an int, and return it. This might look like this: int result = askForNumber(“What is the airspeed velocity
of an unladen swallow?”);. Make a method with the signature int askForNumberInRange(String text, int min, int max).
Only return if the entered number is between the min and max values. Otherwise, ask again.
Place these methods in at least one of your previous programs to improve it.
*/

package Challenge20;

import java.util.Scanner;


public class playersGuide20 {

    public static void main(String[] args) {

        int min = 50;
        int max = 105;

        askForNumber("Geef een nummer : ");

        askForNumberInRange("Een nummer in range : ",min,max);

    }


    static int askForNumber(String text){

        Scanner input = new Scanner(System.in);
        System.out.println(text);
        int GekozenNummer = input.nextInt();


        return GekozenNummer;
    }

   static int askForNumberInRange(String text, int min, int max ){

        int Smin = min;
        int Smax = max;

       System.out.println(text);
       Scanner input = new Scanner(System.in);
       int GekozenNummer = input.nextInt();

       do {
        System.out.println(" Gekozen nummer buiten range\nkies een nieuwe nummer");
        GekozenNummer = input.nextInt();

       }while (GekozenNummer < Smin || GekozenNummer > Smax);

       return GekozenNummer;
    }
}