package PracticeQuestionOfAlpha; 
//import java.util.*;

public class StockSellBuy { 
    public static void findingMaxprof( int arr[]){ 
        int buyp=arr[0];   
        int max=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){   
            if(buyp>arr[i]){ 
                 buyp=arr[i];
            }  
            else{ 
                int profit=arr[i]- buyp; 
                max=Math.max(max,profit);
            } 




        } 
        System.out.print("Maximum price of the stock"+max);
       

    } 
    public static void main(String args[]){ 
        int arr[]={7,1,5,3,6,4};  
        findingMaxprof(arr);

    }
    
}
