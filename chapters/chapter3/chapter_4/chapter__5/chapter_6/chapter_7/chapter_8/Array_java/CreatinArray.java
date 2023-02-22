package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java;

public class CreatinArray { 
    public static void update(int arr[]){  
        for(int i=0;i<arr.length;i++){ 
             arr[i]=arr[i]+1;
        }

    }
    public static void main(String args[]){
    int arr[]=new int[10]; 
    arr[0]=89; 
    arr[1]=90;
    arr[2]=71; 
    arr[3]=54; 
    arr[4]=21;  
    update(arr);
    for(int i=0;i<arr.length;i++){ 
        System.out.println(arr[i]);
    } 
}
}
