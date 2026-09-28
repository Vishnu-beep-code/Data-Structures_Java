import java.util.Arrays;

public class CWcode10 {
    public static boolean areAnagrams(String s1, String s2) {
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println("Are the strings anagrams? " + areAnagrams(s1, s2));
    }
}