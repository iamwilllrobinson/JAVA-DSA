public class Os {
    public static void main(String[] args) {
        int N = 5;
        int[] arr = {0, 2, 1, 2, 0};

        sort012(arr, N);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        // Output should be: 0 0 1 2 2
    }

    public static void sort012(int[] arr, int N) {
        int low = 0;
        int mid = 0;
        int high = N - 1;
        int temp;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}
