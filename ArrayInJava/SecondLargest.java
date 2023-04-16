package ArrayInJava;

public class SecondLargest {
    public static void printSecondlarg(int arr[],int n){
        int firslarg=Integer.MIN_VALUE;
        int seclarg=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(firslarg<arr[i]){
                seclarg=firslarg;
                firslarg=arr[i]; 
            }
        } 
        System.out.print(seclarg);

    }
    public static void main(String args[]){ 
        int arr[]={12,32,34,18,66,77,98,5,6,4,7,4,6,4,5,66,54,54,99,}; 
        int n=arr.length; 
        printSecondlarg(arr, n);

    }
}
