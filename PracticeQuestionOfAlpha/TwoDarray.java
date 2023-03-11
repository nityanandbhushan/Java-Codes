package PracticeQuestionOfAlpha;

public class TwoDarray { 
    public static void occurOfNumber(int arr[][]){ 
        int count=0;  
        int ln=arr.length; 
        System.out.println(ln);
        for(int i=0;i<arr.length;i++){ 
            for(int j=0;j<arr[0].length;j++){  
                if(arr[i][j]==7){ 
                    count++;
                }

            }
        }  
        System.out.print("Occurence of the 7 is " + count);

    }
    public static void main(String args[]){ 
        int arr[][]={ {4,7,8},{8,8,7} };  
        occurOfNumber(arr);


    }
}
