import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by daehyun on 2016. 10. 20..
 */
public class SortTest {
    int[] unsorted;
    static int[] sorted = new int[]{1,2,3,4,5};
    @Before
    public void setUp() throws Exception {
        unsorted = new int[]{4,2,3,1,5};
    }

    @Test
    public void bubbleSortTest() throws Exception {
        SortInterface bubble = new BubbleSort();
        bubble.sort(unsorted);
        assertArrayEquals(sorted, unsorted);
    }

    @Test
    public void selectionSortTest() throws Exception {
        SortInterface sel = new SelectionSort();
        sel.sort(unsorted);
        assertArrayEquals(sorted, unsorted);
    }

    @Test
    public void insertionSortTest() throws Exception {
        SortInterface insert = new InsertionSort();
        insert.sort(unsorted);
        assertArrayEquals(unsorted ,sorted);
    }

    @Test
    public void mergeSortTest() throws Exception {
        SortInterface merge = new MergeSort();
        merge.sort(unsorted);
        assertArrayEquals(unsorted ,sorted);
    }
}
