package RecursionPractice;

public class FindIndex {
    public static int findIndex(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;

        }
        if (key == arr[i]) {
            return i;

        }
        return findIndex(arr, i + 1, key);

    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 5, 6, 3, 2, 4 };
        int i = 0;
        int key = 4;
        System.out.print(findIndex(arr, i, key));

    }

}
