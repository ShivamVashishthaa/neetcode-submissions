class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("//s+", "").toLowerCase();
        int left = 0, right = s1.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s1.charAt(left))) left++;

            while (left < right && !Character.isLetterOrDigit(s1.charAt(right))) right--;

            if (s1.charAt(left) != s1.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
