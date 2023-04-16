package gfffg;
public class maxEvenoddsub { 
    public static int printingEvenodd(int arr[],int n){ 
        int res=0; 
        int count=0;
        for(int i=1;i<n;i++){
            if(arr[i]%2==0 && arr[i-1]!=0){
                count++;
            } 
            else{
                res=Math.max(count,res); 
                count=0;
            }
        } 
        return res;

    }
    public static void main(String args[]){
        int arr[]={5,10,20,6,3,8}; 
        int n=arr.length; 
        System.out.print(printingEvenodd(arr, n));
    }
}
