class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int a = 0;
        int b = 0;
        int c = 0;
        for (int x : nums) {
            if (x == 0) a++;
            else if (x == 1) b++;
            else c++;
        }
        int i = 0;
        while(a != 0) {
            nums[i++] = 0;
            a--;
        }
        while(b != 0) {
            nums[i++] = 1;
            b--;
        }
        while(c != 0) {
            nums[i++] = 2;
            c--;
        }
    }
}