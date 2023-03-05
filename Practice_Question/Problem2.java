package Practice_Question;
import java.lang.StringBuffer;
public class Problem2 {  
    public static void printing_substring(String str){  
        StringBuffer sb=new StringBuffer(""); 
        //sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++){  
            int start=i;
            for(int j=i;j<str.length();j++){ 
                int end=j;  
                for(int k=start;k<=str.length();k++){  
                    //if(str.charAt(k)!=str.charAt(k+1)) { 
                        System.out.print((str.charAt(k))); 

                    //}
                  
                } 


            }
        } 

    }
    public static void main(String args[]){ 
        String str="abacsabcde"; 
        printing_substring(str); 

    }
    
}
