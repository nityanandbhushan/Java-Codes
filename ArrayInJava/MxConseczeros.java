package ArrayInJava;

public class MxConseczeros {
    public static int pirnAnwer(int arr[], int n) {
        int count = 0;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {

            if (arr[i] == 1) {
              
            } else { 
                count++;
                if (count >= 2) {
                    res = Math.max(count, res);
                    count=0;
                }
            }

        }
        return res;

    }

    public static void main(String args[]) {
        int arr[] = { 1, 0, 0, 0, 1, 1, 1, 1, 1};
        int n = arr.length;
        System.out.print(pirnAnwer(arr, n));

    }
}
