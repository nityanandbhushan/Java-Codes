package Opps;

public class DeepAndShallow {
    public static void main(String args[]){  
        Student s1=new Student();  
        s1.name="nityanand"; 
        s1.roll=192; 
        s1.password="syz"; 
        System.out.print(s1.name); 
        System.out.print(s1.roll); 
        System.out.print(s1.password); 
        

    }
} 
class Student{ 
    String name; 
    int roll; 
    String password; 
    Student(){  
        this.name=name; 
        this.roll=roll; 
        this.password=password;

    } 
}
