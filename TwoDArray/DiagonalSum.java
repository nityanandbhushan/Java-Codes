package TwoDArray;

public class DiagonalSum {
    public static void main(String args[])
    { 
        int matrix[][]={{1,2,3,4},{5,6,7,8},{10,11,12,13},{14,15,16,17}};
        int n=matrix.length;
        int m=matrix[0].length;  
        int sum=0; 
        int sum1=0;
        for(int i=0;i<n;i++)
        { 
            for(int j=0;j<m;j++)
            { 
                if(i==j)
                { 
                    sum+=matrix[i][j];
                } 
                if(i+j==3)
                {  
                    sum+=matrix[i][j];

                }
            }
        }   
        System.out.print(sum);
        for(int i=0;i<matrix.length;i++)
        {  
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i)
            { 
                sum1+=matrix[i][matrix.length-1-i];

            }
            
            
        }
        System.out.print(sum1);
    } 
}
