import org.example.BubbleSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        int[] array = {5, 2, 9, 1, 5, 6};
        BubbleSort.bubbleSort(array, array.length);
        assertArrayEquals(new int[]{1, 2, 5, 5, 6, 9}, array);
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        BubbleSort.bubbleSort(array, array.length);
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testSingleElementArray() {
        int[] array = {1};
        BubbleSort.bubbleSort(array, array.length);
        assertArrayEquals(new int[]{1}, array);
    }

    @Test
    public void testAlreadySortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(array, array.length);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testReverseSortedArray() {
        int[] array = {5, 4, 3, 2, 1};
        BubbleSort.bubbleSort(array, array.length);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }
}
