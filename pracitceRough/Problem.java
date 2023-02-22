package pracitceRough;

public class Problem { 
    public static void printingString(String st){  
        String strg= new String(""); 
        
        for(int i=0;i<st.length();i++){  
            int count=1;
        while(i<st.length()-1 && st.charAt(i)==st.charAt(i+1)){  
                   count++; 
                   i++; 
                   if(count >=1){ 
                    strg+=st.charAt(i);
                   } 

            

        }
           
        } 
        for(int i=0;i<strg.length();i++){ 
            System.out.print(strg.charAt(i));
        } 

    } 
    public static void main(String args[]){ 
        String st="nityanand"; 
        printingString(st);
    }
    
}
