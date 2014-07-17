package com.algos.sort;

/**
 * User: sennen
 * Date: 17/07/2014
 * Time: 13:28
 */
public class SelectionSorter<T extends Comparable<T>> implements Sorter<T> {
    @Override
    public T[] sort(T[] tableToSort) {
        int lastIndex = tableToSort.length - 1;
        for (int i = 0; i < lastIndex; i++) {
            int minIndex = minIndex(tableToSort, i, lastIndex);
            SorterHelper.exchange(tableToSort, minIndex, i);
        }
        return tableToSort;
    }

    private int minIndex(T[] tableToSort, int currentIndex, int lastIndex) {
        int minIndex = currentIndex;
        for (int i = currentIndex + 1; i <= lastIndex; i++) {
            if (SorterHelper.strictlyLesser(tableToSort[i], tableToSort[minIndex])) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
