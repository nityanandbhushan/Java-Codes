package PracticeQuestionOfAlpha;

public class TrappingWater {  
    public static void findingTrapwTer(int arr[]){    
        int maxleft[]=new int [arr.length];  
        //0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1 
        maxleft[0]=arr[0];
        for(int i=1;i<arr.length;i++){  
            maxleft[i]=Math.max(maxleft[i-1],arr[i]);
        }    
      

        
        int maxright[]=new int[arr.length];  
        //0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1 
        maxright[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){  
            maxright[i]=Math.max(maxright[i+1],arr[i]);

        }  
      
        int trapwater=0;  

        for(int i=0;i<arr.length;i++){ 
            int minbound=Math.min(maxleft[i],maxright[i]); 
            int trapw=minbound-arr[i]; 
            trapwater=trapwater+trapw;
        } 
        System.out.print("trapping water "+ trapwater);

       
        

    } 
    public static void main(String args[]){  
        int arr[]={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1}; 
        findingTrapwTer(arr);

    }
    
}
