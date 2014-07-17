package com.algos.sort;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.algos.sort.SorterTestCase.testSorter;
import static com.algos.sort.SorterTestCase.testSorterOnLimitCase;

/**
 * User: sennen
 * Date: 17/07/2014
 * Time: 13:35
 */
public class SelectionSorterTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(SelectionSorterTest.class);

    @Test
    public void test() throws Exception {
        testSorter(new SelectionSorter<>(), LOGGER);
    }

    @Test
    public void testLimitCase() throws Exception {
        testSorterOnLimitCase(new SelectionSorter<>(), LOGGER);
    }
}
