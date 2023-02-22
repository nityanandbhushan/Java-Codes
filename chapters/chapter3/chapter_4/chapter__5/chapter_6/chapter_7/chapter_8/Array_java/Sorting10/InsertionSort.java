package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java.Sorting10;

public class InsertionSort {
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
  

    public static void main(String args[]){ 
        int arr[]={5,4,3,2,1,1,2,3,4}; 
        insertion_sort(arr);
    }
    
}
