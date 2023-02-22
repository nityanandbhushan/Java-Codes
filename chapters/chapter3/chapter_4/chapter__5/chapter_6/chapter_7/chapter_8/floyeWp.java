package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8;

public class floyeWp { 
    public static void floyed_warshal(int n){  
        int count =1;
        for(int i=1;i<=n;i++)
        { 
            for(int j=1;j<=i;j++)
            {               
                 System.out.print(count +" "); 
                count++;
            } 
            System.out.println(" ");
        }
    }
    public static void main(String args[]){  
        int x=5; 
        floyed_warshal(x);

    }
}
