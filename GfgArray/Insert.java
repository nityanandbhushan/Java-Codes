package GfgArray;

public class Insert {  
    public static void insertArary(int arr[],int n,int x,int pos,int cap){ 
        if(n==cap){ 
          System.out.print("Array is full");
        } 
        for(int i=n-2;i>=pos-1;i--){  
            arr[i+1]=arr[i];

        } 
        arr[pos-1]=x;  
        for(int i=0;i<arr.length;i++){ 
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String args[]){ 
        int arr[]=new int[5]; 
        arr[0]=5; 
        arr[1]=7;
        arr[2]=10;
        arr[3]=20; 
        int n=5; 
        int x=3;
        int cap=4;
        int pos=2; 
        insertArary(arr, n, x, pos, cap);
        
    }
    
}
