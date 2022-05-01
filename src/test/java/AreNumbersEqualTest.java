import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AreNumbersEqualTest {
    //    Test Data:
//            89, 89
//    Expected result: 0
//            -89, 89
//    Expected result: -1
//            89, -89
//    Expected result: 1

    @Order(1)
    @Test
    public void testAreNumbersEqualHappyPathEqualNumbers() {
        int number1 = 89;
        int number2 = 89;
        int expectedResult = 0;
        int actualResult = AreNumbersEqual.areNumbersEqual(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testAreNumbersEqualHappyPathFirstNumberIsLess() {
        int number1 = -89;
        int number2 = 89;
        int expectedResult = -1;
        int actualResult = AreNumbersEqual.areNumbersEqual(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAreNumbersEqualHappyPathFirstNumberIsGreater() {
        int number1 = 89;
        int number2 = -89;
        int expectedResult = 1;
        int actualResult = AreNumbersEqual.areNumbersEqual(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqualExceptionalMeanings() {
        int number1 = Integer.MAX_VALUE + 1;
        int number2 = Integer.MIN_VALUE - 1;
        int expectedResult = -1;
        int actualResult = AreNumbersEqual.areNumbersEqual(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
