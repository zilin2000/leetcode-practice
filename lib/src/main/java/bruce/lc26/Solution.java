package bruce.lc26;

class Solution {
    public static  int removeDuplicates(int[] nums) {
        int slow = 0, fast = 0;
        while(fast < nums.length ){
            if (nums[slow] != nums[fast]){
                nums[++slow] = nums[fast];
            }
            fast ++;
        }   
        return slow + 1;
    }

    public static void main(String[] args) {
        
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 4;
        arr[4] = 4;

        int res = removeDuplicates(arr);
        System.out.println(res);
    }
}
