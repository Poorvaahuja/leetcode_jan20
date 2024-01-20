class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] ans = new int[k];
        int temp[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            temp[i] = nums[i];
        }
        Arrays.sort(temp);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=temp.length-1; i>= nums.length-k; i--){
            map.put(temp[i], map.getOrDefault(temp[i], 0)+1);
        }
        int ind = 0;
        for(int i=0; i<nums.length; i++){
            if(ind == k){
                break;
            }
            if(map.containsKey(nums[i])){
                if(map.get(nums[i]) == 1){
                    map.remove(nums[i]);
                }
                else{
                    map.put(nums[i], map.get(nums[i])-1);
                }
                ans[ind] = nums[i];
                ind++;
            }
        }
        return ans;
    }

}
