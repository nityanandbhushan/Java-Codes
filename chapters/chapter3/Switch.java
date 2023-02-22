package chapters.chapter3;

import java.util.*;

public class Switch { 
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int number =sc.nextInt();

    switch(number) 
    { 
        case 1: System.out.println("you pressing 1 number"); 
           break; 
        case 2: System.out.println("You pressing 2 number"); 
           break; 
        case 3: System.out.println("You pressing 3 number"); 
            break; 
        default : System.out.println("you pressing the unknown number of threes");

    }
    
} 
}
