class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] a = new int[2];
        // for(int i=0; i<nums.length-1; i++){
        //     for(int j=i+1; j<nums.length; j++)
        //     {
        //         if(nums[i]+nums[j]==target){
        //             a[0]=i;
        //             a[1]=j;
        //         }
        //     }
        // }
        // return a;
        Map<Integer, Integer> a = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int subValue = target-nums[i];
            if(a.containsKey(subValue))
            {
                return new int[]{a.get(subValue), i};
            }
            a.put(nums[i], i);
        }
        return new int[]{};
    }
}
