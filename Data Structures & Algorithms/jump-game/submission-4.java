class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1) {
            return true;
        }

        int max = 0;
        int prev = nums[0];
        for(int i =1;i<nums.length;i++){
        if (prev < i) {
            return false;
        }
         int curr = nums[i]+i;
         max = Math.max(prev,curr);
    
         if(prev < curr) {
            prev = curr;
         }
    
         if(max >= nums.length-1){
            return true;
         }
        }

            
        
        return false;
        
    }
}
