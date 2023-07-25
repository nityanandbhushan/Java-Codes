package chapterString;
import java.lang.String;
public class Substring { 
    public static void main(String args[]){ 
        String fruits[]={"mango","apple","banana","zgrapse"};
        String largest=fruits[0]; 
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0)
            {   
                largest=fruits[i];
               
    
            }
        } 
        System.out.print(largest);



    }
   
}
