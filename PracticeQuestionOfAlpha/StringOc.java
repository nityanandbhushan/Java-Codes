package PracticeQuestionOfAlpha;
import java.util.*;
public class StringOc { 
    public static void findOccurance(String ny){   
        int a=0; 
        int e=0; 
        int i=0; 
        int o=0; 
        int u=0; 

        for(int j=0;j<ny.length();i++) 
        {  
            if(ny.charAt(j)==a){ 
                a++;
            } 
            if(ny.charAt(j)==e){ 
                e++;
            }  
            if(ny.charAt(j)==i){ 
                i++;
            } 
            if(ny.charAt(j)==o){ 
                o++;
            } 
            if(ny.charAt(j)==u){ 
                u++;
            }

        } 
        System.out.print("Occurence of Vowels a "+a+" Occurence of Vowels e "+e+" Occurence of Vowels i "+i+" Occurence of vowels o "+o+" Occurence of Vowels u "+u); 

    }
    public static void main(String args[]){ 
        Scanner sc =new Scanner(System.in); 
        System.out.print(" Enter Your String"); 
        String ny= sc.nextLine();  
        findOccurance(ny);

        
 
    }
}
