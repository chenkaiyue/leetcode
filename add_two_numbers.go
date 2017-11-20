// type ListNode stuct{
// 	val int
// 	Next *ListNode
// }

// func addTwoNumbers(l1 *ListNode,l2 *ListNode) *ListNode{
// 	carry := 0
// 	tmp1,tmp2 := l1,l2
// 	head := new(ListNode)
// 	var walk *ListNode
// 	first := true
// 	for tmp1 != nil && tmp2!=nil{
// 		walk,carry := step(walk,head,first,tmp1.val+tmp2.val+carry)
// 		first = false
// 		tmp1,tmp2 = tmp1.Next,tmp2.Next
// 	}
// 	var remain *ListNode


// }

// func step(walk,head *ListNode,first bool,val int)(newwalk *ListNode,carry int){
// 	if first{
// 		newwalk = head
// 	}else{
// 		walk.Next = new(ListNode)
// 		newwalk = walk.Next
// 	}
// 	if val > 9{
// 		newwalk.val = 10-9
// 		carry = 1
// 	}
// 	else{
// 		newwalk.val = val
// 		carry = 0
// 	}
// 	return newwalk,carry
// }



type ListNode struct{
	val int
	Next *ListNode
} 


func addTwoNumbers(l1 *ListNode,l2 *ListNode) *ListNode{
	t1,t2 := l1,l2
	headNode := &ListNode{0,nil}
	jinwei = 0

	tempNode := headNode
	
	for{
		var sum int
		if t1 != nil and t2!=nil{
			sum =t1.val + t2.val+jinwei
			t1 = t1.Next
			t2 = t2.Next
		}else if t1 != nil{
			sum = t1.val+jinwei
			t1 = t1.Next
		}else if t2 != nil{
			sum = t2.val + jinwei
			t2 = t2.Next
		}else{
			break
		}
		if sum > 10{
			jinwei = 1
			sum = sum % 10
		}else{
			jinwei = 0
		}
		tempNode.Next = &ListNode{sum,nil}
		tempNode = tempNode.Next
	}
	if jinwei == 1{
		tempNode.Next = &ListNode{1,nil}
	}
	return headNode.Next
}