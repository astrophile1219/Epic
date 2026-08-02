class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (target == sum) {
                return new int[]{left+1,right+1};
            }
            else if (target > sum) {
                left++;
            }
            else right--;
         }

        return new int[]{0};

        // for (int i = 0; i<n; i++) {
        //     int sum = arr[left] + arr[right];
        //     if (sum == target) break;
        //     else if (sum > target) {
        //         right--;
        //     }
        //     else {
        //         left++;
        //     }
        // }
        // return new int[] {left+1,right+1};
    }
}