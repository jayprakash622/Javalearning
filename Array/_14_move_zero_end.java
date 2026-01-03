package Array;
public class _14_move_zero_end {
    public static void movezero(int num[]) {

        for(int i = 0 ; i <num.length ; i++){
            if(num[i] == 0){
                for(int  j  = i+1; j < num.length; j++){
                    if(num[j] != 0){
                          int temp = num[i];
                        num[i] = num[j];
                        num[j] = temp;
                        break;
                    } 
                }
            }
            
        }
    

    /*    // second method

          int k = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                num[k] = num[i];
                k++;
            }
        }

        while (k < num.length) {
            num[k] = 0;
            k++;
        }
    }
    
        */
    }
    public static void main(String[] args) {
        int num[] = {2,4,5,0,6,28,0,55,1};
        movezero(num);
    for(int i = 0 ; i <num.length ; i++){
        System.out.print(num[i] +  " ");
    }
}
}