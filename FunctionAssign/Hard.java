package FunctionAssign;
import java.util.*; 
import java.util.Arrays;
public class Hard {
    public static void main(String args[]){ 
        int arr1[]={1,2,3,4,5,6,7}; 
        int arr2[]={8,9,10,11,12,13}; 
        // int len=arr1.length+arr2.length; 
        // int arr3[]=new int[len];  
        // for(int i=0;i<arr3.length;i++){ 
        //     arr3[i]=arr1[i]; 
        //     if(i==arr1.length-1){ 
        //         i++;
        //         for(int j=0;j<arr2.length;j++){ 
        //             arr3[i]=arr2[j];
        //             i++;
        //         }
        //     }
        // } 
        // for(int i=0;i<arr3.length;i++){ 
        //     System.out.print(arr3[i] + " ");
        // }  
        int arr1l=arr1.length; 
        int arr2l=arr2.length;

    int len=arr1l+arr2l;
    int arr3[]=new int[len];   
    System.arraycopy(arr1,0,arr3,0,arr1l); 
    System.arraycopy(arr2, 0, arr3, arr1l, arr2l); 

    for(int i=0;i<arr3.length;i++){ 
        System.out.print(arr3[i] +" ");
    }  
    System.out.println(" ");
     
    int mid=len/2; 
    if(mid%2!=0){ 
        System.out.println(arr3[mid+1]); 

    } 
    else{ 
        int sum=arr3[mid]+arr3[mid+1]; 
        System.out.println(sum);
    }
 
    }  
}
