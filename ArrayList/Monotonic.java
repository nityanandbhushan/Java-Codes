package ArrayList;

public class Monotonic{ 
    public static boolean printMonotonic(int arr[]){  
        boolean aso=false; 
        boolean dso=false;
        for(int i=0;i<arr.length-1;i++){ 
            if(arr[i]<arr[i+1]){  
                aso=true;
            } 
            if(arr[i]>arr[i+1]){ 
                dso=true;
            }
        } 
        return aso||dso; 
    }
    public static void main(String args[]){ 
        int arr[]={1,2,2,3,3,3,3,9,9,8,12}; 
        System.out.print(printMonotonic(arr));

    }
}
