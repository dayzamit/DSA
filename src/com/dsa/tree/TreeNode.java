package com.dsa.tree;

public class TreeNode {


   public  TreeNode(int value)
    {
        this.value=value;

    }

    public  TreeNode(int value,TreeNode leftNode, TreeNode rightNode)
    {
        this.value=value;
        this.leftChild=leftNode;
        this.rightChild=rightNode;

    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    int value;
    TreeNode leftChild,rightChild;

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
