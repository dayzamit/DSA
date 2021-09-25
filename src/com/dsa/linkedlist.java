package com.dsa;

public class linkedlist {


    public static void main(String[] args) {

//        Node n1 = new Node(10);
//        Node n2 = new Node(20);
//        Node n3 = new Node(30);

//        Node head= n1;
//        head.setNext(n2);
//        n2.setNext(n3);
//        n3.setNext(null);


        Node n2=insertData(10);
         n2.data=20;
        Node n3=insertData(n2.data);

        insertData(n3.data=30);
        // System.out.println(head);
          printLinkList(n2);

    }
   static Node head = null;

    static Node insertData(int data) { Node addedData, tempHead;
        addedData = new Node(data);


        if (head == null) {
            head = addedData;
            System.out.println(head);
            return head;
        }

        if(head !=null)
        {

            head.next=addedData;
            head=addedData;
        }


        return head;


    }

    public static void printLinkList(Node head) {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println("Node data " + currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }

    static class Node {
        int data;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        Node next;

        public Node(int data) {
            this.data = data;
        }


    }
}
