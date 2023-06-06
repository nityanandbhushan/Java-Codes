package Practice_Question;
public class Matrix { 
    public static void main(String args[])
    { 
        int matrix[][]={{1,2,3,4},{14,5,6,9},{11,7,8,9},{32,10,11,12}};
        int startingrow=0;
        int startingcol=0;
        int endrow=matrix.length;
        int endcol=matrix[0].length;  
        while(startingcol <endcol || startingrow <endrow){  
            for(int i=0;i<endcol;i++)
        {   
            System.out.print(matrix[startingrow][i]+" ");


        }  
        for(int j=startingrow+1;j<endrow;j++ )
        { 
            System.out.print(matrix[j][endcol-1]+" ");
        } 
        for(int k=endcol-1;k>0;k--)
        {  
            System.out.print(matrix[endrow-1][k]+" ");

        }  
        for(int l=endrow-1;l>0;l--){ 
            System.out.print(matrix[l][startingcol]+" ");
        }  
        startingcol++;
        startingrow++;
        endcol--;
        endrow--;


        }
        
        
    }
    
}
