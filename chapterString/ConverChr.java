package chapterString;

import java.util.*;

public class ConverChr {
    public static void main(String args[]) {
        String str = " i am nityanand bhushan";
        String str1 = " ";
        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            } else {
                sb.reverse();
                str1 += sb;
                str1 += ' ';
                sb.delete(0, sb.length());

            }
            sb.append("");
        }
        sb.reverse();
        str1 += sb;
        System.out.print(str1);
    }
}
