package Opps;

public class polymorphism { 
    void show(){ 
        System.out.print("This is show method first");
    } 
    void show(int a){ 
        System.out.print("This is show method second");
    } 
    public static void main(String args[]){ 
        polymorphism t=new polymorphism();
        t.show(5);
    
    }
    
}
