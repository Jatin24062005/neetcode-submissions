class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
     
    for(int i =0;i<nums.length;i++){
        int x = nums[i];
        int l =i+1;
        int r = nums.length-1;
        
       while(l < r){
        int sum = x + nums[l]+nums[r];
       if(sum ==0){
        List<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(nums[l]);
        list.add(nums[r]);
        if(!ans.contains(list)){
            ans.add(list);
        }
        l++;
        r--;
       }

       if(sum< 0){
        l++;
       }else if (sum >0){
         r--;
       }
      
       }
    }
        return ans;
    }
}
