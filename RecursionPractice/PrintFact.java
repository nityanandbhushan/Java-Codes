package RecursionPractice;

public class PrintFact {
    public static int printFact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = printFact(n - 1);
        int fact = n * printFact(n - 1);
        return fact;

    }

    public static void main(String args[]) {
        int n = 5;
        printFact(n);

    }
}
