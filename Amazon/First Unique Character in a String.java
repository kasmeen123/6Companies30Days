class Solution {
    public int firstUniqChar(String s) {
        
        HashMap <Character, Integer> map = new HashMap <> ();
        int n = s.length();
             for (char c : s.toCharArray()) {
             map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < n; i++) {
             if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}