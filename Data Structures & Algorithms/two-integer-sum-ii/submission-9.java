class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<numbers.length;i++){
            int x = numbers[i];
            map.put(x,i);
        }

        for(int i =0;i<numbers.length;i++){
            int x = numbers[i];
            int k = target -x;

            if(map.containsKey(k)){
                int j = map.get(k);
                return new int[]{i+1,j+1};
            }
        }
        
        return new int[]{-1,-1};
    }
}
