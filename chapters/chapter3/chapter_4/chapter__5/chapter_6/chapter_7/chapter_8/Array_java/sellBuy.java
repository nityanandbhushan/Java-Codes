package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java;

public class sellBuy {
    public static void sell_buy(int prices[]){
        int buyprice=Integer.MAX_VALUE; 
        int maxprofit=0; 
        for(int i=0;i<prices.length;i++){ 
            if(buyprice<prices[i]) { 
                int profit=prices[i]-buyprice; 
                maxprofit=Math.max(maxprofit,profit); 
           }
           else{ 
            buyprice=prices[i];
           }

        }  
        System.out.println("Maximum profit is "+maxprofit);

    }
    public static void main(String args[]){ 
        int prices[]={7,1,5,3,6,4}; 
        sell_buy(prices); 

    }
    
}
