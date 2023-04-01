package RecursionPractice;

public class PowrOfTwoOptim {
    public static int printingPowerofn(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int nm1 = printingPowerofn(x, n / 2);
        int fun = nm1 * nm1;
        if (n % 2 != 0) {
            nm1 = x * fun;

        }
        return nm1;

    }

    public static void main(String args[]) {
        int x = 2;
        int n = 5;
        System.out.print(printingPowerofn(x, n));

    }
}
