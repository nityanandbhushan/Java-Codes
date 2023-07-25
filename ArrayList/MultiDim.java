package ArrayList;
import java.util.ArrayList;
public class MultiDim { 
    public static void main(String args[]){ 
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>(); 
        ArrayList<Integer> list1=new ArrayList<>(); 
        for(int i=1;i<8;i++){ 
            list1.add(i*2);
        } 
        ArrayList<Integer> list2=new ArrayList<>(); 
        for(int j=1;j<8;j++){ 
            list2.add(j*3);
        } 
        mainlist.add(list1); 
        mainlist.add(list2);  
        for(int l=0;l<mainlist.size();l++){  
            ArrayList<Integer> curr=mainlist.get(l);
            for(int m=0;m<curr.size();m++){ 
                System.out.print(curr.get(m)+" ");
            } 
            System.out.println();
        }

    }
    
}
