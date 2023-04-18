package ArrayInJava;

public class MoveZeorsend {
    public static void printAnswer(int arr[], int n) {
        int m = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {

                temp = arr[m];
                arr[m] = arr[i];
                arr[i] = temp;
                m++;
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 10, 0, 0, 8, 7, 0 };
        int n = arr.length;
        printAnswer(arr, n);

    }
}
