import org.example.CountingSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountingSortTest {

    @Test
    public void testCountSortWithSimpleString() {
        String input = "edsab";
        String sorted = CountingSort.countSort(input);
        assertEquals("abdes", sorted);
    }

    @Test
    public void testCountSortWithRepeatedCharacters() {
        String input = "geeksforgeeks";
        String sorted = CountingSort.countSort(input);
        assertEquals("eeeefggkkorss", sorted);
    }

    @Test
    public void testCountSortWithSingleCharacter() {
        String input = "a";
        String sorted = CountingSort.countSort(input);
        assertEquals("a", sorted);
    }

    @Test
    public void testCountSortWithEmptyString() {
        String input = "";
        String sorted = CountingSort.countSort(input);
        assertEquals("", sorted);
    }

    @Test
    public void testCountSortWithAlreadySortedString() {
        String input = "abc";
        String sorted = CountingSort.countSort(input);
        assertEquals("abc", sorted);
    }

    @Test
    public void testCountSortWithReverseSortedString() {
        String input = "cba";
        String sorted = CountingSort.countSort(input);
        assertEquals("abc", sorted);
    }
}
