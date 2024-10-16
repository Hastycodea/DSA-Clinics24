public class ReverseLinkedList {
  public static void main(String[] args) {
    System.out.println("Andreh does what he does");
  }

  public static ListNode reverseList(ListNode head){

    ListNode prev = null;

    while(head != null) {
      ListNode next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }

    return prev;

  }
}
