package Array;
public class _11_uniqe_nu {

    
    public static void main(String[] args) {
        int num[] = {2,3,4,5,6,2,3,4,5,6,7};
        int uniqe = 0;
        for(int i  = 0 ; i < num.length ; i++){
            uniqe = uniqe^num[i];
        }
       System.out.println(uniqe);
        
    }
}
