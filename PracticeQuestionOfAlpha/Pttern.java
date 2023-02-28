package PracticeQuestionOfAlpha;

public class Pttern {
    public static boolean findingOccur(int arr[]) {
        // int j=1;
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;

                }
                if (count > 0) {
                    return true;
                }

            }
        }
        return false;

    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 1,9,8};
        System.out.print(findingOccur(arr));

    }

}
