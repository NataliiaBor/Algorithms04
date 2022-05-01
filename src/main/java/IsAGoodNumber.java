public class IsAGoodNumber {
//    Given an integer M perform the following conditional actions:
//    If M is multiple of 3 and 5 then return "Good Number".
//    If M is only multiple of 3 and not of 5 then return "Bad Number"
//    If M is only multiple of 5 and not of 3 then return "Poor Number"
//    If M doesn't satisfy any of the above conditions then return "-1"

    public static String isAGoodNumber(int m) {
        if (m % 3 == 0 && m % 5 == 0) {
            return "Good number";
        } else if (m % 3 == 0) {
            return "Bad number";
        } else if (m % 5 == 0) {
            return "Poor number";
        } else {
            return "-1";
        }
    }

}
