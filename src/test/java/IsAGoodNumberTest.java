import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IsAGoodNumberTest {

    @Order(1)
    @RepeatedTest(5)
    @Test
    public void testIsAGoodNumberHappyPathMultipleOfBothNumbers () {
        int m = 15;
        String expectedResult = "Good number";
        String actualResult = IsAGoodNumber.isAGoodNumber(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testIsAGoodNumberHappyPathMultipleOfThree () {
        int m = 9;
        String expectedResult = "Bad number";
        String actualResult = IsAGoodNumber.isAGoodNumber(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testIsAGoodNumberHappyPathMultipleOfFive () {
        int m = 10;
        String expectedResult = "Poor number";
        String actualResult = IsAGoodNumber.isAGoodNumber(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testIsAGoodNumberHappyPathNotAMultiple () {
        int m = -1;
        String expectedResult = "-1";
        String actualResult = IsAGoodNumber.isAGoodNumber(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsAGoodNumberZero () {
        int m = 0;
        String expectedResult = "Good number";
        String actualResult = IsAGoodNumber.isAGoodNumber(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsAGoodNumberExceptionalEnormousNumber () {
        int m = Integer.MAX_VALUE + 1;
        String expectedResult = "-1";
        String actualResult = IsAGoodNumber.isAGoodNumber(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsAGoodNumberExceptionalTooLowNumber () {
        int m = Integer.MIN_VALUE - 1;
        String expectedResult = "-1";
        String actualResult = IsAGoodNumber.isAGoodNumber(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
