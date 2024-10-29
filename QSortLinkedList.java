/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }

}*/
// you have to complete this function
class GfG {
    public static Node quickSort(Node node) {
        // Your code here
        quickSortRec(node,null);
        return node;
    }
    public static void quickSortRec(Node start,Node end)
    {
        if(start!=null && start.next!=null && start!=end)
        {
            Node pivot=partition(start,end);
            quickSortRec(start,pivot);
            quickSortRec(pivot.next,end);
        }
    }
    public static Node partition(Node start,Node end)
    {
        int pivotData=start.data;
        Node pivotPrev=start;
        Node curr=start.next;
        
        while(curr!=end)
        {
            if(curr.data<pivotData)
            {
                pivotPrev=pivotPrev.next;
                int temp=pivotPrev.data;
                pivotPrev.data=curr.data;
                curr.data=temp;
            }
            curr=curr.next;
        }
        
        int temp=start.data;
        start.data=pivotPrev.data;
        pivotPrev.data=temp;
        
        return pivotPrev;
    }
}
