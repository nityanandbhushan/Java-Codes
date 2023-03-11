package PracticeQuestionOfAlpha;

public class SumOfRow {  
    public static void sumOfRow(int arr[][]){  
         int sum=0;
        for(int i=1;i<arr.length-1;i++){ 
            for(int j=0;j<arr[0].length;j++){ 
                sum+=arr[i][j]; 

            }
        } 
        System.out.print("Sum of the Second Row"+sum);

    }
    public static void main(String args[]){ 
        int arr[][] = { {1,4,9},{11,4,3},{2,2,3} };
        sumOfRow(arr);





    }
    
}
