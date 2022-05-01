import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddEvenTest {
//    Test Data:
//            -345 →  “Odd”
//            0 →  “Even”
//            222222 →  “Even”
//            2147483647 + 1 →  “Undefined”

    @Order(1)
    @Test
    public void testOddEvenHappyPathOddNumber() {
        int number = -345;
        String expectedResult = "Odd";
        String actualResult = OddEven.oddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddEvenHappyPathZeroNumber() {
        int number = 0;
        String expectedResult = "Even";
        String actualResult = OddEven.oddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOddEvenHappyPathEvenNumber() {
        int number = 222222;
        String expectedResult = "Even";
        String actualResult = OddEven.oddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenExceptionalEnormousNumber() {
        long number = 2147483647 + 1L;
        String expectedResult = "Undefined";
        String actualResult = OddEven.oddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenExceptionalMinNumber() {
        long number = -2147483648 - 1L;
        String expectedResult = "Undefined";
        String actualResult = OddEven.oddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
