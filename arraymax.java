public class arraymax {

    public static void main (String[] args){
        int[] arr =new int []{76,25,85,35};
        int max = arr[0];

        for(int i =0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
