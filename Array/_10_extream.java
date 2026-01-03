package Array;
public class _10_extream {

    public static void extream(int num[]) {

        int first = 0 ;
        int last = num.length - 1 ;

        while(first <= last){
            if(first ==  last){
                System.out.println(num[first] +" ");
            }
            else{
            System.out.print(num[first]+" ");
            System.out.print(num[last]+" ");
            }
            

            first++;
            last--;
        }
        
    }
    public static void main(String[] args) {
        int num[ ] = { 2,3,4,5,6,7,8};
        extream(num);
    }
}
