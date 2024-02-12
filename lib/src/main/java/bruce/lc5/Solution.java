package bruce.lc5;

public class Solution {
    public static String longestPalindrome(String s){
        String res = "";
        if(s == null || s.length() == 0) return res;
        for(int i = 0; i < s.length(); i ++){
            String s1 = isPalindrome(s, i, i);
            String s2 = isPalindrome(s, i, i + 1);
            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }
        return res;
    }

    static String isPalindrome(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)){
            left --;
            right ++;
        }
        return s.substring(left + 1, right);
    }

    public static void main(String[] args) {
        String res = longestPalindrome("babad");
        System.out.println(res);
    }
}
