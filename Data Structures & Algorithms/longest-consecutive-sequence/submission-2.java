class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int temp=1;
        int ffinal=1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1]-nums[i] == 1){
                temp+=1;
            }
            else if(nums[i+1]-nums[i] == 0){
                continue;
            }
            else{
                temp=1;
            }
            if(temp > ffinal){
                ffinal = temp;
            }
        }
        return ffinal;
    }
}
