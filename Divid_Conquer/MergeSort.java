package Divid_Conquer;

public class MergeSort {
    public static void mergesort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;

        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr, si, ei, mid);

    }

    public static void merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[(ei - si) + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;

            } 
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;

        }
        while (i <= mid) {
            arr[k++] = arr[i++];
        }
        while (j <= ei) {
            arr[k++] = arr[j++];
        } 
        for(k=0,i=si;i<temp.length;i++,k++){  
           arr[i]=temp[k];

        }

    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int si = 0;
        int ei = arr.length;
        mergesort(arr, si, ei); 
        for(int i=0;i<arr.length;i++){ 
            System.out.print(arr[i]);
        }

    }

}
