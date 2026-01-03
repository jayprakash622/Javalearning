package Array;
public class _08_second_largest {

    public static int secondLargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int i = 0 ; i < num.length ; i++){
          if(num[i] > largest){
              secondlargest =  largest
                largest =num[i] ;
            }
            else if(num[i] >secondlargest && num[i] != largest){ 
               secondlargest =  num[i] ;
            }
            
          }
          
        }
        return secondlargest;
        
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,7,5};
        System.out.println("Second largest number is :" + secondLargest(num));
    }
}
