package Array;
public class _13_duplicate_remove_element {

    public static int duplicate(int num[]) {

        int result = 1;

        for (int i = 1; i < num.length; i++) {
            if (num[i] != num[result - 1]) {
                num[result] = num[i];
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int num[] = {1,1,1,2,2,2};
        int len = duplicate(num);

        for (int i = 0; i < len; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
