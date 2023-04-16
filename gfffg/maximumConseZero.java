package gfffg;

public class maximumConseZero {
    public static int printmaxCnzr(int arr[], int n) {
        int res = 0;

        int count = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] == 1) {
                count++;
            } else {
                res = Math.max(count, res);
                count = 0;

            }

        }

        return res;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0 };
        int n = arr.length;
        System.out.print(printmaxCnzr(arr, n));

    }
}
