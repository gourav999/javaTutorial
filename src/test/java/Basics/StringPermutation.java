import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    public static void main(String[] args) {
        String s = "abc";
        List<String> permutations = new ArrayList<>();
        permute(s, 0, s.length() - 1, permutations);
        System.out.println("Permutations of " + s + ": " + permutations);
    }

    private static void permute(String str, int left, int right, List<String> result) {
        if (left == right) {
            result.add(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left + 1, right, result);
                str = swap(str, left, i); // backtrack
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }
}
