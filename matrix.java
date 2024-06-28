import java.util.Scanner;

public class matrix {
    public static void main (String[] args){
        int arr1[][]={{1,2,3,4},{2,3,4,4},{3,4,5,5}};
        int arr2[][]={{1,2,3},{2,3,4},{3,4,5}};
        int arr;
        Scanner sc = new Scanner(System.in);
 int arr3[][]=new int[3][3];

 int col= arr1[0].length;
        System.out.println(col);
        System.out.println();
        System.out.println();
 for (int i=0;i<3;i++){
     for (int j=0;j<3;j++){
         arr3[i][j]=arr1[i][j] + arr2[i][j];
         System.out.print(" "+arr3[i][j] +" " +arr1[i][j]);
     }
     System.out.println();
 }
    }
}
