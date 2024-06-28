import java.util.Scanner;

public class automorphous {
    public static void main(String args[]){
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter A Num:");
        num =sc.nextInt();
        int square=num*num;

        AutoCheck(num,square);
    }

    private static void AutoCheck(int num, int square) {
        int temp=num;
        int count=0;

        while (temp>0) {
            count++;
            temp=temp/10;
        }
        System.out.println("Count:"+count  );
        System.out.println("Square:"+square);
        int LD=(int)(square%(Math.pow(10,count)));

        if (LD == num) {
            System.out.println("Automorphic");
        }
        else {
            System.out.println("Not Automorphic");
        }
    }
}
