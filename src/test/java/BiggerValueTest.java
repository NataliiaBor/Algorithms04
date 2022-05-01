import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {
    //    Test Data:
//            3333, 9999
//    Expected Result = 9999

    @Order(1)
    @RepeatedTest(5)
    @Test
    public void testBiggerValueHappyPathPositiveNumbers () {
        int number1 = 3333;
        int number2 = 9999;
        int expectedResult = 9999;
        int actualResult = BiggerValue.biggerValue(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @RepeatedTest(5)
    @Test
    public void testBiggerValueHappyPathNegativeNumbers () {
        int number1 = -3333;
        int number2 = -9999;
        int expectedResult = -3333;
        int actualResult = BiggerValue.biggerValue(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testBiggerValueHappyPathZeroNumbers () {
        int number1 = 0;
        int number2 = 0;
        int expectedResult = 0;
        int actualResult = BiggerValue.biggerValue(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValueExceptionalNumbers () {
        int number1 = Integer.MAX_VALUE + 2;
        int number2 = Integer.MAX_VALUE + 1;
        int expectedResult = Integer.MAX_VALUE + 2;
        int actualResult = BiggerValue.biggerValue(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValueExceptionalEnormousNumbers () {
        int number1 = Integer.MAX_VALUE + Integer.MAX_VALUE;
        int number2 = Integer.MAX_VALUE + 1;
        int expectedResult = Integer.MAX_VALUE + Integer.MAX_VALUE;
        int actualResult = BiggerValue.biggerValue(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValueExceptionalNegativeEnormousNumbers () {
        int number1 = Integer.MIN_VALUE + Integer.MIN_VALUE;
        int number2 = Integer.MIN_VALUE - 1;
        int expectedResult = Integer.MIN_VALUE - 1;
        int actualResult = BiggerValue.biggerValue(number1, number2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
