class Solution {
    public void combination(int[] nums, int target, int sum, int index,
                            List<List<Integer>> result, List<Integer> temp) {

        if (sum == target) {
            result.add(new ArrayList<>(temp));
            return;
        }

        if (sum > target || index >= nums.length) {
            return;
        }

        // PICK
        temp.add(nums[index]);

        combination(nums, target, sum + nums[index],
                    index, result, temp);

        // BACKTRACK
        temp.remove(temp.size() - 1);

        // NOT PICK
        combination(nums, target, sum,
                    index + 1, result, temp);
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();

        combination(nums, target, 0, 0, result, new ArrayList<>());

        return result;
    }
}