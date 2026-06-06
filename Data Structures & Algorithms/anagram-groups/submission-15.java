class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> nestList = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strs));
        for(int i=0; i<list.size(); i++){
            String son = strs[i];
            boolean found = nestList.stream().anyMatch(subList -> subList.contains(son));
            if (found == false){
                List<String> abc = new ArrayList<>();
                abc.add(strs[i]);
            // if(!strs[i].isEmpty()){
            for(int j=i+1; j<list.size(); j++)
            {
                boolean anagram=true;
                Map<Character, Integer> map = new HashMap<>();
                
                for(char p : strs[i].toCharArray()){
                    map.put(p, map.getOrDefault(p, 0) + 1);
                } 

                for(char q : strs[j].toCharArray()){
                    if(!map.containsKey(q)){
                        anagram=false;
                        break;
                    }
                    map.put(q, map.get(q)-1);
                    if(map.get(q)==0){
                        map.remove(q);
                    }
                }
                if(map.isEmpty() && anagram==true){
                    abc.add(strs[j]);
                }
            }
            // }
            nestList.add(abc);
            }
            
        }
        return nestList;
    }
}
