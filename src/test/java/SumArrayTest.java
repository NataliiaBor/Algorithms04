import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumArrayTest {
//    Написать алгоритм SumArray, который возвращает сумму всех чисел массива
//    Test Data:
//    {0, 1, 2, 3, 4, 5} → 15
//    {-7, -3} → -10

    @Order(1)
    @RepeatedTest(2)
    @Test
    public void testSumArrayHappyPathPositiveNumbers () {
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;
        int actualResult = SumArray.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testSumArrayHappyPathNegativeNumbers () {
        int[] array = {-7, -3};
        int expectedResult = -10;
        int actualResult = SumArray.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayEmptyArray () {
        int[] array = {};
        int expectedResult = 0;
        int actualResult = SumArray.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayMaxValueOfElements () {         //???
        int[] array = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        int expectedResult = -2;
        int actualResult = SumArray.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayMinValueOfElements () {         // ???
        int[] array = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        int expectedResult = 0;
        int actualResult = SumArray.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
