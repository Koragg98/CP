//https://www.geeksforgeeks.org/problems/sort-a-k-sorted-doubly-linked-list/1

/*Given a doubly linked list, each node is at most k-indices away from its target position.
The problem is to sort the given doubly linked list.
The distance can be assumed in either of the directions (left and right)*/

class Solution {
    public DLLNode sortAKSortedDLL(DLLNode head, int k) {
        // Code here
        PriorityQueue<Integer> pq=new PriorityQueue<>(k+1);
        
        DLLNode temp1=head, temp2=head;
        
        while(temp1!=null)
        {
            pq.add(temp1.data);
            if(pq.size()==k+1)
            {
                temp2.data=pq.remove();
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            temp2.data=pq.remove();
            temp2=temp2.next;
        }
        return head;
    }
}
