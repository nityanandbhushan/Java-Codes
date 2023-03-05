package PracticeQuestionOfAlpha;

public class InsertionSort { 
    public static void insertionSort(int arr[]){ 
        //int curr=arr[0];  
        int n=arr.length;
       for(int i=1;i<arr.length;i++){  
            int curr=i; int prev=i-1; 
            //for(int j=0;j<arr.length;j++){  
                while((prev >=0 && arr[curr]>arr[prev])){ 
                   arr[]



                }  
                prev--;
                curr++;
                

            //}
         

        } 

    }
    public static void main(String args[]){ 
        int arr[]={3,6,2,1,8,7,4,5,3,1}; 
        insertionSort(arr);
    }
}
