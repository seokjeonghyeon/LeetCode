/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;

 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // 결과 연결리스트의 더미 헤드
        ListNode current = dummyHead;
        int carry = 0; // 올림수

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0; // l1 값, 없으면 0
            int y = (l2 != null) ? l2.val : 0; // l2 값, 없으면 0
            int sum = x + y + carry; // 합 계산

            carry = sum / 10; // 올림수
            current.next = new ListNode(sum % 10); // 현재 자리값 추가
            current = current.next;

            if (l1 != null) l1 = l1.next; // 다음 노드
            if (l2 != null) l2 = l2.next; // 다음 노드
        }

        return dummyHead.next; // 더미 헤드 다음이 실제 결과
    }
}