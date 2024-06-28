public class LOWERMATRIX {
    public static void main(String args[]) {
        int arr1[][] = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
          int row, col;
        row = arr1.length;
        col = arr1[0].length;

        if (row != col) {
            System.out.println("Provide Equal Matrix");
        } else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (j > i) {
                        System.out.print("0 ");
                    } else {
                        System.out.print(arr1[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}