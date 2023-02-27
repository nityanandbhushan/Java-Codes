package Opps;

public class Interfaces { 
    public static void main(String args[]){  
    //    Test t=new Test(); 
    //    t.show(); 
       Bear b=new Bear(); 
       b.meets(); 
       b.plants(); 
       b.beareats();
        

    }
    
}  
// interface I1{ 
//     public abstract void show();
// } 
// class Test implements I1{  
//     public void show(){ 
//         System.out.print("1");
//     }
 
// }  
interface Harbivorus{ 
     void plants();
} 
interface Carnivorus{ 
     void meets();
} 
class Bear implements Harbivorus,Carnivorus{  
    void  beareats(){  
        System.out.println("Bear can eat meet and plants");

    }

    public void plants(){ 
        System.out.println("Harbivorus can eats plants");
    } 
    public void meets(){ 
        System.out.println("Carnoborus can eats meets");
    }
}
