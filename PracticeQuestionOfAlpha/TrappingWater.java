package PracticeQuestionOfAlpha;

public class TrappingWater {  
    public static void findingTrapwTer(int arr[]){  
        //int curr=arr[0];   
        int max=Integer.MIN_VALUE;
        int maxleft[]=new int [arr.length];  
        //0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1
        for(int i=0;i<arr.length;i++){  
            max=Math.max(max,arr[i]); 
            maxleft[i]=max;
        }  
        for(int i=0;i<arr.length;i++){ 
            System.out.println(maxleft[i]);
        }

        
        int maxright[]=new int[arr.length];  
        //0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1
        for(int i=arr.length-1;i>=0;i--){  
            max=Math.max(max,arr[i]);  
            maxright[i]=max;

        }  
        for(int i=0;i<arr.length;i++){ 
            System.out.println(maxright[i]);
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
