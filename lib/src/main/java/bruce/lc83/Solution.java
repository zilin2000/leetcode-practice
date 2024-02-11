package bruce.lc83;

public class Solution {
    static ListNode deleteDuplicates(ListNode head) {
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

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode.printListNode(head);
        ListNode.printListNode(deleteDuplicates(head));
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void printListNode(ListNode head) {
        StringBuilder sb = new StringBuilder(); // 使用StringBuilder来构建字符串
        sb.append("["); // 在字符串开头添加[
        ListNode current = head;
        while (current != null) {
            sb.append(current.val); // 追加当前节点的值
            if (current.next != null) {
                sb.append(","); // 如果不是最后一个节点，则添加逗号作为分隔符
            }
            current = current.next;
        }
        sb.append("]"); // 在字符串结尾添加]
        System.out.println(sb.toString()); // 打印最终构建的字符串
    }

}
