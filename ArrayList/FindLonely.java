package ArrayList;
import java.util.Arrays;
public class FindLonely { 
    public static void printLonelyarr(int arr[]){   
        Arrays.sort(arr);   
        int j=0;
        //5,6,8,10
        int arr1[]=new int[arr.length];
        for(int i=1;i<arr.length-1;i++){   
            if(arr[i-1]+1<arr[i]&& arr[i]+1<arr[i+1]){  
                arr1[j]=arr[i]; 
                j++;

            } 
        } 
        if(arr.length==1){ 
            arr1[j]=arr[0];
        }  
        for(int k=0;k<arr1.length;k++)
        {  
            System.out.print(arr1[k]);

        }
    }
    public static void main(String args[]){ 
        int arr[]={10,6,5,8}; 
        printLonelyarr(arr);


    }
    
}
