/*  Challenge 21: Countdown
Rewrite the following code, which counts down from 10 to 1, with no loops:

for (int x = 10; x > 0; x--)
 System.out.println(x);
 */


package Challenge21;

public class playersGuide21 {
    public static void main(String[] args) {

    int countDown = minus(10);


    }

    static int minus(int x){
        if (x > 0){
            System.out.println(x);
            return x - minus( x - 1 );
        }
        else {
            return 0;
        }
    }
}
