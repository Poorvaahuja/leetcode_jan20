class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            
        }
        int res = 0;
        for(int i: map.keySet()){
            if(k >0 && map.containsKey(i+k) || k == 0 && map.get(i) >1)
                res++;
        }
        return res;
    }
}
