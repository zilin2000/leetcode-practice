package bruce.lc19;


public class LC19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = findNthFromEnd(dummy, n + 1);
        prev.next = prev.next.next;
        return dummy.next;
    }

    static ListNode findNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;
        ListNode p1 = head, p2 = head;
        for (int i = 0; i < n; i++) {
            p1 = p1.next;
        }
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }

    public static void main(String[] args) {
        ListNode p5 = new ListNode(5);
        ListNode p4 = new ListNode(4, p5);
        ListNode p3 = new ListNode(3, p4);
        ListNode p2 = new ListNode(2, p3);
        ListNode p1 = new ListNode(1, p2);
        ListNode head = p1;

        ListNode.printListNode(head);

        removeNthFromEnd(head, 2);

        ListNode.printListNode(head);

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