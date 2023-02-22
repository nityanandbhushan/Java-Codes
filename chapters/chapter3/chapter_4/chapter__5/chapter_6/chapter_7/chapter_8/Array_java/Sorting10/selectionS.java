package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java.Sorting10;

public class selectionS {
    public static void selection_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length-1; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }

            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 3, 6, 2, 9, 1, 45, 89 };
        selection_sort(arr);
    }

}
