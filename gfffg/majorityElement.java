package gfffg;

public class majorityElement {
    public static int printingMejorityelement(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;

                }

            }
            if (count >= n / 2) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        int arr[] = { 8, 7, 6, 8, 6, 6, 6, 6 };
        int n = arr.length;
        System.out.print(printingMejorityelement(arr, n));

    }
}
