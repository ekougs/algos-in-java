package com.algos.structure.tree;

/**
 * User: sennen
 * Date: 18/04/2014
 * Time: 13:11
 */
class Trees {
    static <X extends Comparable<X>, Y> ColoredBinaryTreeNode<X, Y> rotateLeft(ColoredBinaryTreeNode<X, Y> node) {
        ColoredBinaryTreeNode<X, Y> rightNode = node.getRightNode();
        ColoredBinaryTreeNode<X, Y> betweenNode = rightNode.getLeftNode();
        rightNode.setLeftNode(node);
        node.setRightNode(betweenNode);
        rightNode.setParentLinkColor(node.getParentLinkColor());
        node.setParentLinkColor(LinkColor.RED);
        return rightNode;
    }

    static <X extends Comparable<X>, Y> ColoredBinaryTreeNode<X, Y> rotateRight(ColoredBinaryTreeNode<X, Y> node) {
        ColoredBinaryTreeNode<X, Y> leftNode = node.getLeftNode();
        ColoredBinaryTreeNode<X, Y> betweenNode = leftNode.getRightNode();
        leftNode.setRightNode(node);
        node.setLeftNode(betweenNode);
        leftNode.setParentLinkColor(node.getParentLinkColor());
        node.setParentLinkColor(LinkColor.RED);
        return leftNode;
    }
}
