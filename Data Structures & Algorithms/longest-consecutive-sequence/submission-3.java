class Solution {
    public int longestConsecutive(int[] nums) {
        // if(nums.length==0){
        //     return 0;
        // }
        // Arrays.sort(nums);
        // int temp=1;
        // int ffinal=1;
        // for(int i=0; i<nums.length-1; i++){
        //     if(nums[i+1]-nums[i] == 1){
        //         temp+=1;
        //     }
        //     else if(nums[i+1]-nums[i] == 0){
        //         continue;
        //     }
        //     else{
        //         temp=1;
        //     }
        //     if(temp > ffinal){
        //         ffinal = temp;
        //     }
        // }
        // return ffinal;

        HashSet<Integer> hset = new HashSet<>(nums.length);
        if(nums.length==0){
            return 0;
        }

        for(int i=0; i<nums.length; i++){
            hset.add(nums[i]);
        }

        int longestStreak = 0;
        for(int num : hset){
            if(!hset.contains(num-1)){
                int currentStreak = 1;
                int currentNum = num;

                while(hset.contains(currentNum+1)){
                    currentNum += 1;
                    currentStreak += 1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;

    }
}
