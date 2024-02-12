# lc 83 
## Remove Duplicates from Sorted List

`public ListNode deleteDuplicates(ListNode head)`

``` java
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode slow = head, fast = head;
        while(fast != null){
            if(slow.val != fast.val){
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
        }
        slow.next = null;
        return head;
    }
}
```

**注意**

和`lc26`不同的是，这道题需要记住在循环之后，把`slow`的next设置成null。

这段代码旨在删除已排序链表中的所有重复元素，只保留每个元素的单个副本。它使用了双指针技术，其中 `slow` 指针指向最后一个不重复的元素，而 `fast` 指针遍历整个链表。

### 时间复杂度

- **遍历**：`fast` 指针会遍历整个链表一次，与链表的长度 `N` 直接相关。
- **操作**：对于每个 `fast` 指针的位置，我们进行常数时间的操作，比如比较 `slow.val` 和 `fast.val`，以及在需要时更新 `slow.next`。
- **总体**：因此，总的时间复杂度是 O(N)，其中 N 是链表的长度。

### 空间复杂度

- **额外空间**：这段代码只使用了有限的额外空间（`slow` 和 `fast` 指针），并没有使用与输入链表大小成比例的额外空间。
- **总体**：因此，空间复杂度是 O(1)。

### 总结

这段代码高效地在原地（不使用额外的存储空间）删除了排序链表中的重复项。它的时间复杂度是 O(N)，空间复杂度是 O(1)，非常适合处理大数据集。通过在发现重复元素时跳过它们，并直接将 `slow.next` 指向下一个不重复的元素，该方法确保了每个元素只保留单个副本。在遍历结束后，还需将 `slow.next` 设置为 `null`，以确保新链表的末尾没有悬挂的引用。