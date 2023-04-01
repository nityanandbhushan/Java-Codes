package RecursionPractice;

public class LastOccurence {
    public static int lastOccurence(int arr[], int n, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == 4) {
            for (int k = i; i < arr.length - 1; k++) {
                if (arr[k + 1] == 4) {
                    return k + 1;
                }
            }
            return i;
        }
        return lastOccurence(arr, n, i + 1);

    }

    public static void main(String args[]) {
        int arr[] = { 2,4,4,4,4,4,4,4,4,4,4,4,4 };
        int n = 4;
        int i = 0;
        System.out.print(lastOccurence(arr, n, i));

    }
}
