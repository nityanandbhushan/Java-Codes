package PracticeQuestionOfAlpha;

public class PracticeQuestion2 {
    //pallindrome  
    public static void isPallindrome(int n){  
        int reverse=0; 
         while(n!=0){ 
            int remainder=n%10;  
            reverse=reverse*10+remainder; 
            n=n/10; 
           
            
         }  
         if(reverse == n){ 
            System.out.print("Given number is  Pallindrome");
         } 
         else{ 
            System.out.print("Given number is pallindrome");
         }
         


    }
    public static void main(String args[]){  
        isPallindrome(12321);

    }
}
