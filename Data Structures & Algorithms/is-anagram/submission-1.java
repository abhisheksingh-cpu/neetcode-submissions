class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        // HashMap<Character, Integer> count_map = new HashMap<>();
        // for(int i = 0; i < s.length(); i++) {
        //     count_map.put(s.charAt(i), count_map.getOrDefault(s.charAt(i), 0) + 1);
        // }

        // for(int i = 0; i < t.length(); i++) {
        //     if(count_map.getOrDefault(t.charAt(i), 0) == 0) return false;

        //     count_map.put(t.charAt(i), count_map.get(t.charAt(i)) - 1);
        // }

        // return true;

        char[] s_array = new char[s.length()];
        s_array = s.toCharArray();
        char[] t_array = new char[t.length()];
        t_array = t.toCharArray();
        Arrays.sort(s_array);
        Arrays.sort(t_array);
        if((new String(s_array)).equals(new String(t_array))) return true;

        return false;
    }
}
