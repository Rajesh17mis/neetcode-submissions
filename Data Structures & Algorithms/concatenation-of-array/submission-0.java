class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] a = new int[nums.length*2];
        for(int i=0; i<nums.length; i++){
            a[i]=nums[i];
        }
        for(int j=nums.length; j<nums.length*2; j++){
            a[j]=nums[j-nums.length];
        }
        return a;
    }
}