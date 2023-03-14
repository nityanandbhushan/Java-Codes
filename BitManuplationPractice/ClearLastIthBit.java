package BitManuplationPractice;

public class ClearLastIthBit { 
    public static int clearlastIthBit(int n,int j){  
        int bitwise=(~0)<<j; 
        return n & bitwise;   


    }
    public static void main(String args[]){ 
        System.out.println(clearlastIthBit(1111,2));
       
    }
    
}
