package bruce.lc27;

public class Solution {
    public static int removeElement(int[] nums, int val){
        int slow = 0, fast = 0;
        int n = nums.length;
        while(fast < n) {
            if(nums[fast] != val){
                nums[slow++] = nums[fast];
            }
            fast ++;
        }
        return slow;


    }

    public static void main(String[] args) {
        
        int[] arr = new int[4];
        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 2;
        arr[3] = 3;

        int res = removeElement(arr, 3);
        System.out.println(res); //2
        
    }
}
