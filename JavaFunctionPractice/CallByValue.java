package JavaFunctionPractice;

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
