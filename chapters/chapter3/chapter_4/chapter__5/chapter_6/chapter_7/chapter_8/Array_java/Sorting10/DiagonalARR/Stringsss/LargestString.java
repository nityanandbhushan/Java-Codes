package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java.Sorting10.DiagonalARR.Stringsss;

public class LargestString {
    public static void main(String args[]) {
        String fruits[] = { "apple", "mango", "zbanana" };
        int len = fruits.length;
        // System.out.println(len);
        // for (int i = 0; i < fruits.length; i++) {
        //     System.out.print(fruits[i]);
        // }
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];

            }
        } 
        System.out.print(largest); 

    }
}
