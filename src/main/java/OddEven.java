public class OddEven {

//    Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,
//    если число нечетное, и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
//
//    Test Data:
//            -345 →  “Odd”
//            0 →  “Even”
//            222222 →  “Even”
//            2147483647 + 1 →  “Undefined”

public static String oddEven(long number) {
    if (number < Integer.MIN_VALUE || number > Integer.MAX_VALUE) {
        return "Undefined";
    } else if (number % 2 == 0) {
        return "Even";
    } else if (number % 2 != 0) {
        return "Odd";
    } else {
        return "Undefined";
    }

}

}
