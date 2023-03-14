package BitManuplationPractice;

public class UpdateIthBit { 
    public static int clearIthBit(int n,int i){ 
        int bitmask=~(1<<i); 
        return n&bitmask;
    } 
    public static void upDateIthBit(int n,int i,int bit){  
        int bitwise=bit<<i; 
        int value =n | bitwise; 
        System.out.println(value);

    }
    public static void main(String args[]){  
        int n=(clearIthBit(10,1)); 
       upDateIthBit(10,2,1);



    }
}
