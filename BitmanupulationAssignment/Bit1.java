package BitmanupulationAssignment;
import java.util.*;
public class Bit1 {
    public static void getIthbit(int n ,int i){ 
        int bitmaskt=1<<i; 
        System.out.print(bitmaskt&n);

    }
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int n=sc.nextInt(); 
        System.out.print("Enter the ith position");
        int i=sc.nextInt();
        getIthbit(n,i);



    }
}
