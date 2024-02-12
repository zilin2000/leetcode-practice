package bruce.lc283;

public class Solution {
    public static void moveZeroes(int[] nums){
        int p = removeElements(nums, 0);
        for(int i = p; i < nums.length; i ++){
            nums[i] = 0;
        }
    }

    static int removeElements(int[] nums, int val){
        int slow = 0, fast = 0;
        while(fast < nums.length){
            if(nums[fast] != val){
                nums[slow++] = nums[fast];
            }
            fast ++;
        }
        return slow;
    }

    public static void main(String[] args) {
        
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 0;
        arr[3] = 3;

        moveZeroes(arr);
        for(int i = 0; i < arr.length; i ++){
            System.out.println(arr[i]);
        }
    }
}