class Solution {
    public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			int another = target - nums[i];
			
			for (int j=i+1; j < nums.length; j++) {
				if (nums[j] == another) {
					int[] arr = {i, j};
					
					return arr;		
				}
			}
		}
	    return null;
    }
}