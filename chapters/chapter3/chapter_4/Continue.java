package chapters.chapter3.chapter_4;

public class Continue 
{ 
    /**
     * @param args
     */
    public static void main(String args[])
    { 
        int n=5; 
        for(int i=0;i<=n;i++)
        { 
            if(i==3)
            { 
                continue;
            } 
            System.out.println(i);
        } 
    }
    
}
