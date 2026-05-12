class Solution {

    public String encode(List<String> strs) {
        StringBuilder sbEnc = new StringBuilder();
        for(String str: strs){
            sbEnc.append(str.length()).append("#").append(str);
        }
        return sbEnc.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int numIndexEnd = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, numIndexEnd));
            String word = str.substring(numIndexEnd + 1, numIndexEnd + 1 + length);
            list.add(word);
            i = numIndexEnd + 1 + length;
        }
        return list;
    }
}
