package Inheritance;

public class HybridInhe {  
    public static void main(String args[]){ 

    } 

    
} 
class Animal{ 
    void eats(){ 
        System.out.print("They can eats"); 

    }  
    void walk(){ 
        System.out.print("They can walk");
    }

} 
class Birds extends Animal{ 
    void fly(){ 
        System.out.print("They Can fly"); 

    } 
    void wings(){ 
        System.out.print("They hava wings");
    }
} 
class Duck extends Birds { 
    void eggs(){ 
        System.out.print("They give Egg");
    }  
    void swim(){ 
        System.out.print("They can swims");
    } 


} 
class Fish extends Animal{  
    void smalleyes(){ 
        System.out.print("Fish hava small Eyes");
    } 
    void smallsize(){ 
        System.out.print("Fish hava smallsize");
    }

}  
class Shark extends Fish{ 
    void bigsize(){  
        System.out.print("Shark hava big size");
    } 
    void bigwings(){ 
        System.out.print("Sharks have big wings");
    }
}
