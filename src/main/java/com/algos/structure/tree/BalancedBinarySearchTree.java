package com.algos.structure.tree;

import com.algos.structure.symboltable.ComparableSymbolTable;

/**
 * User: sennen
 * Date: 18/04/2014
 * Time: 13:06
 */
public class BalancedBinarySearchTree<X extends Comparable<X>,Y> implements ComparableSymbolTable<X, Y> {
    private ColoredBinaryTreeNode<X, Y> root;
    private int size;

    @Override
    public void put(X key, Y value) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Y get(X key) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(X key) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean contains(X key) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isEmpty() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public X min() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public X max() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public X floor(X key) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public X ceiling(X key) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public X select(int k) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteMin() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteMax() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Iterable<X> keys() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int size(X lo, X hi) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Iterable<X> keys(X lo, X hi) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
