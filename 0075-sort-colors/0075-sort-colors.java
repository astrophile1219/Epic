class Solution {
    public void sortColors(int[] nums) {

        // int n = nums.length;
        // int mid = 0;
        // int low = 0;
        // int high = n-1;
        
        // while (mid <= high) {
        //     if (nums[mid] == 0) {
        //         int t = nums[mid];
        //         nums[mid] = nums[low];
        //         nums[low] = t;
        //         mid++;
        //         low++;
        //     }
        //     else if (nums[mid] == 2) {
        //         int t = nums[mid];
        //         nums[mid] = nums[high];
        //         nums[high] = t;
        //         high--;
        //     }
        //     else {
        //         mid++;
        //     }
        // }

        
    //  Optimal One
        int a = 0;
        int b = 0;
        for (int x : nums) {
            if (x == 0) a++;
            if (x == 1) b++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (a > 0) {
                nums[i] = 0;
                a--;
            }
            else if (b > 0) {
                nums[i] = 1;
                b--;
            }
            else {
                nums[i] = 2;
            }
        }
    }
}