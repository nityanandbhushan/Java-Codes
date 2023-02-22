package pracitceRough;
//import java.util.*;
public class Insertion { 
    public static void insertion_sort(int arr[]){ 
        for(int i=1;i<arr.length;i++){ 
            int curr=i; 
            int prev=i-1; 
           while(prev>=0 && arr[prev]>arr[curr]){ 
              arr[prev+1]=arr[prev];  
              prev--;

            } 
            arr[prev+1]=arr[curr];
            
        } 
        for(int i=0;i<arr.length;i++){ 
            System.out.print(arr[i]);
        }
    }  
    public static void counting_arr(int arr[]){  
        int maxim=Integer.MIN_VALUE; 
        for(int i=0;i<arr.length;i++){
            maxim=Math.max(maxim,arr[i]); 
        } 
        int count[]=new int[maxim+1]; 
        for(int i=0;i<arr.length;i++){ 
            count[arr[i]]++;

        }  
        int j=0; 
        for(int i=0;i<count.length;i++){ 
        while(count[i]>0){ 
            arr[j]=i; 
            j++; 
            count[i]--;
        } 
    } 
    for(int i=0;i<arr.length;i++){ 
        System.out.print(arr[i]);
    }

    }

    public static void main(String args[]){ 
        int arr[]={5,4,3,2,1,1,2,3,4}; 
        insertion_sort(arr);
    }
    
}
