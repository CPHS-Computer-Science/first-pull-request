public class ArrayUtils {

    public static int sum(int[] nums){
        if(nums[0] != null) {
            int total = nums[0]
            for (int x = 1; x < nums.size; x++)
                total += nums[x];
            return total;
        }
    }

}
