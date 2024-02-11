# lc26 
`public int removeDuplicates(int[] nums)`

> 1st date: 2024.2.10


## 思路
这道题就是用快慢指针，我原来的解法是

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0, fast = 0;
        while(fast < nums.length ){
            if(nums[slow] == nums[fast]){
                fast ++;
            }
            nums[++slow] = nums[fast];
        }
        return slow + 1;
    }
}
```
在while语句里面，不能把操作指针的操作放到if里面，这样会越界。

**正确的方法是**

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0, fast = 0;
        while(fast < nums.length ){
            if (nums[slow] != nums[fast]){
                nums[++slow] = nums[fast];
            }
            fast ++;
        }   
        return slow + 1;
    }
}
```




这段代码实现了从排序数组中删除重复项的功能，并返回新数组的长度。这里使用了双指针技术，其中 `slow` 指针跟踪不重复元素的位置，而 `fast` 指针遍历整个数组。

### 时间复杂度

- **遍历**：`fast` 指针会遍历整个数组一次，与数组的长度 `N` 直接相关。
- **操作**：对于每个 `fast` 指针的位置，我们进行常数时间的操作，比如比较 `nums[slow]` 和 `nums[fast]`，以及在需要时更新 `nums[slow+1]`。
- **总体**：因此，总的时间复杂度是 O(N)，其中 N 是数组 `nums` 的长度。

### 空间复杂度

- **额外空间**：这段代码只使用了有限的额外空间（`slow` 和 `fast` 指针），并没有使用与输入数组大小成比例的额外空间。
- **总体**：因此，空间复杂度是 O(1)。

### 总结

这段代码高效地在原地（不使用额外的数组空间）删除了排序数组中的重复项。它的时间复杂度是 O(N)，空间复杂度是 O(1)，非常适合处理大数据集。

