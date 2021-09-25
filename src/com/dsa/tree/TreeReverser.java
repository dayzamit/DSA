package com.dsa.tree;

public class TreeReverser
{


        public void reverseRecursive(TreeNode root) {

            if(root==null)
                return;
            TreeNode tempNode=null;

            tempNode=root.getLeftChild();
            root.setLeftChild(root.getRightChild());
            root.setRightChild(tempNode);

            reverseRecursive(root.getLeftChild());
            reverseRecursive(root.getRightChild());

        }



        public String toString(TreeNode root)
        {
            if(root ==null)
            return "";

            StringBuffer buffer =new StringBuffer(String.valueOf(root.getValue())).append("");
            buffer.append(toString(root.getLeftChild()));
            buffer.append(toString(root.getRightChild()));
            return  buffer.toString();

        }
}
