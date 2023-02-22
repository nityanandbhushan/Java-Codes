package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java;

public class prifixMax { 
    public static void prefix_array(int arr[]){  
        int prefix[]=new int[arr.length];  
        int currsum=0; 
        int largest=Integer.MIN_VALUE;
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++)
        { 
            prefix[i]=prefix[i-1]+arr[i];  
        }  
        for(int i=0;i<arr.length;i++){ 
            int start=i;
         
        for(int j=1;j<arr.length;j++){ 
            int end=j;  
            currsum=start==0?prefix[end]:prefix[end]-prefix[start-1]; 
            if(largest<currsum){ 
                largest=currsum;
            } 


        } 

    } 
    System.out.print("largest value of subarray"+largest);

    }
    public static void main(String args[]){ 
        int arr[]={2,3,4,5,6,7,8}; 
        prefix_array(arr); 

    }
    
}
