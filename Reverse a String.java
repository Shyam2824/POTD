public class Reverse a String {
    public static String reverseWord(String str)
    {
        char[] result = str.toCharArray();
        int len = result.length-1;
        for(int i = 0, j = len; j > len/2;i++,j--){
            char temp = result[i];
            result[i] = result[j];
            result[j] = temp;
        }
        
        return String.valueOf(result);
    }
}
