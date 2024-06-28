import java.util.Scanner;

public class fibonacci {

    public static void main(String args[]){
        int term,a=0,b=1;
        System.out.println("Enter");
        Scanner sc=new Scanner(System.in);
        term= sc.nextInt();

        returnans(term,a,b);
//        System.out.println(+ ans);
    }

    public static int returnans(int term,int a, int b){
        int c;
        for (int i=1; i<=term;i++){
            System.out.print( a+" ");
            c=a+b;
            a=b;
            b=c;
        }
        return -1;
    }
}
