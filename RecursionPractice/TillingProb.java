package RecursionPractice;

public class TillingProb {
    public static int printWays(int n) {
        if (n == 0 && n == 1) {
            return 1;

        }
        // For vertically
        int nm1 = printWays(n - 1);
        // For Horizontaly
        int nm2 = printWays(n - 2);
        int ways = nm1 + nm2;
        return ways;

    }

    public static void main(String args[]) {
        int n = 2;
        System.out.print(printWays(n));

    }
}
