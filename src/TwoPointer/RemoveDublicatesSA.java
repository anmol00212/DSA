package TwoPointer;

public class RemoveDublicatesSA {
    public static int removeDuplicates(int[] nums) {
        int n=nums.length;
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i-1]!=nums[i]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.println(removeDuplicates(nums));
    }
}
