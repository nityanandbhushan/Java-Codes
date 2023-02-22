package chapterString;
public class String {
    public static void printing_string(String fullName){ 
        for(int i=0;i<fullName.length()-1;i++){ 
            System.out.print(fullName.charAt(i)+" ");
        } 


    } 
    public static void main(String args[]){ 
        String firstName='Nitya';  
        String lastName='Nand'; 
        String fullName=firstName+" "+lastName; 
        printing_string(fullName); 


    }
    
}
