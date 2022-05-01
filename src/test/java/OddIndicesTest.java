import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddIndicesTest {

    @Order(1)
    @RepeatedTest(5)
    @Test
    public void testOddIndicesTestHappyPathEvenCount() {
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};
        int[] actualResult =OddIndices.OddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddIndicesTestHappyPathOddCount() {
        int[] array = {-45, 590, 234, 985, 12, 68, 1};
        int[] expectedResult = {590, 985, 68};
        int[] actualResult =OddIndices.OddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesTestEmptyArray() {
        int[] array = {};
        int[] expectedResult = {};
        int[] actualResult =OddIndices.OddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesTestTheOnlyOneElement() {
        int[] array = {1};
        int[] expectedResult = {};
        int[] actualResult =OddIndices.OddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
