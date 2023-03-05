package PracticeQuestionOfAlpha;

public class SelectionSort {  
    public static void selectionSort(int arr[]){  
        for(int i=0;i<arr.length;i++){  
            
            for(int j=0;j<arr.length;j++){ 
                if(arr[i]<arr[i+1]){  
                    int temp=arr[i+1]; 
                    arr[i+1]=arr[i]; 
                    arr[i]=temp; 


                }
            }
        }

    }
    public static void main(String args[]){ 
        int arr[]={3,6,2,1,8,7,4,5,3,1}; 
        selectionSort(arr);
    }
    
}
