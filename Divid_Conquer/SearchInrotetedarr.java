package Divid_Conquer;

//import java.lang.annotation.Target;

public class SearchInrotetedarr {
    public static int search(int arr[],int si, int ei, int target) {
        if (si >= ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        // line1
        if (arr[si] <= arr[mid]) {
            // left
            if (arr[si] <= target && target <= arr[mid]) {
                search(arr, si, mid - 1, target);
            }
            // right
            else {
                search(arr, mid + 1, ei, target);
            }

        }
        // line2
        else {
            // right
            if (target <= arr[mid] && target <= arr[ei]) {
                search(arr, mid + 1, ei, target);
            } else {
                search(arr, si, mid - 1, target);
            }

        }

    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int si=0;
        int ei=arr.length-1;
        int Indx = search(arr,si,ei, target);
        System.out.print(Indx);

    }

}
