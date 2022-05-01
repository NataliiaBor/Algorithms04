import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MinMaxAveTest {

    @Order(1)
    @Test
    public void testMinMaxAveHappyPathPositiveNumbers() {
        int[] array =  {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {3, 7, 5};
        int[] actualResult = MinMaxAve.minMaxAve(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testMinMaxAveHappyPathNegativeNumbers() {
        int[] array =  {-1, -2, -3, -4, -5, -6, -7, -8};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {-7, -3, -5};
        int[] actualResult = MinMaxAve.minMaxAve(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testMinMaxAveHappyPathZeroNumbers() {
        int[] array =  {0, 0, 0, 0, 0, 0, 0, 0};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {0, 0, 0};
        int[] actualResult = MinMaxAve.minMaxAve(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveNullArray() {
        int[] array =  {};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = null;
        int[] actualResult = MinMaxAve.minMaxAve(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveExceptionalIndexes() {
        int[] array =  {1, 2};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = null;
        int[] actualResult = MinMaxAve.minMaxAve(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveEqualIndexes() {
        int[] array =  {1, 2};
        int index1 = 1;
        int index2 = 1;
        int[] expectedResult = {2, 2, 2};
        int[] actualResult = MinMaxAve.minMaxAve(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveNullArrayEqualZeroIndexes() {
        int[] array =  {};
        int index1 = 0;
        int index2 = 0;
        int[] expectedResult = null;
        int[] actualResult = MinMaxAve.minMaxAve(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
