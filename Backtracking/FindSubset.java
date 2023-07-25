package Backtracking;

public class FindSubset { 
    public static void findingSubset(String str,String ans,int i){  
        if(i==str.length()){ 
            if(ans.length()==0){ 
                System.out.print("null");
            } 
            else{ 
                System.out.println(ans + " ");
            }   
       
            return; 
             }
        
            findingSubset(str,ans+str.charAt(i),i+1); 
            findingSubset(str,ans,i+1);
        }
    public static void main(String args[]){ 
        String str="ab"; 
        findingSubset(str,"",0);

    }
}
