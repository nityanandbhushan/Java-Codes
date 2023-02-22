package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java;

public class pairs { 
    public static void pairofarray(int arr[])
    { 
        int start=0; int end=arr.length; 
        for(int i=0;i<end;i++)
        { 
            int curr=arr[i];  
            int sum=0;
            for(int j=i+1;j<end;j++)
            { 
               // System.out.print("("+ curr + ","+arr[j]+")"); 
                sum=curr+arr[j]; 
                if(sum==108){  
                    System.out.print(i +","+ j ); 
                    //System.out.print("the value of "+end);

                }
            } 
            System.out.println(" ");
        }  


    }
    public static void main(String args[])
    { 
        int arr[]={5,6,23,87,98,62,10,11}; 
        pairofarray(arr);  
    }
}
