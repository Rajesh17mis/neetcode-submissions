class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
    //     int[] a = new int[26];
    //     for(int i=0; i<s.length(); i++)
    //     {
    //         a[s.charAt(i)-'a'] += 1;
    //         a[t.charAt(i)-'a'] -= 1;
    //     }
    //     for(int c : a){
    //         if(c != 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    Map<Character, Integer> map = new HashMap<>();
    for(char i : s.toCharArray()){
        map.put(i, map.getOrDefault(i, 0) + 1);
    } 

    for(char j : t.toCharArray()){
        if(!map.containsKey(j)){
            return false;
        }
        map.put(j, map.get(j)-1);
        if(map.get(j)==0){
            map.remove(j);
        }
    }
    return map.isEmpty();
    }
}
