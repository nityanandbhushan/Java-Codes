package ArrayInJava;

public class ConsecutiveZeros { 
    public static int pirnAnswer(int arr[],int n){  
        int count=0; 
        int cout=0;
        for(int i=0;i<n;i++){ 
            if(arr[i]==1){
                count++;
            }
          if(count==2){ 
            cout++; 
            count=0;

          }

        } 
        return cout;

    }
    public static void main(String args[]){
        int arr[]={1,1,0,0,1,0,1,1,0,0};
        int n=arr.length; 
        System.out.print(pirnAnswer(arr,n));

    }
    
}
