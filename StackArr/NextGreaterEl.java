package StackArr;
import java.util.*;
public class NextGreaterEl { 
    public static void nextGreater(int arr[]){ 
        Stack<Integer> s=new Stack<>(); 
        int nextGre[]=new int[arr.length]; 
        for(int i=arr.length-1;i>=0;i--){ 
            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){ 
                s.pop();
            } 
            if(s.isEmpty()){ 
                nextGre[i]=-1;
            }  
            else{ 
                nextGre[i]=arr[s.peek()];
            }  
            s.push(i);
        } 
        for(int i=0;i<nextGre.length;i++){  
            System.out.print(nextGre[i]+" ");

        }
    }
    public static void main(String args[]){ 
        int arr[]={6,8,0,1,3}; 
        nextGreater(arr); 
        
    }
}
