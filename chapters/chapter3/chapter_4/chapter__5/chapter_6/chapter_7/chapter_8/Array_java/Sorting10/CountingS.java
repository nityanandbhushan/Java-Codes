package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java.Sorting10;
//import java.util.*;
public class CountingS {
    public static void counting_num(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 1; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String args[]) {
        // int arr[]={8,4,3,2,1};
        // inertion_sort(arr);
        int arr[] = { 2, 3, 4, 5, 1, 1, 2, 3, 4, 6, 5, 7, 6, 5, 6, 7  };
        counting_num(arr);

    }

}


