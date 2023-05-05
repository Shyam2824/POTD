public class MaximuNumber {
    public int maxVowels(String s, int k) {
        if (s.length() < k) return 0;
        
        // Initialize the hashset
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        int counter = 0;
        int result = 0;
        char[] array = s.toCharArray();
        int left = 0;
        int right = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char curr = array[i];
            if (set.contains(curr)) {
                counter++;
            }
            if (right - left == k - 1) {
                result = Math.max(counter, result);
                if (set.contains(array[left])) {
                    counter--;
                }
                left++;
            }      
            right++; 
        }
        return result;
    }
}
