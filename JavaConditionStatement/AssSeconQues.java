/* 
Question2: 
FinishthefollowingcodesothatitprintsYouhaveafeverifyourtemperatureis above 100 and otherwise prints You don't have a fever. */
package JavaConditionStatement;

import java.util.*;

public class AssSeconQues {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature");
        int temp = sc.nextInt();
        if (temp > 100) {

            System.out.println("You hava Fever");
        } else {
            System.out.println("You Don't hava fever");
        }

    }

}
