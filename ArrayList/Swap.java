package ArrayList;
import java.util.*;
public class Swap { 
    public static void swapingNumber(ArrayList<Integer>list,int idx1,int idx2){  
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp); 
        for(int i=0;i<list.size();i++){ 
            System.out.print("["+list.get(i)+" "+"]");
        }

        
    } 

 
    public static void main(String args[]){ 
        ArrayList<Integer> list=new ArrayList<>(); 
        list.add(1);
        list.add(9); 
         list.add(5);
        list.add(4); 
         list.add(2);
        list.add(7); 
        for(int i=0;i<list.size();i++){ 
            System.out.print("["+list.get(i)+"]");
            System.out.print("");
        } 
        swapingNumber(list,2,4);
    }
}
