package bruce.lc344;

public class Solution {
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left ++;
            right --;
        }
    }

    public static void main(String[] args) {
        
        char[] arr = new char[]{'a','p','p','l', 'e'};
        reverseString(arr);
        for(char c: arr){
            System.out.println(c);
        }
    }
}
