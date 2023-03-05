package PracticeQuestionOfAlpha;

public class BubbleSort1 {
    public static void bubblesort(int arr[]) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length-j-1; i++) { 
                  
                  //when we print ascending order value then we used  
                  //arr[i]>arr[i+1]
                if (arr[i] < arr[i + 1])  //this condition use for printing decending order 
                {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;

                }

            } 

        } 
        for(int i=0;i<arr.length;i++){ 

            System.out.print(arr[i]);

        } 
       

    }

    public static void main(String args[]) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        bubblesort(arr);
    }
}
