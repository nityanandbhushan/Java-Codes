package RecursionPractice;

public class IsSortedd {
    public static boolean printResult(int arr[], int len){ 
        
        if(len==0||len==1){ 
            return true;
        }
        if(arr[len]<arr[len-1]){ 
            return false;
        }  
        printResult(arr, len-1);
        return true;
    }
    public static void main(String args[]){ 
        //int i=0;
        int arr[]={1,2,3,4,5,6,12}; 
        int len=arr.length-1;
        System.out.print(printResult(arr,len));
    

    }
    
}
