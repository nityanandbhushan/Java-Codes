package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java;
import java.util.*;
public class lineaSe { 
    public static void main(String args[]){ 
        int arr[]={3,7,9,5,45,90,2,86};  
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the number"); 
        int n=sc.nextInt(); 
        for(int i=0;i<arr.length;i++){ 
            if(n==arr[i]){ 
                System.out.println("Enter number is present at index"+i); 
                break;
            } 
            else 
            { 
                System.out.println("Enter number is not present"); 
                break;
            }
        }

    }
    
}
