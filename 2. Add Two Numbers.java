public class ListNode{
	int val;
	ListNode next;
	public ListNode(int x){
		self.val = x
	}
}

public class Solution{
	public ListNode addTwoNumbers(ListNode l1,ListNode l2){
		ListNode prev = new ListNode(0);
		ListNode head = prev;
		int carry = 0;
		while(l1 != null || l2!=null||carry!=0){
			ListNode cur = new ListNode(0);
			int sum = ((l2 == null )? 0:l2.val)+((l1==null)?0:l1.val)+carry
			cur.val = sum%10;
			carry = sum /10;
			prev.next = cur;
			prev = cur;

			l1=(l1==null)?l1:l1.next;
			l2=(l2==null)?l2:l2.next;
		}


		while{
			int sum;
			if sum > 10{
				sum = sum % 10;
				cur = 1
			}
			prev.next = new ListNode(sum)
			prev = prev.next 
		}


		}
		return head.next;
	}
}

prev := new(ListNode)
head := prev
carry := 0
for l1 != nil || l2!=null || carry != 0{
	cur := new(ListNode)
	sum := 
}