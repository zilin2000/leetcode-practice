package bruce.lc142;


public class LC142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast, slow;
        fast = slow = head;
        while( fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }
        
        
        

        return new ListNode(-1);
    }

    public static void main(String[] args) {
        

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