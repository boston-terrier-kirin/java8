package fnif;

import java.util.function.Predicate;

/**
 * 引数あり
 * 戻り値はboolean
 */
public class PredicateExample {
    public static void main(String[] args) {
        {
            System.out.println(isPhoneNumberValid("09012345678"));
        }

        {
            Predicate<String> isPhoneNumberValidPredicate = (phoneNumber) -> {
                return phoneNumber.startsWith("090") && phoneNumber.length() == 11;
            };

            boolean result = isPhoneNumberValidPredicate.test("08012345678");
            System.out.println(result);
        }

        {
            Predicate<String> isPhoneNumberValidPredicate = (phoneNumber) -> {
                return phoneNumber.startsWith("090") && phoneNumber.length() == 11;
            };
            
            Predicate<String> containsNumber3 = phoneNumber -> {
                return phoneNumber.contains("3");
            };

            boolean result = isPhoneNumberValidPredicate.and(containsNumber3).test("09042844322");
            System.out.println(result);
        }
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("090") && phoneNumber.length() == 11;
    }

}