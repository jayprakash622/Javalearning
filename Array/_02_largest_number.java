package Array;
public class _02_largest_number {
    public static int largest(int num[] ){
        int largest= Integer.MIN_VALUE;

        for(int i = 0 ; i < num.length;i++){
            if(largest < num[i]){
                largest = num[i];
            }
        }
        
        return largest;
    }
    public static void main(String[] args) {
        int num[] = {2,4,3,6,5,8,7,9};
        
        System.out.println("largest number is : " + largest(num));
    }
    
}
