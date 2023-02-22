package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7;

public class sumOFDig { 
    public static void sumOF(int num){  
        int sum=0;
        while(num>0){ 
        int lastdig=num % 10; 
        sum =sum+lastdig; 
        num=num/10;
        } 
        System.out.println("The sum the numbers is"+sum);
    }
    public static void main(String args[]){ 
        int num=2345; 
        sumOF(num);
    }
    
}
