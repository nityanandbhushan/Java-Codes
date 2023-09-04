package StackArr;
import java.util.*;
public class ValidPran {
    public static boolean isValid(String str) {
        Stack<Character> sb = new Stack<>();
        if(str.length()==1){ 
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                sb.push(ch);
            } else {
                if (sb.isEmpty()) {
                    return false;
                }
                    if (sb.peek()=='(' && ch==')' || sb.peek()=='{' && ch=='}' || sb.peek()=='['&& ch==']') {
                           sb.pop();
                } else{ 
                    return false;
                }    
        }   
    } 
    return true;
    }
    public static void main(String args[]) {
        String str = "(";
        System.out.print(isValid(str));
    }
}