class Solution {
    public void combination(int[] nums,int target,int sum,int start ,List<List<Integer>> result , List<Integer> temp){
        if(sum> target){
            return;
        }

        if(sum == target){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i =start;i<nums.length;i++){
            int curr = nums[i];
             
            temp.add(curr);
            combination(nums,target,sum+curr,i,result,temp);

            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>  result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
         combination(nums,target,0,0,result,temp);
         return result;
    }
}
