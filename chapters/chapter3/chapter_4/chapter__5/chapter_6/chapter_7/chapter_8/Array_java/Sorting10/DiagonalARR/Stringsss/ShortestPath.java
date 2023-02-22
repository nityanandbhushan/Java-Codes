package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java.Sorting10.DiagonalARR.Stringsss;

public class ShortestPath { 
    public static float finding_shortestpath(String str){ 
        int x=0;
        int y=0; 

        for(int i=0;i<str.length();i++){ 
            char ch=str.charAt(i); 
            if(ch=='n'){ 
                y+=1;
            } 
            else if(ch=='s'){ 
                y-=1; 
             } 
             else if(ch=='w'){ 
                x-=1;
             } 
             else{ 
                x+=1;
             }
        } 
        int sqofx=x*x; 
        int sqofy=y*y; 
        return (float)Math.sqrt(sqofx+sqofy);
    } 
    public static void main(String args[])
    { 
        String str="wneenesennn"; 
        System.out.print("Shortest path is"+finding_shortestpath(str));
    }

} 
   
