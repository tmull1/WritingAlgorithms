import org.example.QuickSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuickSortTest {

    @Test
    public void testQuickSortWithUnsortedArray() {
        int[] array = {4, 1, 3, 9, 7};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{1, 3, 4, 7, 9}, array);
    }

    @Test
    public void testQuickSortWithAlreadySortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testQuickSortWithReverseSortedArray() {
        int[] array = {5, 4, 3, 2, 1};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testQuickSortWithAllEqualElements() {
        int[] array = {5, 5, 5, 5, 5};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{5, 5, 5, 5, 5}, array);
    }

    @Test
    public void testQuickSortWithSingleElementArray() {
        int[] array = {1};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{1}, array);
    }

    @Test
    public void testQuickSortWithEmptyArray() {
        int[] array = {};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{}, array);
    }
}
