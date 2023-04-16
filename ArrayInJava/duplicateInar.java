package ArrayInJava;

public class duplicateInar {
    public static int printDuplicate(int arr[], int n) {
        int m = 0;
        int y = 0;
        for (int i = 0; i < n - 1; i++) {
            // if(arr[m-1]!=arr[i])
            // {
            // arr[m]=arr[i];
            // m++;
            // }


        }
        return m;

    }

    public static void main(String args[]) {
        int arr[] = { 11, 12, 12, 67, 70, 80, 80 };
        int n = arr.length;
        int y = printDuplicate(arr, n);
        for (int i = 0; i < y; i++) {
            System.out.print(arr[i]);
        }

    }
}
