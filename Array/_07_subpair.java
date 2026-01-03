package Array;
public class _07_subpair {

    public static void subpair(int num[] ) {
        int ts = 0;
        int sum  = 0 ;
        for(int i  = 0 ; i < num.length; i++){
           int  start = i;
        
           for(int j = i ; j < num.length ; j++){
            int end = j;

                for(int  k =  start ; k <= end ; k++){
                System.out.print(num[k] + "  ");

                sum =  sum+num[i];
                System.out.println("sum is :" +sum);
               }
               ts++;
            System.out.println();
           }
           System.out.println();
        }
        System.out.println("Toatal subarray is : "+ts);
        
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        subpair(num);
    }
    
}
