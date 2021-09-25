package com.dsa.Queue;

public class MyQueue {

    Node front,rear;
    int totalSize;


    boolean isEmpty()
    {
        if(totalSize==0)
        {
            return true;
        }
        return  false;
    }

    public void enqueue(int data)
    {
        Node dNode= new Node(data);

        if(front==null);
        {
            front=dNode;
        }

    }


}
