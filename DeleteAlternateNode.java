/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public void deleteAlt(Node head) {
        // Code Here
        if(head==null)
         return;
        Node ptr=head;
        while(ptr!= null && ptr.next!= null)
        {
            Node temp=ptr.next;
            ptr.next=temp.next;
            ptr=temp.next;
            temp.next=null;
        }
        
    }
}
