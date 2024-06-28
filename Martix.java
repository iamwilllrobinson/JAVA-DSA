import java.util.Scanner;

public class Martix {
    public static void main(String args[]) {
//        int a[][] = {{1, 2, 1, 2}, {2, 3, 2, 2}, {4, 3, 2, 2}};
//        int b[][] = {{1, 2, 1, 2}, {2, 3, 2, 2}, {4, 3, 2, 2}};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of row:");
        int row = sc.nextInt();
        System.out.println();
        System.out.print("Enter a size of column:");
        int col = sc.nextInt();
        Extract ex = new Extract();
        ex.Extract1(row,col);
    }
}
       class Extract {
           Scanner sc = new Scanner(System.in);
           public void Extract1(int row, int col) {
               int a[][]=new int[row][col];
               int b[][]=new int[row][col];

               System.out.println("Enter a value of matrix1:");
               for (int k=0;k<row;k++){
                   for (int c1=0;c1<col;c1++){

                       a[k][c1]=sc.nextInt();
                   }
               }System.out.println("Enter a value of matrix2:");
               for (int k=0;k<row;k++){
                   for (int c1=0;c1<col;c1++){

                       b[k][c1]=sc.nextInt();
                   }
               }
               int count = 0;
               int Total_value = col * row;
               for (int i = 0; i < row; i++) {
                   for (int j = 0; j < col; j++) {
                       if (a[i][j] == b[i][j]) {
                           count++;
                       }
                   }
               }
                System.out.println(" " + ans(count, Total_value));
           }

           private static String ans(int count,int Total_value){
               if(count==Total_value){
                   return " Martix are equal";
               }
               else {
                   return " Not equal";
               }
           }

       }

