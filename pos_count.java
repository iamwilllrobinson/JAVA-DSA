import java.util.ArrayList;
import java.util.List;

class pos_count {
    public int firstMissingPositive(int[] nums) {
        List<Integer> positive =new ArrayList<>();
        int n=nums.length;
        int i=0,count=0;;
        while(n<0) {
            if(nums[i]>=0){
                count++;
            }
            n--;
            i++;
        }
        return count;
    }

    public void main (String args[]){
        int[] nums={2,-3,1,3};

    }
}