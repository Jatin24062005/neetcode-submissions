class Solution {
    public void solve(int[] nums ,int idx,List<List<Integer>> result ,List<Integer> temp){
        if(idx >= nums.length){
            if(!result.contains(new ArrayList<>(temp))){
                result.add(new ArrayList<>(temp));
            }
            return;
        }

        temp.add(nums[idx]);
        solve(nums,idx+1,result,temp);
         //backtrack
         temp.remove(temp.size()-1);
        solve(nums,idx+1,result,temp);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);

        solve(nums,0,result,temp);
        return result;
    }
}
