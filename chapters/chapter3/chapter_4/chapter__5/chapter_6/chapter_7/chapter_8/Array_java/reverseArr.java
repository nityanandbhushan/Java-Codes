package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java;

public class reverseArr {
    public static void reverse_array(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        System.out.println("PRINTING ARRAY AFTER REVERSE");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String args[]) {
        int arr[] = { 3, 4, 5, 7, 41, 89 };
        System.out.println("PRINTING ARRAY BEFORE REVERSE");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        reverse_array(arr);

    }
}
