class Solution {
    public String minWindow(String s, String t) {
       int[] tFreq = new int[128];
       int[] windowFreq = new int[128];

       for(char c: t.toCharArray()) tFreq[c]++;

       int need = 0;
       for(int count: tFreq) if(count > 0) need++;

       int have = 0, l = 0, minLen = s.length()+1, start = 0;

       for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            windowFreq[c]++;
            if(windowFreq[c] == tFreq[c]) have++;

            while(have == need){
                if(r-l+1 < minLen){
                    minLen = r-l+1;
                    start = l;
                }

                char c_left = s.charAt(l);
                if(windowFreq[c_left] == tFreq[c_left]) have--;
                windowFreq[c_left]--;
                l++;
            }        

       }

       return (minLen==s.length()+1)?"":s.substring(start, start+minLen);
    }
}
