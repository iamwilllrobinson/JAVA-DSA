import java.util.Arrays;

public class max_min {
    public static int maximum(int[] arr) {
        Arrays.sort(arr);
        int max=arr[0];
        if(arr.length==1) {
            return max;
        }

        for (int i = 1; i < arr.length ; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }  public static int minimum(int[] arr) {
        Arrays.sort(arr);
        int max=arr[0];
        if(arr.length==1) {
            return max;
        }

        for (int i = 1; i < arr.length ; i++) {
            if(max>arr[i]){
                max=arr[i];
            }
        }
        return max;
    }


    public static void main (String args[]){
       int[]arr={22,3,42,12};
        System.out.println(maximum(arr));
        System.out.println(minimum(arr));
    }
}
