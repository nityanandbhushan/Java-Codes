package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java;

public class ques1 { 
    public static void appear_twice(int arr[]){ 
        //int twice=0; 
        //int start=arr[0];  
        int len=arr.length; 
        System.out.println(len);  
        for(int i=0;i<arr.length;i++){ 
           int start=arr[i];
         
        for(int j=i;j<=arr.length;j++) 
        { 
            int end=arr[j+1]; 
            for(int k=start;k>end;j++)
            { 
                System.out.print(arr[k]);
            } 
            System.out.println();
        }
          
    } 
    System.out.println();  
}       
    public static void main(String args[]){ 
        int arr[]={2,23,4,5,2}; 
        appear_twice(arr);

    }
    
}
