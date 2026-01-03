package Array;
public class _08_second_largest {

    public static int secondLargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        int result = 0;

        for(int i = 0 ; i < num.length ; i++){
          if(num[i] < num[largest]){
            if(result == 0){
                result = i;
            }
            else if(num[i] >num[result]){
                result =i;
            }
            
          }
          
        }
        return result;
        
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,7,5};
        System.out.println("Second lsrgest number is :" + secondLargest(num));
    }
}
