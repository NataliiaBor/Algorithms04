import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddIndicesTest {

    @Order(1)
    @RepeatedTest(5)
    @Test
    public void testOddIndicesHappyPathEvenCount() {
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};
        int[] actualResult =OddIndices.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddIndicesHappyPathOddCount() {
        int[] array = {-45, 590, 234, 985, 12, 68, 1};
        int[] expectedResult = {590, 985, 68};
        int[] actualResult =OddIndices.oddIndices(array);;

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesEmptyArray() {
        int[] array = {};
        int[] expectedResult = {};
        int[] actualResult =OddIndices.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesTheOnlyOneElement() {
        int[] array = {1};
        int[] expectedResult = {};
        int[] actualResult =OddIndices.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
