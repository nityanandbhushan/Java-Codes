package pracitceRough;
public class PrctRou {  
    public static void sub_array(int arr[]){  
        int leftmax[]= new int[arr.length]; 
        leftmax[0]=arr[0]; 
        for(int i=1;i<arr.length;i++){ 
           leftmax[i]=Math.max(leftmax[i-1],arr[i]); 

        } 
        int rightmax[]=new int[arr.length]; 
        rightmax[arr.length-1]=arr[arr.length-1]; 
        for(int i=arr.length-2;i>=0;i--){  
            rightmax[i]=Math.max(rightmax[i+1],arr[i]);

        }  
        int totaltrapwat=0;
        for(int i=0;i<arr.length;i++){  
            int waterlevel=Math.min(leftmax[i],rightmax[i]); 
            int trapwater=waterlevel-arr[i]; 
            totaltrapwat+=trapwater; 


        } 
        System.out.print("total trappin water"  + totaltrapwat);
        

       
    }  
 
    public static void sell_buystoc(int arr[]){  
        int max=0; 
        int minimumbuyprice=arr[0]; 
      for(int i=0;i<arr.length-1;i++){  
        if(minimumbuyprice>arr[i+1]){ 
            minimumbuyprice=arr[i+1]; 

        } 
        else{ 
            int profit=arr[i+1]-minimumbuyprice; 
            max=Math.max(max,profit);
        }

      } 
      System.out.print(max);

        } 
        public static void bubble_sort(int arr[]){ 
            for(int turn =0;turn<arr.length-1;turn++){ 
                for(int i=0;i<arr.length-1-turn;i++){  
                    if(arr[i]>arr[i+1]){ 
                        int temp=arr[i]; 
                        arr[i]=arr[i+1]; 
                        arr[i+1]=temp;
                    } 

                }
            } 
            for(int i=0;i<arr.length;i++){ 
                System.out.print(arr[i]);
            }
        } 
        public static void selection_sort(int arr[]){
            for(int i=0;i<arr.length-1;i++){ 
                 int min=0;
                for(int j=i+1;j<arr.length-1;j++){  
                if(arr[min]>arr[j])
                { 
                  min=j; 
                } 

                     
                int temp=arr[min]; 
                arr[min]=arr[i];
                arr[i]=temp;  
            }
               

            } 
            for(int i=0;i<arr.length;i++){ 
                System.out.print(arr[i]);
            } 
          

        } 
        public static void insertion_sort(int arr[]){ 
            for(int i=1;i<arr.length;i++){  
                int curr=i; 
                int prev=i-1; 
                while(prev>=0 && arr[prev]>arr[curr]){ 
                    arr[prev+1]=arr[prev]; 
                    prev--;


                } 
                arr[prev]=arr[curr];
               
                }
            } 

     
    public static void main(String args[]){ 
      //  int arr[]={4,2,0,6,3,2,5}; 
       /// sub_array(arr);  
       //int arr[]={7,1,5,3,6,4}; 
       //sell_buystoc(arr); 
      int arr[]={5,4,3,2,1}; 
       //bubble_sort(arr); 
       selection_sort(arr);
         


        

    } 
}
