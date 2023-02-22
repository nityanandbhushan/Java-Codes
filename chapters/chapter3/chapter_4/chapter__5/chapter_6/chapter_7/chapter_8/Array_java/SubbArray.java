package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java;

public class SubbArray {
    public static void print_subarray(int arr[]){   
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){ 
            int curr=i; 
            for(int j=i;j<arr.length;j++){ 
                int end=j; int sum=0;
                for(int k=curr;k<=end;k++){  
                    System.out.print(arr[k]+" "); 
                    //calculating the sum of the subarray
                    sum+=arr[k]; 
                }  
                //printing sum of the subarray 
                System.out.println("Sum of the subarray"+sum); 
                System.out.println(" ");  
                //checking largest sum in the subarray; 
                if(largest<sum){ 
                    largest=sum;
                }

            }  
            System.out.println(" "); 
            
           } 
           System.out.println("Largest value of subarray"+largest);  


    } 
    public static void main(String args[]){ 
        int arr[]={-2,-3,4,-1,-2,1,5,-3 };  
        print_subarray(arr);

    }
   
}
