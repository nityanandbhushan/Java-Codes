package ArrayInJava;

public class PrintLeaderinarr {
    public static void printleaders(int arr[],int n){  
        int curr_leader=arr[n-1];
        System.out.print(curr_leader);

        for(int i=n-2;i>=0;i--){
              if(curr_leader< arr[i]){  
                curr_leader=arr[i];

                System.out.print(curr_leader);
              }
        }

    }
    public static void main(String args[]){
        int arr[]={34,6,6,4,3,46,66,44,3,4,4,5,6};
        int n=arr.length; 
        printleaders(arr, n);
    }
}
