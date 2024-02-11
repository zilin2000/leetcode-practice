package bruce.lc160;

public class Solution {
    static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode p1 = headA, p2 = headB;
        while (p1 != p2 ) {
            if (p1 == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }

            if (p2 == null) {
                p2 = headA;
            } else {
                p2 = p2.next;
            }
        }
        return p1;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(0);
        headA.next = new ListNode(1);
        headA.next.next = new ListNode(2);
        headA.next.next.next = new ListNode(3);

        ListNode intersection = headA.next;

        ListNode headB = new ListNode(4);
        headB.next = new ListNode(5);
        headB.next.next = new ListNode(6);
        headB.next.next.next = intersection;


        ListNode.printListNode(headA);
        ListNode.printListNode(headB);
        
        ListNode res = getIntersectionNode(headA, headB);

        System.out.println(res.val);


    }
}

// ListNode
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
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
