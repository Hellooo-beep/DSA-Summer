
public class twosum {

	public static void main(String[] args) {
		int [] nums = {2,7,11,15};
		int target = 13;
		int [] result  = sum(nums, target);
		
		if (result.length == 2) {
            System.out.println("Indexes: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found.");
        }		
		
		
	}
	public static int[] sum (int [] nums, int target) {
		for (int i =0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] {i ,j};
				}
			}
		}
		return new int [] {};
	}

}
