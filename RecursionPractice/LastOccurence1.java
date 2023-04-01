package RecursionPractice;

public class LastOccurence1 { 
    public static int lastOccurence(int arr[],int n,int i){ 
        if(i==arr.length){
            return -1;
        }    
        int isFound=lastOccurence(arr, n, i+1); 
        if(isFound==-1 && arr[i]==4){ 
            return i;
        } 
        return isFound;


    }
    public static void main(String args[]){ 
        int arr[]={2,3,4,5,6,7,8,5}; 
        int n=5; 
        int i=0; 
        System.out.print(lastOccurence(arr,n,i));
    }
}
