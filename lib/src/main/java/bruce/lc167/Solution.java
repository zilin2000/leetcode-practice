package bruce.lc167;

public class Solution {
    public static int[] twoSum(int[] numbers, int target){
        int left = 0, right = numbers.length -1 ;
        while(left < right){
            int num = numbers[left] + numbers[right];
            if( num == target){
                return new int[]{left + 1, right + 1};
            }
            if (num < target){
                left ++;
            } else {
                right --;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,5,6};
        int[] res = twoSum(arr, 6);
        for(int num: res){
            System.out.println(num);
        }

    }
}
