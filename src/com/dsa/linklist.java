package com.dsa;

public class linklist {

    public static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }

    public static void main(String[] args)
    {




        SinglyLinkedListNode llist_head1 = insertNodeAtTail(null, 141);

        SinglyLinkedListNode llist_head3 = insertNodeAtTail(llist_head1, 164);
        SinglyLinkedListNode llist_head4 = insertNodeAtTail(llist_head1, 530);
        SinglyLinkedListNode llist_head5 = insertNodeAtTail(llist_head1, 474);
        displayList(llist_head1);


        for (int i=0;i<10;i++) {
            SinglyLinkedListNode llist_head2 = insertNodeAtTail(null, 100+i);
            displayList(llist_head2);
        }

    }

    static void displayList(SinglyLinkedListNode singlyLinkedListNode)
    {
        while (singlyLinkedListNode!=null)
        {
            System.out.print(singlyLinkedListNode.data +">");
            singlyLinkedListNode=singlyLinkedListNode.next;
        }
    }
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

        SinglyLinkedListNode currentNode =new SinglyLinkedListNode();
        currentNode.data=data;
        currentNode.next=null;





        if(head==null)
        {
            head=currentNode;
            return head;
        }

        SinglyLinkedListNode tailNode=head;

        while(tailNode.next!=null)
        {
            tailNode=tailNode.next;
       }

        tailNode.next=currentNode;
        tailNode=currentNode;







        return tailNode;
    }

}
