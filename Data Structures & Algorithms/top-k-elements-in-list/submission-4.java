class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }
        Map<Integer, Integer> sortedMapDesc = map.entrySet()
            .stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
            .collect(Collectors.toMap(
                Map.Entry::getKey, 
                Map.Entry::getValue, 
                (e1, e2) -> e1, 
                LinkedHashMap::new
            ));
        int kp=0;
        for(Map.Entry<Integer,Integer> e: sortedMapDesc.entrySet()){
            kp+=1;
            if(kp>k)
            {
                break;
            }
            list.add(e.getKey());
        }

        int[] intArray = list.stream().mapToInt(Integer::intValue).toArray();
        return intArray;
    }
}
