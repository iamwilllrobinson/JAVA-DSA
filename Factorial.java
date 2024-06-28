import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        int n,fd=1;
        System.out.print("Enter:");
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();

        while (n!=0){
            fd=fd*n;
            n--;
        }
        System.out.println("FActorial:"+fd);
    }
}
