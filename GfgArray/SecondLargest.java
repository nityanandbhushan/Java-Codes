package GfgArray;

import chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java.largestNum;

public class SecondLargest { 
    public static void printSecond(int arr[]){  
        int firstlarg=Integer.MIN_VALUE;
        int secondlarg=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){ 
            if(firstlarg<arr[i]){ 
                firstlarg=arr[i]; 
                secondlarg=firstlarg; 
            } 
            else if(arr[i]>secondlarg && arr[i]!=firstlarg){  
                secondlarg=arr[i]; 
               

            }
        } 
        System.out.print("secondlargest elemnt is "+secondlarg); 
    }  

    public static void main(String args[]){ 
        int arr[]={3,4,8,10,9}; 
        printSecond(arr); 

    }
}
