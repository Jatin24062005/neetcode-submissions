class Solution {

    public int skipDuplicates(int[] nums, int index) {

        if (index + 1 >= nums.length ||
            nums[index] != nums[index + 1]) {
            return index + 1;
        }

        return skipDuplicates(nums, index + 1);
    }

    public void combination(int[] nums, int target, int sum, int index,
                            List<List<Integer>> result, List<Integer> temp) {

        if (sum == target) {
            result.add(new ArrayList<>(temp));
            return;
        }

        if (index >= nums.length || sum > target) {
            return;
        }

        // PICK
        temp.add(nums[index]);

        combination(nums, target, sum + nums[index],
                    index + 1, result, temp);

        // BACKTRACK
        temp.remove(temp.size() - 1);

        // NOT PICK - skip all duplicate occurrences
        int nextIndex = skipDuplicates(nums, index);

        combination(nums, target, sum,
                    nextIndex, result, temp);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();

        combination(candidates, target, 0, 0,
                    result, new ArrayList<>());

        return result;
    }
}