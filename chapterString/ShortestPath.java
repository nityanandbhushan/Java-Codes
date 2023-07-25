package chapterString;

public class ShortestPath {  
    public static void FindingShorPath(String str){  
        int y=0;
        int x=0;
        for(int i=0;i<str.length();i++){ 

            if(str.charAt(i)=='E'){ 
                x++; 
            }

            if(str.charAt(i)=='W'){ 
                x--;
            }  
            if(str.charAt(i)=='N'){ 
                y++;
            }  

            if(str.charAt(i)=='S'){ 
                y--;
            } 
        } 
        
        System.out.print("Value of X IS"+ x + " Value of Y IS"+ y);

    }
    public static void main(String args[]){   
        String str=" WNEENESENNN";  
        FindingShorPath(str);
       


    } 
   
}
