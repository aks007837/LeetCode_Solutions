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
class ListNode {
         int val;
         ListNode next;
}
public class merge2sortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        if(list1==null)
        {
            return list2;
        }
        else if(list2==null)
        {
            return list1;
        }
        // Creating head node
        else
        {
            ListNode head=null;
            ListNode l1=list1;
            ListNode l2=list2;
            ListNode q=new ListNode();
            if(head==null)
            {
                ListNode p=new ListNode();
                if(l1.val < l2.val)
                {
                    p.val=l1.val;
                    l1=l1.next;
                }
                else
                {
                    p.val=l2.val;
                    l2=l2.next;
                }
                p.next=null;
                head=p;
                q=p;
            }
                while(l1!=null && l2!=null)
                {
                    ListNode p=new ListNode();
                    if(l1.val < l2.val)
                    {
                        p.val=l1.val;
                        l1=l1.next;
                    }
                    else
                    {
                        p.val=l2.val;
                        l2=l2.next;
                    }
                    p.next=null;
                    q.next=p;
                    q=p;
                }
                while(l1!=null)
                {
                    ListNode p=new ListNode();
                    p.val=l1.val;
                    p.next=null;
                    l1=l1.next;
                    q.next=p;
                    q=p;
                }
                while(l2!=null)
                {
                    ListNode p=new ListNode();
                    p.val=l2.val;
                    p.next=null;
                    l2=l2.next;
                    q.next=p;
                    q=p;
                }

            return head;
        }
    }
}