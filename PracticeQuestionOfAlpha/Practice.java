package PracticeQuestionOfAlpha;

public class Practice { 
    public static void counting_num(int arr[]) {
        int largest = Integer.MIN_VALUE; 
        int newarr[]= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 1; i < count.length; i++) {
           if(count[i]>=1){ 
            newarr[j]=i;
            j++;
           }

        } 
        System.out.println(newarr.length);
        for (int i = 0; i < newarr.length; i++) { 
            if(newarr[i]!=0){ 
                System.out.print(newarr[i] + " ");

            }
           
        }

    }

    public static void main(String args[]) {
        // int arr[]={8,4,3,2,1};
        // inertion_sort(arr);
        int arr[] = { 2, 3, 4, 5, 1, 1, 2, 3, 4, 6,23,56, 5, 7,90,88,79,88,90,79, 6, 5, 6, 7  };
        counting_num(arr);

    }
    
}
