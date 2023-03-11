package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java;
import java.util.*;
public class shoritS { 
    public static int bi_sear(int arr[],int key){ 
        int start=0; int end=arr.length-1;  

        while(start<=end){ 
            int mid=(start+end)/2;  
            if(arr[mid]==key){ 
                return mid;
            } 
            if(arr[mid]<key){ 
                start=mid+1;
            } 
            else{ 
                end=mid-1;
            }  
            return -1;
    
            
        }  

    }
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the number");  
        int key=sc.nextInt();

        int arr[]={3,4,7,23,45,98,67,45,243};
       int sim= bi_sear(arr,key); 
       System.out.println(sim);

    }
    
}
