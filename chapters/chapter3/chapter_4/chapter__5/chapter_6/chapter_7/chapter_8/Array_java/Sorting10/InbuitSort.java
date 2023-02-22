package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java.Sorting10;
import java.util.Arrays; 
import java.util.Collections;
public class InbuitSort { 
    public static void printf(Integer arr[]){ 
        for(int i=0;i<arr.length;i++){ 
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){  
        Integer arr[]={4,5,7,2,9,8};  
        //// sorting using sorting function in ascending...................................
        //use there soritng function  
        //Arrays.sort(arr);  
        //use there sorting from indexin bases 
       // Arrays.sort(arr,2,arr.length);  
        ///// sorting using sorting function in descending.................................  
        Arrays.sort(arr,Collections.reverseOrder());  
        //use there sorting from indexin bases 
        Arrays.sort(arr,3,arr.length,Collections.reverseOrder(null));


        printf(arr);
        
         


    }
}
