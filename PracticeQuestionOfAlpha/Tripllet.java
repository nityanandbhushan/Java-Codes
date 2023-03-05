package PracticeQuestionOfAlpha;

public class Tripllet {  
    public static void findingTrippllet(int arr[]){  
        int sum=0;
        for(int i=0;i<arr.length;i++){ 
            for(int j=i+1;j<arr.length;j++){ 
                for(int k=j+1;k<arr.length;k++){ 
                    sum=arr[i]+arr[j]+arr[k];  
                    if(sum==0){  
                        System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");

                    }
                   
                }
            }
        } 

    }
    public static void main(String args[]){ 
        int arr[]={-1, 0,  1, 2, -1, -4}; 
        findingTrippllet(arr);
    }
    
}
