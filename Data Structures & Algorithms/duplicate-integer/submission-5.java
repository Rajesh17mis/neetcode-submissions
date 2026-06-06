class Solution {
    public boolean hasDuplicate(int[] nums) {
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++)
        //     {
        //         if(nums[i]==nums[j])
        //         {
        //             return true;
        //         }
        //     }
        // }
        // return false;
        HashSet<Integer> a = new HashSet<>();
        for(int i : nums){
            if(!a.add(i)) {
                return true;
            }
        }
        return false;
    }
}