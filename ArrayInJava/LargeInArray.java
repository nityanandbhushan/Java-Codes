package ArrayInJava;

public class LargeInArray {
    public static int findlargest_Number(int arr[]){  
        int largest=Integer.MIN_VALUE;  
        for(int i=0;i<arr.length-1;i++)
        {
            if(largest<arr[i]) 
            { 
                largest=arr[i+1];
            }

        }  
       return largest;

    }
    public static void main(String args[]){ 
        int arr[]={1,23,4,5,6,7,8};  
        int lar=findlargest_Number(arr); 
        System.out.println(lar);
        
        
    }
}
