package Backtracking;

public class BackTracOnArr { 
    public static void printArray(int arr[]){ 
        for(int i=0;i<arr.length;i++){ 
            System.out.print(arr[i]);
        }
     }
    public static void backtracking(int arr[] , int i,int j){   
        if(i==arr.length){ 
            printArray(arr);
            return;
        }  
        arr[i]=j;
        backtracking(arr,i++,j++);
        arr[i]=arr[i]-2;
    } 

    public static void main(String args[]){ 
        int arr[]=new int[5]; 
        backtracking(arr ,0 ,1);
        printArray(arr);


    }
}
