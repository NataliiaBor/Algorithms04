import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IsPositiveNumberTest {
    //    Проверьте работу метода на числах 555, 0 и -555.
    IsPositiveNumber ipn;

    @BeforeEach
    public void setUp() {
        ipn = new IsPositiveNumber();
    }

    @Order(1)
    @RepeatedTest(5)
    @Test
    public void testIsPositiveNumberHappyPathPositiveNumber() {
         int number = 555;
         boolean expectedResult = true;
         boolean actualResult = ipn.isPositiveNumber(number);

         Assertions.assertEquals(expectedResult, actualResult);
     }

    @Order(2)
     @Test
    public void testIsPositiveNumberHappyPathNegativeNumber() {
        int number = -555;
        boolean expectedResult = false;
        boolean actualResult = ipn.isPositiveNumber(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testIsPositiveNumberHappyPathZeroNumber() {
        int number = 0;
        boolean expectedResult = true;
        boolean actualResult = ipn.isPositiveNumber(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumberExceptionalEnormousNumber() {
        int number = Integer.MAX_VALUE + Integer.MAX_VALUE;
        boolean expectedResult = false;
        boolean actualResult = ipn.isPositiveNumber(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumberExceptionalTooLowNumber() {
        int number = Integer.MIN_VALUE + Integer.MIN_VALUE;
        boolean expectedResult = true;
        boolean actualResult = ipn.isPositiveNumber(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
