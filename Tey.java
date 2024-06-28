public class  Tey {
   static void reverseSubArray(int arr[], int n, int l, int r) {
        //  if(n==1)
        //     System.out.println();

        int temp;

        temp=arr[l-1];
        arr[l-1]=arr[r-1];
        arr[r-1]=temp;

        for(int a:arr)
            System.out.print(" "+a);

    }

    public  static    void main (String args[]){
        int[] arr={1,2,4,5,4,2,4};
        int l=2,r=4;
        reverseSubArray(arr, arr.length, l,r);
    }
}