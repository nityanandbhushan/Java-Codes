package pracitceRough;

public class BinaryS { 
    public static void binarysearch(int arr[], int n, int k) {
        // code here  
        int start=0; 
        while(start<=n){
        int mid=((arr[start]+arr[n])/2)-1;
            if(arr[mid]==k){  
                System.out.print(mid);
            }
            else if(mid>k){ 
                n=mid-1; 
            }
            else{
                 start=mid;
                
            } 
        }
        } 
        
        public static void main(String args[]){  
            int arr[]={1,2,3,4,5}; 
            int n=5;  
            int k=4;
            binarysearch(arr,n,k);
            
            
    }
    
}
