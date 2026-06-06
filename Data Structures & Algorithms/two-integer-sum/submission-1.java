class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ab= new int[2];
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
            if(a.containsKey((target-nums[i])))
            {
                ab[0] = a.get(target-nums[i]);;
                ab[1] = i;
            }
            a.put(nums[i], i);
        }
        return ab;
    }
}
