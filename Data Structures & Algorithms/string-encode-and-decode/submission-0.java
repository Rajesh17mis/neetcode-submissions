class Solution {

    public String encode(List<String> strs) {
       StringBuilder abc = new StringBuilder();
       for(String s : strs){
        abc.append(s.length()).append("#").append(s);
       }
       return abc.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> list = new ArrayList<String>();
        int i = 0;
        while(i<str.length()){
           int index = str.indexOf('#', i);
           int length = Integer.parseInt(str.substring(i, index));
           i = index+1;
           String res = str.substring(i, i+length);
           list.add(res);
           i+=length;
        }
        return list;
    }
}
