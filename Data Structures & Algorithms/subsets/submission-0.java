class Solution {
    public void subset(int[] nums,int start,int end , List<List<Integer>> result,  List<Integer> temp){
        if(start > end){
            result.add(new ArrayList<>(temp));
            return;
        }
            int curr = nums[start];
            temp.add(curr);
            subset(nums,start+1,end,result, temp);

            temp.remove(temp.size() - 1);
            subset(nums,start+1,end,result, temp);

    }
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> result = new ArrayList<>();
     List<Integer> temp = new ArrayList<>();
     subset(nums,0,nums.length-1,result,temp);
        return result;
    }
}
