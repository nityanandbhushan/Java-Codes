package ArrayInJava;

public class LeftRotate {
    public static void printAnswer(int arr[], int d, int end) {
        printAnswer1(arr,0, d-1); 
        printAnswer1(arr, d, end);
        printAnswer1(arr, 0, end);
    }

    public static void printAnswer1(int arr[],int low,int high){
      
     while(low<high){  
        int temp=arr[low];
        arr[low]=[high-1]; 
        arr[high-1]=arr[low];
        start++;
        end--;
           


        }
      
        
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int end = arr.length;
        int d = 3;
        printAnswer(arr, d, end);

    }
}
