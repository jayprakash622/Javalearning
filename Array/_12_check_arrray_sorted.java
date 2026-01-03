package Array;
public class _12_check_arrray_sorted {

    public static boolean sorted(int num[]) {

        for(int i  =  0 ; i < num.length ; i++){
            for(int j   = i+1 ; j <num.length ; j++){
                if(num[j] < num[i]){
                    return false;
                }
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        int num[ ] = {2,3 ,4 ,5,6};
        sorted(num);

        System.out.println(sorted(num));
    }
}