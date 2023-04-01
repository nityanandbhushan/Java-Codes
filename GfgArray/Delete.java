package GfgArray;

public class Delete {
    public static int printingDeletionArr(int arr[], int x) {
        int i = 0;
        int n = arr.length;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                break;
            }

        }
        if (i == n) {
            return n;
        }
        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];

        }
        return n - 1;

    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 5, 6 };
        int x = 5;
        int n = printingDeletionArr(arr, x);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);

        }
    }
}
