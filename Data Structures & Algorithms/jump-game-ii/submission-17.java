class Solution {
    public int jump(int[] nums) {
        if(nums.length ==1 ){
            return 0;
        }
        
        int prev = 0;
        int step =0;
        int i =0;
        int max = prev;


        while(i<nums.length){
            if(prev < i){
                return -1;
            }
            int r =i;
            while(r <= prev){
             int curr =  nums[r]+r;
             max = Math.max(max,curr);
             r++;
            } 
           
           //run loop

           if(max > prev) {
              step++;
              prev = max;
           }

        if(max >= nums.length-1){
            return step;
        }
            i=r++;

        }

        return 0;
    }
}
