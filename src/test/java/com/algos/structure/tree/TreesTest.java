package com.algos.structure.tree;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: sennen
 * Date: 18/04/2014
 * Time: 13:14
 */
public class TreesTest {
    @Test
    public void testRotateLeft() throws Exception {
        ColoredBinaryTreeNode<Character, Integer> sNode = new ColoredBinaryTreeNode<>('S', 1, LinkColor.RED);
        ColoredBinaryTreeNode<Character, Integer> eNode = new ColoredBinaryTreeNode<>('E', 1, LinkColor.BLACK);
        ColoredBinaryTreeNode<Character, Integer> aNode = new ColoredBinaryTreeNode<>('A', 2, LinkColor.BLACK);
        ColoredBinaryTreeNode<Character, Integer> gNode = new ColoredBinaryTreeNode<>('G', 2, LinkColor.BLACK);
        ColoredBinaryTreeNode<Character, Integer> uNode = new ColoredBinaryTreeNode<>('U', 2, LinkColor.BLACK);
        eNode.setLeftNode(aNode);
        eNode.setRightNode(sNode);
        sNode.setLeftNode(gNode);
        sNode.setRightNode(uNode);

        ColoredBinaryTreeNode<Character, Integer> actualNode = Trees.rotateLeft(eNode);

        assertEquals(sNode, actualNode);
        assertEquals(sNode.getParentLinkColor(), LinkColor.BLACK);
        assertEquals(eNode, sNode.getLeftNode());
        assertEquals(eNode.getParentLinkColor(), LinkColor.RED);
        assertEquals(gNode, eNode.getRightNode());
        assertEquals(aNode, eNode.getLeftNode());
        assertEquals(uNode, sNode.getRightNode());
    }

    @Test
    public void testRotateLeftWithNulls() throws Exception {
        ColoredBinaryTreeNode<Character, Integer> sNode = new ColoredBinaryTreeNode<>('S', 1, LinkColor.RED);
        ColoredBinaryTreeNode<Character, Integer> eNode = new ColoredBinaryTreeNode<>('E', 1, LinkColor.RED);
        eNode.setRightNode(sNode);

        ColoredBinaryTreeNode<Character, Integer> actualNode = Trees.rotateLeft(eNode);

        assertEquals(sNode, actualNode);
        assertEquals(sNode.getParentLinkColor(), LinkColor.RED);
        assertEquals(eNode, sNode.getLeftNode());
        assertEquals(eNode.getParentLinkColor(), LinkColor.RED);
    }

    @Test
    public void testRotateRight() throws Exception {
        ColoredBinaryTreeNode<Character, Integer> sNode = new ColoredBinaryTreeNode<>('S', 1, LinkColor.BLACK);
        ColoredBinaryTreeNode<Character, Integer> eNode = new ColoredBinaryTreeNode<>('E', 1, LinkColor.RED);
        ColoredBinaryTreeNode<Character, Integer> aNode = new ColoredBinaryTreeNode<>('A', 2, LinkColor.BLACK);
        ColoredBinaryTreeNode<Character, Integer> gNode = new ColoredBinaryTreeNode<>('G', 2, LinkColor.BLACK);
        ColoredBinaryTreeNode<Character, Integer> uNode = new ColoredBinaryTreeNode<>('U', 2, LinkColor.BLACK);
        sNode.setLeftNode(eNode);
        eNode.setLeftNode(aNode);
        eNode.setRightNode(gNode);
        sNode.setRightNode(uNode);

        ColoredBinaryTreeNode<Character, Integer> actualNode = Trees.rotateRight(sNode);

        assertEquals(eNode, actualNode);
        assertEquals(eNode.getParentLinkColor(), LinkColor.BLACK);
        assertEquals(sNode, eNode.getRightNode());
        assertEquals(sNode.getParentLinkColor(), LinkColor.RED);
        assertEquals(sNode.getLeftNode(), gNode);
        assertEquals(eNode.getLeftNode(), aNode);
        assertEquals(sNode.getRightNode(), uNode);
    }

    @Test
    public void testRotateRightWithNulls() throws Exception {
        ColoredBinaryTreeNode<Character, Integer> sNode = new ColoredBinaryTreeNode<>('S', 1, LinkColor.BLACK);
        ColoredBinaryTreeNode<Character, Integer> eNode = new ColoredBinaryTreeNode<>('E', 1, LinkColor.RED);
        sNode.setLeftNode(eNode);

        ColoredBinaryTreeNode<Character, Integer> actualNode = Trees.rotateRight(sNode);

        assertEquals(eNode, actualNode);
        assertEquals(eNode.getParentLinkColor(), LinkColor.BLACK);
        assertEquals(sNode, eNode.getRightNode());
        assertEquals(sNode.getParentLinkColor(), LinkColor.RED);
    }
}
