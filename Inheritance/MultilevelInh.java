package Inheritance;

// public class MultilevelInh {
//     public static void main(String args[]){ 

//     }
// } 
class A{ 
    void print(){ 
        System.out.print(" This is Parent class");
    } 
   
} 
class B extends A { 
    void print1(){ 
        System.out.print("This is child first class"); 
       
    }  public static void main(String args[]){ 
        B sc=new B(); 
        //sc.print2();//we can not access the data of the third child   
        sc.print();//here we can access the data of the parent class
    }
} 
class C extends B{ 
    void print2(){ 
        System.out.print("This is child 2 class");
    } 
   
}
