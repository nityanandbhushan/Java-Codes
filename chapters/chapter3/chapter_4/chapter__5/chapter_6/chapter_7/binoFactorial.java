package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7;
import java.util.*;
public class binoFactorial 
{ 
    public static int factorial(int x) 
    {
        int f = 1;
        for (int i=1; i<=x;i++) 
        {
            f = f * i;
            
        } 
        return f;
    }
    /**
     * @param args
     */
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N & R");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int foN = factorial(n);
        int foR = factorial(r);
        int fonmr = factorial(n - r);
        int fac = foN/(fonmr * foR);
        System.out.println("Factorial Is "  +  fac);

    }
    
}
