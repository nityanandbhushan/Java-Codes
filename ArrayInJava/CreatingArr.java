package ArrayInJava;

public class CreatingArr {
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
