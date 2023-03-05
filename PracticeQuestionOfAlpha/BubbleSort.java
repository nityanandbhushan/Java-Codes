package PracticeQuestionOfAlpha;

public class BubbleSort {  
    public static void bubbleSort(int arr[]){  
        int max=Integer.MIN_VALUE;  
        int n=arr.length;  
        int newarr[]=new int[arr.length];
        while(n>0){ 
            for(int i=0;i<n;i++){ 
                max=Math.max(max,arr[i]);
            } 
            newarr[n-1]=max;  
            // int temp=arr[n-1]; 
            // arr[n-1]=max; 
            // arr[n-2]=temp;  
            n--;

        }   
        
        for(int i=0;i<n;i++){ 
            System.out.print(newarr[i]);

        }
      


    }
    public static void main(String args[]){ 
        int arr[]={3,6,2,1,8,7,4,5,3,1}; 
        bubbleSort(arr);
    }
    
}
