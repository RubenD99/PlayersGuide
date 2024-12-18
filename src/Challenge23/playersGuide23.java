/*Challenge 23: Simula’s Test
Objectives:

The box can be in three states:
if the box is in the OPEN state, you can close it, and it becomes CLOSED
if the box is in the CLOSED state, you can open it, and it becomes OPEN
if the box is in the CLOSED state, you can lock it, and it becomes LOCKED
if the box is in the LOCKED state, you can unlock it, and it becomes CLOSED

Nothing happens if you attempt an impossible action in the current state, like opening a locked box.
The program below shows what using this might look like:

The chest is locked. What do you want to do? unlock
The chest is unlocked. What do you want to do? open
The chest is open. What do you want to do? close
The chest is unlocked. What do you want to do?

Define an enumeration for the state of the chest.
Make a variable whose type is this new enumeration.
Write code to allow you to manipulate the chest with the lock, unlock, open, and close
commands, but ensure that you don’t transition between states that don’t support it.
Loop forever, asking for the next command.
*/

package Challenge23;

import java.util.Scanner;

public class playersGuide23 {


    enum BoxState{
        OPEN,
        CLOSED,
        LOCKED,
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        playersGuide23 refObj = new playersGuide23();

        BoxState variable = BoxState.LOCKED;

        System.out.println("open, closed or locked? : ");
        String modBox = input.nextLine();

        switch(modBox.toUpperCase()){
            case "OPEN":
                variable = BoxState.OPEN;
                break;
            case "CLOSED":
                variable = BoxState.CLOSED;
                break;
            case "LOCKED":
                variable = BoxState.LOCKED;
                break;
        }

        refObj.Switchbox(variable);

    }


    void Switchbox (BoxState variable){

        switch(variable){
            case OPEN:
                System.out.println("Box is Open");
                break;
            case CLOSED:
                System.out.println("Box is closed");
                break;
            case LOCKED:
                System.out.println("Box is locked");
                break;
        }

    }



}
