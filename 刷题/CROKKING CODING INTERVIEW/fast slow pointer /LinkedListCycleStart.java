class ListNode {
    int value = 0;
    ListNode next;
  
    ListNode(int value) {
      this.value = value;
    }
  }
  // return the head of a linkedlist cycle
  class LinkedListCycleStart {
  
    public static ListNode findCycleStart(ListNode head) {
      // TODO: Write your code here
      int cycle_len = findLength(head);
      ListNode cyc_h = head;
      ListNode temp = head;
      while(cycle_len!=0){
          cyc_h = cyc_h.next;
          cycle_len--;
      }
      while(cyc_h != temp){
        temp = temp.next;
        cyc_h = cyc_h.next;
      }
      head = temp;
  
      return head;
    }
   private static int findLength(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        int length = 1;
        while(fast!=null && fast.next !=null){
          slow = slow.next;
          fast = fast.next.next;
          if(slow == fast){
            break;
          }
        }
        ListNode temp = slow.next;
        while(temp!= slow){
          temp=temp.next;
          length++;
        }
        
        return length;
    }
  
    public static void main(String[] args) {
      ListNode head = new ListNode(1);
      head.next = new ListNode(2);
      head.next.next = new ListNode(3);
      head.next.next.next = new ListNode(4);
      head.next.next.next.next = new ListNode(5);
      head.next.next.next.next.next = new ListNode(6);
  
      head.next.next.next.next.next.next = head.next.next;
      System.out.println("LinkedList cycle start: " + LinkedListCycleStart.findCycleStart(head).value);
  
      head.next.next.next.next.next.next = head.next.next.next;
      System.out.println("LinkedList cycle start: " + LinkedListCycleStart.findCycleStart(head).value);
  
      head.next.next.next.next.next.next = head;
      System.out.println("LinkedList cycle start: " + LinkedListCycleStart.findCycleStart(head).value);
    }
  }