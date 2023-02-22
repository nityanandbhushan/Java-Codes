package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7;

public class pyq3 { 
    public static int isPallindrome(int n){  
        int num=0;
        while(n>0){  
           int lastdig=n%10; 
            num=(num*10) + lastdig; 
            n=n/10;

        }  
        return num;
       
    }
    public static void main(String args[]){ 
        int n=121; 
       int number= isPallindrome(n); 
        if(number==n)
        { 
            System.out.println("Enter number is Pallindrome"); 
        } 
        else 
        { 
            System.out.println("Enter number is Not Pallindrome");
        }
    }
    
}
