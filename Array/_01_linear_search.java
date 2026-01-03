package Array;
public class _01_linear_search {
      public static int linearsearch(int num[] , int key){

        for(int i=0 ; i<num.length; i++){
          if(num[i] == key){
            return i;
          }
        }
        return -1;
      }

    public static void main(String[] args) {
        int num[] = {2,4,6,7,10,12};
        int key = 2;

        int index = linearsearch(num, key);

        if(index == -1){
            System.out.println("element is not found");
        }
        else{
            System.out.println("key is at index : " + index);
        }

    }
    
    
}
