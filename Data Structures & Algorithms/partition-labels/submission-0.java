class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>(); //char and Last Index

        for(int i =0 ; i<s.length();i++){
            char a = s.charAt(i);
            map.put(a,i);
        }
        int i =0;

        while( i<s.length()){
            char a = s.charAt(i);
            int right = map.get(a);
            int idx =i+1;
            while(idx <= right){
                char x = s.charAt(idx);
                if(map.get(x) > right){
                    right= map.get(x);
                }
                idx++;
            }

            int length = right - i +1;
            result.add(length);
             i = right+1;
        }

      return result;
    }
}
