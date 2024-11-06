/*Objectives:   variable shop returns

Modify your Variable Shop program to assign a new, different literal value to each of the 9 original
variables. Do not declare any additional variables.
Use System.out.println to display the updated contents of each variable. */

package Challenge7;

public class playersGuide7 {
        public static void main (String[] args) {

            int interger = 4;
            byte bYte = 1;
            short kort = 2;
            long lang = 8;
            float drijf = 9.995f;
            double dubbel = 15;
            boolean boo = true;
            char kar = 'a';
            String text = "variableShop";

            interger = 6;
            System.out.println( "updated int is: " + interger);
            bYte = 2;
            System.out.println(" updated byte is:"+ bYte);
            kort = 4;
            System.out.println(" updated short is " + kort);
            lang = 16;
            System.out.println(" updated long is " + lang);
            drijf = 18.880f;
            System.out.println(" updated float is " + drijf);
            dubbel = 30;
            System.out.println(" updated double is " + dubbel);
            boo = false;
            System.out.println ("updated boolean is " + boo);
            kar = 'b';
            System.out.println ("updated char is " + kar);
            text = "updatedShop";
            System.out.println ("updated string is " + text);

        }
}
