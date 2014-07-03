package com.algos.sort;

/**
 * @author Sennen
 * @since 26/09/13
 * This is the sorting algorithm to choose when number of inversions are low in the table to sort.
 */

import static com.algos.sort.SorterHelper.strictlyLesser;

public class InsertionSorter<T extends Comparable<T>> implements Sorter<T> {
    private T[] tableToSort;

    @Override
    public T[] sort(T[] tableToSort) {
        this.tableToSort = tableToSort;
        for (int position = 1; position < tableToSort.length; position++) {
            shiftLeftEveryElementLesserThanPreviousFrom(position);
        }
        return tableToSort;
    }

    private void shiftLeftEveryElementLesserThanPreviousFrom(int position) {
        for (int index = position;
             index > 0 && strictlyLesser(tableToSort[index], tableToSort[index - 1]);
             index--) {
            SorterHelper.exchange(tableToSort, index, index - 1);
        }
    }

}
