package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java;

public class kadanMax { 
    public static void kadans_maxsubarray(int arr[]){  
        int ms=Integer.MIN_VALUE;
        int cs=0; 
        for(int i=0;i<arr.length;i++){ 
            cs=cs+arr[i]; 
            if(cs<0){ 
                cs=0;
            } 
            ms=Math.max(cs,ms);
        } 
        System.out.println(ms);

    } 
    public static void main(String args[]){ 
        int arr[]={2,3,4,5,6,7,8,9};  
        //{-2,-3,4,-1,-2,1,5,-3} 
        kadans_maxsubarray(arr);

    }
    
}
