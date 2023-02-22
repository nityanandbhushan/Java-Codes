package BitManuplation;

public class SetIthBit { 
    public static int setIthBit(int n,int i){ 
        int bitmask=1<<i; 
        int value = n | bitmask;  
        return value;
 
    }
    public static void main(String args[]){  
        
        System.out.print(setIthBit(10,2)); 


    }
}
