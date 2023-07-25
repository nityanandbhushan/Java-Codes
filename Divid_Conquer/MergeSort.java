package Divid_Conquer;

public class MergeSort {   
    /*public static void printArray(int arr[]){ 
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void mergeSort(int arr[],int str,int end,int mid){  
// new temporary array
        int temp[]=new int[end]; 
        //for comparison
        int i=str;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end){  
            if(arr[i]<arr[j]){ 
                temp[k]=arr[i];
                i++;
            } 
            else{ 
                temp[k]=arr[j];
                j++;
            } 
            k++;
        }  
        //for left side
        while(i<=mid){ 
            arr[k++]=arr[i++];
        } 
        //for right side 
        while(j<=end){ 
            arr[k++]=arr[j++];
        } 
        //copy original array form temp  
        for(int l=str ,m=0;l<temp.length;l++,m++){  
            arr[l]=temp[m];
        } 
       
    }
    public static  void sortingmerge(int arr[],int str,int end){ 
        if(str>=end){ 
            return;
        }
        int mid=str+(end-str)/2;  
        sortingmerge(arr, str, mid);
        sortingmerge(arr, mid+1, end);  
        mergeSort(arr, str, end, mid);
    } 
    public static void main(String args[]) {
       int arr[]={9,8,7,6,5,4,3,2,1};
       int str=0;
       int end=arr.length-1; 
       sortingmerge(arr,str,end);
        printArray(arr);
    } 
    */   


    /* -------------------------OPTIMIZED CODE------------------------------------------- */
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    } 
    /* 
    

    public static void mergeSort(int[] arr, int str, int end, int mid) {
        // Create a temporary array of the same size as the subarray being merged
        int[] temp = new int[end - str + 1];

        // Copy the elements of the subarray to the temporary array
        for (int i = str; i <= end; i++) {
            temp[i - str] = arr[i];
        }

        // Initialize the iterators for the left and right subarrays
        int i = str;
        int j = mid + 1;

        // Merge the two subarrays into the original array
        for (int k = str; k <= end; k++) {
            if (i <= mid && j <= end) {
                if (temp[i - str] < temp[j - str]) {
                    arr[k] = temp[i - str];
                    i++;
                } else {
                    arr[k] = temp[j - str];
                    j++;
                }
            } else if (i <= mid) {
                arr[k] = temp[i - str];
                i++;
            } else {
                arr[k] = temp[j - str];
                j++;
            }
        }
    }

    public static void sortingmerge(int[] arr, int str, int end) {
        if (str >= end) {
            return;
        }

        int mid = str + (end - str) / 2;

        sortingmerge(arr, str, mid);
        sortingmerge(arr, mid + 1, end);

        mergeSort(arr, str, end, mid);
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        sortingmerge(arr, 0, arr.length - 1);

        printArray(arr);
    } 
     */    

    public static int prtitioning(int arr[],int strt,int end){  
        int lastindx=arr[end]; 
        int k=-1;
        while(strt<=end){ 
             if(arr[strt]<lastindx){ 
            k++; 
            int temp=arr[strt];
            arr[strt]=arr[strt+1];
            arr[strt+1]=temp;
            arr[k]=arr[strt];
            strt++;
        }
        } 
        k++; 
        int temp=arr[k];
        arr[k]=arr[end];
        arr[end]=temp; 
        return k;
       
    }
    public static void quickshort(int arr[],int strt,int end){   
         int pIndx=prtitioning(arr,strt,end);  
        if(strt<=end){  
            return;
            
        }
        quickshort(arr, strt, pIndx-1); 
        quickshort(arr, pIndx+1, end);
    }
    public static void main(String args[]){   
          int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1}; 
          int strt=0; 
          int end=arr.length-1; 
          quickshort(arr,strt,end); 
          printArray(arr);




    }
    


}
