package Opps;

public class ClassObject { 
    public static void main(String args[]){  
        System.out.println("This is the first program to define Object and classes"); 
        Animal buzo=new Animal(); 
        buzo.eat(); 
        buzo.run();

    }
    
} 
class Animal{  
    void eat(){ 
        System.out.println("Animal hava a properties of eat");
        
    } 
    public void run(){ 
        System.out.print("Animal hava a property of run");
    }

}
