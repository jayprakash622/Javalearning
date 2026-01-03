package Array;
public class _03_smallest_number {
    public static int smallest(int num[]) {
        int smaller = Integer.MAX_VALUE;
        for(int i = 0 ; i < num.length ; i++){
             if(smaller > num[i]){
                smaller = num[i];
             }
            
             }
        
        return smaller;
      } 
    public static void main(String[] args) {
        int num[] = {22,43,3,5,6,1,8,9};
        System.out.println("smallest number is : " + smallest(num));

    }
   
    

}