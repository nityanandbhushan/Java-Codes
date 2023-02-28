package PracticeQuestionOfAlpha;

public class TargetedValue { 
    public static int findingTargetValueInde(int arr[],int target){  
        for(int i=0;i<arr.length;i++){ 
            if(target==arr[i]){ 
                return i;
            }
        }  
        return -1; 

        


    } 
    public static void main(String args[]){ 
        int arr[]={4,  5, 6, 7, 0, 1, 2} ; 
         int target=9; 
        System.out.print("Finding value at index"+findingTargetValueInde(arr,target));


    }
    
}
