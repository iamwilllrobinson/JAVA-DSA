 import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]){
        int num;
        System.out.print("Enter:");
        Scanner sc=new Scanner(System.in);
        num= sc.nextInt();

        if(checker.Armstrongcheck(num)){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not A Armstorng");
        }
    }

public static class checker{
        static boolean Armstrongcheck(int num){
           int sum =0, last,temp =num;
           int digit=0;
           while (num!=0){
               digit++;
               num=num/10;
           }
           int temp1=temp;
           while (temp>0){
            last =temp%10;
            sum+= Math.pow(last,digit);
            temp=temp/10;
           }
           if(sum==temp1){
               return true;
           }
           else
            return false;
        }

}
}
