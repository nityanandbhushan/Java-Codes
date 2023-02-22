package BitManuplation;

public class GetIthBit { 
    public static void getIthBit(int n,int i){ 
        int bitmask=1<<i; 
        int value=n&bitmask; 
        System.out.print(value);

    } 
public static void main(String args[]){ 
    int n=15;//0101  
    int i=2;
    getIthBit(n, i);  

} 
   

    
}
