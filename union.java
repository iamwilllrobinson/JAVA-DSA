import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class union {
    public static int doUnion(int a[], int n, int b[], int m) {
        int[] result = new int[n + m];
        List<Integer> finall = new ArrayList<>();
        int index = 0;

        // Combine both arrays into the result array
        for (int num : a) {
            result[index++] = num;
        }
        for (int num : b) {
            result[index++] = num;
        }
        Arrays.sort(result);
        for(int i=0;i<result.length-1;i++){
                 if(result[i]!=result[i+1]){
                    finall.add(result[i]) ;
                }

        }
        finall.add(result[result.length-1]);
        return finall.size();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {4, 5, 6, 7, 8};
        int n = a.length;
        int m = b.length;

        System.out.println(doUnion(a, n, b, m)); // Output: 8
    }
}
