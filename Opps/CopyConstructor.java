package Opps;

public class CopyConstructor {
    public static void main(String args[]) {
        Student c1 = new Student();
        // Student c2=new Student("nityanand");
        // Student c3=new Student(190);
        c1.name = "nityanand";
        c1.roll = 191;
        c1.password = "xyz";
        c1.marks[0] = 98;
        c1.marks[1] = 65;
        c1.marks[2] = 90;
        Student c2 = new Student(c1);
        c2.password = "xyz";
        c2.marks[0] = 104;
        c2.marks[1] = 11;
        c2.marks[2] = 91;

        for (int i = 0; i < 3; i++) {
            System.out.println(c1.marks[i]);
        }

    }

}

class Student {
    String name;
    int roll;
    String password;
    int marks[] = new int[3];

    Student() { // Non parametrize constructer
        int marks[] = new int[3];
        System.out.println("This is a non parametrize constructer");

    }

    Student(String name) {
        int marks[] = new int[3];
        this.name = name;

    }

    Student(int roll) {
        int marks[] = new int[3];
        this.roll = roll;
    }

    Student(Student c1) {
        int marks[] = new int[3];
        this.name = c1.name;
        this.roll = c1.roll;
        // this.password=c1.password;
        this.marks = c1.marks;

    }

}
