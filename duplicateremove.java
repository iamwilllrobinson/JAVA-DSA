import java.util.Arrays;

public class duplicateremove {
    public static void main(String[] args) {
        int[] arr = {10, 30, 60, 12, 12, 23, 1, 10,10,10, 60};
        Arrays.sort(arr);
//        for (i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        int length = arr.length;
        remove(arr, length);
    }

    public static void remove(int[] arr, int len) {

        int[] temp = new int[len];
        int j=0;
        if (len == 0 || len == 1) {
            System.out.println(arr[len]);
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    temp[j++] = arr[i];
                }
            }
            temp[j++]=arr[len-1];

        }
        for (int i = 0; i < j; i++) {
             arr[i]=temp[i];
            System.out.println(arr[i]);

        }

    }
}