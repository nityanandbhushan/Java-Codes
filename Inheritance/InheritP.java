package Inheritance;

public class InheritP {
    public static void main(String args[]){  
        Dogs duggu=new Dogs(); 
        duggu.barks(); 

     
    }
}  
// Single Inheritance 
class Animal{ 
    void eat() 
    { 
        System.out.print("Animal can eat....'from parets class'");
    } 
    void legs(){ 
        System.out.print("Animal have legs");
    }
} 
class Dogs extends Animal{ 
   void barks(){ 
        System.out.print("Dag can barks");
    }

    
}
