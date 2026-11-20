class Solution {
    public int[] productExceptSelf(int[] nums) {
        int rightp =1;
        int leftp =1;
        int []rp = new int[nums.length];
        int []lp = new int[nums.length];
        int  []output = new int [nums.length];

        for(int i =0;i<nums.length;i++){
            int x = nums[i];
            lp[i]=leftp;
            leftp*=x;

        }


         for(int i =nums.length-1;i>=0;i--){
            int x = nums[i];
            rp[i]=rightp;
            rightp*=x;

            output[i] = lp[i]*rp[i];

        }

        return output;
    }
}  
