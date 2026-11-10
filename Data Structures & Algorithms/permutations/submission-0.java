class Solution {
public void solve(int[] nums,int start,List<List<Integer>> result , List<Integer> 
temp){
 
   if(temp.size() == nums.length){
        result.add(new ArrayList<>(temp));
        return;
   }

    for(int i = 0;i<nums.length;i++){
     
        int curr = nums[i];
        
        if(temp.contains(curr)){
            continue;
        }

        temp.add(curr);
        solve(nums,i,result,temp);

        temp.remove(temp.size()-1);

    } 
}

    public List<List<Integer>> permute(int[] nums) {
         int start =0;
         List<List<Integer>> result = new ArrayList<>();
         List<Integer> temp = new ArrayList<>();


         solve(nums,start,result,temp);
         return result;
    }
}
