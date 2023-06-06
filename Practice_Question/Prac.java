package Practice_Question; 
import java.util.*;
import java.util.Arrays;

public class Prac { 
    public static void printCountingsort(int arr[])
    { 
        int larg=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {  
            larg=Math.max(larg, arr[i]);


        }  
        int count[]=new int[larg+1];
        for(int i=0;i<arr.length;i++)
        {  
            count[arr[i]]++;

        } 
        int i=0;
        for(int j=0;j<count.length;j++){  
            while(count[j]>0)
            { 
                arr[i]=j;
                i++;
                count[i]--;
                
            }

        } 
        for(int k=0;k<arr.length;k++){  
            System.out.print(arr[k]);

        }



    }

    

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2,1,6,6,7,8,9,9 }; 
        printCountingsort(arr);
        
        
    }
}
