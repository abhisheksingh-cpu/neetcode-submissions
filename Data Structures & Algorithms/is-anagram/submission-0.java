class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> count_map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            count_map.put(s.charAt(i), count_map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < t.length(); i++) {
            if(count_map.getOrDefault(t.charAt(i), 0) == 0) return false;

            count_map.put(t.charAt(i), count_map.get(t.charAt(i)) - 1);
        }

        return true;
    }
}
