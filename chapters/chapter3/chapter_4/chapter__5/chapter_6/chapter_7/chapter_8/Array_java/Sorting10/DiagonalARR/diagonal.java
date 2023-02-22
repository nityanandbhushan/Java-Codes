package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java.Sorting10.DiagonalARR;

public class diagonal { 
    public static boolean diagonal_sum(int arr[][],int key){ 
        int row=0; 
        int col=arr[0].length-1;  
        while(row< arr.length && col>=0){ 
            if(key==arr[row][col]){ 
                System.out.print("Found key at index" +row+" ,"+col); 
                return true;
            } 
            else if(key <arr[row][col]){ 
                col--;
            } 
            else{ 
                row++;
            }
        } 
        System.out.print("Not found key in given matrix"); 
        return false;

    } 
    public static void main(String args[]){ 
        int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}}; 
        int key=33;  
        diagonal_sum(arr,key);

    } 


    
}
