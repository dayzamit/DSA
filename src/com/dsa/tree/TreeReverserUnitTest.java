package com.dsa.tree;



public class TreeReverserUnitTest {

    public static void main(String[] args)
    {

        givenTreeWhenReversingRecursivelyThenReversed();
    }

    private static TreeNode createBinarytree()
    {

        TreeNode leaf1 = new TreeNode(1);
        TreeNode leaf2 = new TreeNode(3);
        TreeNode leaf3 = new TreeNode(6);
        TreeNode leaf4 = new TreeNode(9);

        TreeNode nodeRight = new TreeNode(7, leaf3, leaf4);
        TreeNode nodeLeft = new TreeNode(2, leaf1, leaf2);

        TreeNode root = new TreeNode(4, nodeLeft, nodeRight);

        return root;
    }

    public  static void givenTreeWhenReversingRecursivelyThenReversed() {

        TreeReverser treeReverser =new TreeReverser();
        TreeNode treeNod=createBinarytree();
        treeReverser.reverseRecursive(treeNod);
     System.out.println("Reverse tree " + treeReverser.toString(treeNod));
    }
}
