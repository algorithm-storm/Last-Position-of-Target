public class Solution {
    /*
     * @param nums: An integer array sorted in ascending order
     * @param target: An integer
     * @return: An integer
     */
    public int lastPosition(int[] nums, int target) {

        if(nums == null || nums.length == 0){
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;

        while(start + 1 < end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                start = mid;
            }
            if(nums[mid] > target){
                end = mid - 1;
            }
            if(nums[mid] < target){
                start = mid + 1;
            }
        }

        if(nums[end] == target){
            return end;
        }
        if(nums[start] == target){
            return start;
        }

        return -1;
    }

    public static void main(String[] args){
        Solution test = new Solution();
        int[] nums = {1, 2, 2, 4, 5, 5};
        System.out.print(test.lastPosition(nums,2));
    }

}


