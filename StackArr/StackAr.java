package StackArr;
import java.util.*;
public class StackAr {
    static class creatStack{ 
        static ArrayList<Integer> list=new ArrayList<>(); 
            public static boolean isEmpty(){  
                if(list.size()==0){ 
                    return true;
                } 
                else{ 
                    return false;
                }  
            }   


            //---------------------------Push element into the stack-----------------------------


            public static void push(int data){ 
                list.add(data);
            }   



            //------------------------Pop stack element--------------------------------------

            
            public static int pop(){ 
                if(list.size()==0){ 
                    return -1;
                }
                int top=list.get(list.size()-1);  
                list.remove(list.size()-1);
                 return top;
            }  

            //--------------------find the peek value---------------------------------


            public static int  peek(){ 
                return list.get(list.size()-1);
            } 

            //---------------------Printing the stack Element------------------------------
            public static void printElement(){  
                if(list.size()==0){ 
                    System.out.println(-1);
                }
                while(list.size()!=0){ 
                    int top=list.get(list.size()-1); 
                    System.out.println(top); 
                    list.remove(list.size()-1);

                }
            }
    } 
    public static void main(String args[]){   
        creatStack s=new creatStack();
        System.out.print(s.isEmpty()); 
        s.push(90);
        s.push(900);
        s.push(190);
        s.push(199);   
        System.out.println("Pop Element" +  s.pop() );
        System.out.println("Peek Element" +  s.peek() ); 
        s.printElement();

    }
  
}