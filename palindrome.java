package Strings;

public class palindrome {

    public static boolean pali(String str) {
        for(int i = 0; i <= str.length() / 2; i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "wow";
        System.out.println(pali(str));
    }
}

// Commit timestamp: 2025-06-02 19:57:00