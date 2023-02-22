package Practice_Question;

public class Problem {  
    public static void twoSum(int nums[], int target) {  
        for(int i=0;i<nums.length-1;i++){ 
            int start=i; 
            for(int j=i+1;i<nums.length-1;j++){ 
                int end=j; int sum=0;
                for(int k=start;k<=end;k++){ 
                    sum+=nums[k];
                } 
                if(target==sum){ 
                    System.out.print(i+","+j);
                }
            }
        }

        
    } 
    public static void main(String args[]){ 
        int nums[]={2,7,11,15}; 
        int target=20; 
       twoSum(nums,target);
    } 

    
     

}
    
