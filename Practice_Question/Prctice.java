package Practice_Question;

public class Prctice 
{
    public static void printAdd(int arr[])
    {  
        int buy=arr[0]; 
        int totlprf=0; 
      
    for(int i=1;i<arr.length-1;i++)
    { 
       if(buy<arr[i]){
        int profit=arr[i]-buy; 
        int allprofit=Math.max(profit, totlprf); 
        totlprf=allprofit;

       }  
       else{
        buy=arr[i+1];
       }


    } 
    System.out.print("Total Profit ="+totlprf);
    }
    public static void main(String args[])
    { 
        int arr[]={7,1,5,3,6,4};
        printAdd(arr);
    }  
    
    
}
