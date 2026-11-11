class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            int x = nums[i];
            map.put(x,i);
        }

        for(int i = 0 ; i<nums.length;i++){
            int x = nums[i];
            int k = target - x;

            if(map.containsKey(k) && map.get(k) != i){
                return new int[]{i,map.get(k)};
            }
        }
        return new int[]{-1,-1};
    }
}
