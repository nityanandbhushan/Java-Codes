package PracticeQuestionOfAlpha;

public class SelectionSort {  
    public static void selectionSort(int arr[]){  
        for(int i=0;i<arr.length;i++){  
           int minpos=i; 
           //{3,6,2,1,8,7,4,5,1,3
            for(int j=i;j<arr.length-1;j++){ 
                if(arr[minpos]>arr[j+1]){  
                    minpos=j+1;

                }
            }  
         int temp=arr[i]; 
             arr[i]=arr[minpos]; 
         arr[minpos]=temp;  
            //System.out.print(arr[minpos]);


           
        }   
        for(int i=0;i<arr.length;i++){ 
            System.out.print(arr[i]);
        }

    }
    public static void main(String args[]){ 
        int arr[]={3,6,2,1,8,7,4,5,1,3}; 
        selectionSort(arr);
    }
    
}
