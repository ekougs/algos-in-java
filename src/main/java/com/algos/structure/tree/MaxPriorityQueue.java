package com.algos.structure.tree;

import com.algos.sort.SorterHelper;
import com.algos.structure.symboltable.TableSupplier;

import java.util.Arrays;

/**
 * User: sennen
 * Date: 15/03/2014
 * Time: 22:52
 */
public class MaxPriorityQueue<T extends Comparable<T>> implements PriorityQueue<T> {
    private final TableSupplier<T> tableSupplier;
    private T[] items;
    private int length = 0;

    public MaxPriorityQueue(TableSupplier<T> tableSupplier) {
        this.tableSupplier = tableSupplier;
    }

    @Override
    public void offer(T item) {
        adjustSpaceIfNeeded();
        items[++length] = item;
        SorterHelper.swim(items, length);
    }

    @Override
    public T peek() {
        return items[1];
    }

    @Override
    public T poll() {
        T max = peek();
        SorterHelper.exchange(items, 1, length--);
        items[length + 1] = null;
        SorterHelper.sink(items, 1, length);
        return max;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public int size() {
        return length;
    }

    private void adjustSpaceIfNeeded() {
        if (items == null) {
            items = tableSupplier.get(16);
            return;
        }
        int availableSpace = items.length;
        if (length == availableSpace / 4) {
            items = Arrays.copyOf(items, availableSpace * 2);
        }
    }
}