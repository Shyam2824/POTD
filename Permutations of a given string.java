class Solution {
      public static List<String> find_permutation(String S) {
        // code here
        char[] chars = S.toCharArray();
        Arrays.sort(chars);
        String sortedString = new String(chars);
        Set<String> result = new HashSet<>();
        findPermutation(sortedString, "", result);
        List<String> sortedResult = new ArrayList<>(result);
        Collections.sort(sortedResult);
        return sortedResult;
    }

    public static void findPermutation(String str, String ans, Set<String> result) {
        if (str.length() == 0) {
            result.add(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String new_str = str.substring(0, i) + str.substring(i + 1);
            findPermutation(new_str, ans + ch, result);
        }
        
    }
}