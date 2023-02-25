package Inheritance;

import java.net.SocketPermission;

public class HeirarchicalInh { 
    public static void main(){ 

    }
    
} 
class A{ 
    void print(){ 
        System.out.print("This is parent class");
    }
} 
class B extends A{ 
    void print1(){ 
        System.out.print("This is child class");
    }
} 
class C extends A{ 
    void print2(){ 
        System.out.print("This  is second child class");
    } 
    public static void main(String args[]){ 
        C see=new C(); 
        //see.print1();//providing error in this code because Class C inherit the parents child not second child  
        see.print();//Not providing error in this code because Class C inherit the parents child
    }
    
}
