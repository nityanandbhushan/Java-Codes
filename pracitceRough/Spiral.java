package pracitceRough;

public class Spiral { 
    public static void spiral_arr(int arr[][]){  
        int startRow=0; 
        int startCol=0; 
        int endRow=arr.length-1; 
        int endCol=arr.length-1; 
        //for top border 
        while(startCol <= endCol && startRow <= startCol){
        for(int i=startCol;i<=endCol;i++) 
        { 
            System.out.print(arr[startRow][i]+" ");
        } 
        //for right border 
        for(int i=startRow+1;i<=endCol;i++)
        { 
            System.out.print(arr[i][endCol]+" ");
        } 
        //for down border 
        for(int i=endCol-1;i>=startRow;i--)
        { 
            System.out.print(arr[endRow][i]+" ");
        } 
        for(int i=endRow-1;i>startCol+1;i--)
        { 
            
            System.out.print(arr[i][startCol]+" ");

        } 
        startCol++;
        startRow++; 
        endCol--; 
        endRow--; 
    }  

    }  

    public static void main(String args[]){ 
        int arr[][]={{1, 2, 3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};   
        spiral_arr(arr); 
    } 
    
}
