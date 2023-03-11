package PracticeQuestionOfAlpha;

public class CountingSrt {
    public static void findCount(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int cout[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            cout[arr[i]]++;
        } 
        int len=cout.length; 
        System.out.print(len);
        // for(int i=0;i<cout.length;i++){
        // System.out.print(cout[i]);
        // }
        // int i=0;
        int j = 0;
        for(int i=0;i<cout.length;i++) {
            while (cout[i] > 0) {
                arr[j] = i;
                cout[j]--;
                j++;

            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 5, 1, 1, 2, 3, 4, 6, 5, 7, 6, 5, 6, 7 };
        findCount(arr);
        // 2, 3, 4, 5, 1, 1, 2, 3, 4, 6, 5, 7, 6, 5, 6, 7
    }

}
