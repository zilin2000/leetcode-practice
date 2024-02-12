# lc5

## 思路
### 思路一： 中心开花
这道题的思路就是，遍历每一个char，然后把当前char和char + 1的元素都运行一遍helper function之后，比较得出来的字符串的大小。有几点要注意：
- String中的length()是有括号的！
- helper function中，返回的substring应该是left + 1 和right。因为比如说“babad”当你遍历到中间一个b然后循环跑完“aba”后，你的left到最左边right到最右边才发现不等。所以是left + 1 ， right。

复杂度分析
- 时间复杂度：O(n^2)，其中 n 是字符串的长度。中心扩展算法需要遍历每个字符并向两边扩展，最坏情况下每次扩展都要遍历整个字符串。
- 空间复杂度：O(1)，只使用了有限的额外空间。
