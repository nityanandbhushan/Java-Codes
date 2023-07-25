package ArrayList;
import java.util.ArrayList; 
import java.util.Collections;
public class Sorting {
    public static void main(String argss[]){  
    ArrayList<Integer> list=new ArrayList<>();
    list.add(8);
     list.add(4); 
      list.add(9); 
       list.add(1); 
       for(int i=0;i<list.size();i++){ 
        System.out.print(list.get(i)); 
       } 
          System.out.println();
       Collections.sort(list);  
        for(int i=0;i<list.size();i++){ 
        System.out.print(list.get(i));
    }  
          System.out.println(); 
       Collections.sort(list,Collections.reverseOrder());  
         for(int i=0;i<list.size();i++){ 
        System.out.print(list.get(i));  
       }  
    }
}
