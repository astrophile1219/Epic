class Solution {
       public int[] sortedSquares(int[] nums) {



        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[i] = nums[left] * nums[left];
                left++;
            } else {
                res[i] = nums[right] * nums[right];
                right--;
            }
        }
        return res; 


        // List<Integer> neg = new ArrayList<>();
        // List<Integer> pos = new ArrayList<>();

        // for (int a : nums) {
        //     if (a < 0) {
        //         neg.add(a);
        //     } else pos.add(a);
        // }

        // for (int i = 0; i < neg.size(); i++) {
        //     int a = neg.get(i);
        //     neg.set(i, a * a);
        // }
        // Collections.reverse(neg);
        // for (int i = 0; i < pos.size(); i++) {
        //     int a = pos.get(i);
        //     pos.set(i, a * a);
        // }

        // int i = 0;
        // int j = 0;
        // int m = pos.size();
        // int n = neg.size();
        // int idx = 0;

        // while (i < m && j < n) {
        //     int x = pos.get(i);
        //     int y = neg.get(j);
        //     if (x < y) {
        //         nums[idx++] = x;
        //         i++;
        //     } else {
        //         nums[idx++] = y;
        //         j++;
        //     }
        // }

        // while (i < m) {
        //     nums[idx++] = pos.get(i++);
        // }
        // while (j < n) {
        //     nums[idx++] = neg.get(j++);
        // }
        // return nums;
    }
}