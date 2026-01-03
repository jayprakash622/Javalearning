package Array;
public class _06_pair {

    public static void pair(int num[]) {
        int totalpair = 0;
       for(int i = 0 ; i < num.length ; i++){
        int current =  num[i];
         
        for(int j = i+ 1 ; j < num.length ; j++){
            System.out.print("("+current + " , " + num[j]+") ");
            totalpair++;
        }
        System.out.println();
       }
       System.out.println("Total pair is : " + totalpair); 
        
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        pair(num);
    }
}

// total pair formula =  n(n-1)/2
// tc =  o(n^2