package gfffg;

public class consecutiveZero {
    public static int printConsective(int arr[], int n) {
        int count = 0; 
        int res=0;
        for (int i = 1; i < n; i++) {
            if (arr[i] == 1 && arr[i - 1] == 1) {
                count++;
            } 
            res=Math.max(res, count);
        }
        return count;

    }

    public static void main(String args[]) {
        int arr[] = { 0, 0, 1, 1, 0, 1 };
        int n = arr.length;
        System.out.print(printConsective(arr, n));

    }
}
