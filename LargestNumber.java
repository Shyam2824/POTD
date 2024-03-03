import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    String printLargest(int n, String[] arr) {
        Comparator<String> custom = (String a, String b) -> {
            return (b + a).compareTo(a + b);
        };
        String ans = "";
        Arrays.sort(arr, custom);
        for(String s: arr){
            ans += s;
        }
        
        return ans;

}
}
