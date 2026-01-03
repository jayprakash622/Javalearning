package Array;
public class _09_count_number {
public static void countnumber (int arr[] ) {
    int twocount = 0 ;
    int onecount =  0 ;
     int zerocount =  0 ;

    for(int i = 0 ; i < arr.length ; i++){
        if(arr[i] == 2){
            twocount++;
        }
     
        if(arr[i] == 1){
            onecount++;
        }
       
         if(arr[i] == 0){
            zerocount++;
        }

    } 
     System.out.println("twocount is : " + twocount);
     System.out.println("onecount is : " + onecount);
     System.out.println("zerocount is : " + zerocount);

}
    public static void main(String[] args) {
        int arr[]  = {2,2,2,1,2,1,0,0 ,0,0,2,0,1};
        countnumber(arr);

       
    }
}
       