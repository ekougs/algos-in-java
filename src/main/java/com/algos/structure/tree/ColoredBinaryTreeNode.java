package com.algos.structure.tree;

/**
 * User: sennen
 * Date: 18/04/2014
 * Time: 13:08
 */
public class ColoredBinaryTreeNode<X extends Comparable<X>,Y> {
    private final X key;
    private Y value;
    private int size;
    private LinkColor parentLinkColor;
    private ColoredBinaryTreeNode<X, Y> leftNode;
    private ColoredBinaryTreeNode<X, Y> rightNode;

    public ColoredBinaryTreeNode(X key, Y value, LinkColor parentLinkColor) {
        this.key = key;
        this.value = value;
        this.parentLinkColor = parentLinkColor;
    }

    public ColoredBinaryTreeNode<X, Y> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(ColoredBinaryTreeNode<X, Y> leftNode) {
        this.leftNode = leftNode;
    }

    public Y getValue() {
        return value;
    }

    public void setValue(Y value) {
        this.value = value;
    }

    public ColoredBinaryTreeNode<X, Y> getRightNode() {
        return rightNode;
    }

    public void setRightNode(ColoredBinaryTreeNode<X, Y> rightNode) {
        this.rightNode = rightNode;
    }

    public X getKey() {
        return key;
    }

    public int getSize() {
        return size;
    }

    public LinkColor getParentLinkColor() {
        return parentLinkColor;
    }

    public void setParentLinkColor(LinkColor parentLinkColor) {
        this.parentLinkColor = parentLinkColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ColoredBinaryTreeNode that = (ColoredBinaryTreeNode) o;

        return key.equals(that.key);
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder nodeStringBuilder = new StringBuilder(toString(this));
        nodeStringBuilder.append(", leftNode=").append(toString(leftNode))
                         .append(", rightNode=").append(toString(rightNode))
                         .append('}');

        return nodeStringBuilder.toString();
    }

    private String toString(ColoredBinaryTreeNode<X, Y> node) {
        if (node == null) {
            return "null";
        }
        StringBuilder nodeStringBuilder = new StringBuilder();
        nodeStringBuilder.append("Node{")
                         .append("key=").append(node.getKey())
                         .append(", value=").append(node.getValue())
                         .append(", size=").append(node.getSize())
                         .append("}");
        return nodeStringBuilder.toString();
    }
}
