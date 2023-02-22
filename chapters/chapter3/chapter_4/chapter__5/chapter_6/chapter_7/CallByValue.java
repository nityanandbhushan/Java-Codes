package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7;

public class CallByValue {
    public static int PrintHello(int a){  
        int b=9; 
        int sum=a+b;  
        return sum;
    }
    public static void main(String args[]){
        int a=5; 
        System.out.println(a); 
        int prin=PrintHello(a); 
        System.out.println(prin);
    }
}
