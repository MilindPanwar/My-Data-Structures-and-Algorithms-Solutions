class Solution {

    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l)==s.charAt(r)) {
                l++;
                r--;
            } else {
                return isPal(s, l + 1, r) || isPal(s, l, r - 1);
            }
        }
        return true;
    }

    static boolean isPal(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l)==s.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}
