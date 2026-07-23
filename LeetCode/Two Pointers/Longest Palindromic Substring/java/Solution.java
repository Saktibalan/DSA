class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome (center at i)
            int left = i, right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > ans.length()) {
                    ans = s.substring(left, right + 1);
                }
                left--;
                right++;
            }

            // Even length palindrome (center between i and i+1)
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > ans.length()) {
                    ans = s.substring(left, right + 1);
                }
                left--;
                right++;
            }
        }

        return ans;
    }
}