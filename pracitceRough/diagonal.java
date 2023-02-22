package pracitceRough;

public class diagonal { 
    public static void diagonal_sum(int arr[][])
    {     
        int sum=0;
        for(int i=0;i<arr.length;i++){  
           /* 
           for(int j=0;j<arr.length;j++){  
                if(i==j){ 

                    sum=sum+arr[i][i];
                } 
                if(i+j==arr.length-1){ 
                    sum=sum+arr[i][j];
                }

            }
            */  
            sum=sum+arr[i][i]; 
            sum=sum +arr[i][arr.length-1-i]; 

           
        } 
        System.out.print(sum); 

    }
    public static void main(String args[]){ 
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};  
        //int key=14; 
        diagonal_sum(arr);

    }
}
