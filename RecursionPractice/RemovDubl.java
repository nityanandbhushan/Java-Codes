package RecursionPractice;
import java.lang.StringBuffer;
public class RemovDubl { 
    public static void removingDublicateString(String str,int indx,StringBuffer newstr,boolean arr[]){ 
        if(indx==str.length()){ 
            System.out.print(newstr); 
            return;
        }  
        char currChar=str.charAt(indx); 
        if(arr[currChar-'a']==true){ 
            removingDublicateString(str, indx+1, newstr, arr);
        } 
        else{ 
            arr[currChar-'a']=true; 
            removingDublicateString(str, indx+1,newstr.append(currChar), arr);
        }

    }
    public static void main(String args[]){ 
        boolean arr[]=new boolean[26]; 
        String str="appnnacollege";
        int indx=0; 
        StringBuffer newstr=new StringBuffer(""); 
        removingDublicateString(str, indx,  newstr, arr); 


        
    }
}
