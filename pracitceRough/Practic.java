package pracitceRough;

public class Practic {
    public static void main(String args[]){  
        int arr[]={2,3,4,56,7,1}; 
        for(int i=0;i<arr.length-1;i++){ 
            int temp=arr[i]; 
            arr[i]=arr[i+1]; 
            arr[i+1]=temp; 

        } 
        for(int i=0;i<arr.length;i++){ 
            System.out.print(arr[i]+" ");
        }

    }
}
