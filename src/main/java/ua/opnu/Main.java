
package ua.opnu;

public class Main {
    /**
     * The main entry point of the application.
     *
     * @param args Command-line arguments passed to the program.
     */
    public static void main(final String[] args) {
        System.out.println("Hello world!");
    }

    // ======== Logical operations ========
    /**
     * Threshold above which temperature is considered "hot".
     */


    private static final int HOT_THRESHOLD = 100;

    /**
     * Given two temperatures, return true if
     * one is less than 0 and the other is greater than 100.
     * Example:
     * icyHot(120, -1) → true
     * icyHot(-1, 120) → true
     * icyHot(2, 120) → false
     *
     * @param temp1 The first temperature.
     * @param temp2 The second temperature.
     * @return True if one temperature is icy
     * and the other is hot, false otherwise.
     */
    public boolean icyHot(final int temp1, final int temp2) {
        return (temp1 < 0 && temp2 > HOT_THRESHOLD)
                || (temp1 > HOT_THRESHOLD && temp2 < 0);
    }

    /**
     * Minimum value allowed for in1020 check.
     */
    private static final int MIN_RANGE = 10;
    /**
     * Maximum value allowed for in1020 check.
     */
    private static final int MAX_RANGE = 20;

    /**
     * Given 2 int values, return true if either
     * of them is in the range 10..20 inclusive.
     * Example:
     * in1020(12, 99) → true
     * in1020(21, 12) → true
     * in1020(8, 99) → false
     *
     * @param a The first integer value.
     * @param b The second integer value.
     * @return True if either {@code a} or {@code b}
     * is between 10 and 20 (inclusive); false otherwise.
     */
    public boolean in1020(final int a, final int b) {
        return (a >= MIN_RANGE && a <= MAX_RANGE)
                || (b >= MIN_RANGE && b <= MAX_RANGE);
    }

    /**
     * The minimum value (inclusive) for the "teen" range.
     */
    private static final int TEEN_MIN = 13;
    /**
     * The maximum value (inclusive) for the "teen" range.
     */
    private static final int TEEN_MAX = 19;


    /**
     * We'll say that a number is "teen" if it is in the
     * range 13..19 inclusive. Given 3 int values, return true if 1
     * or more of them are teen.
     * Example:
     * hasTeen(13, 20, 10) → true
     * hasTeen(20, 19, 10) → true
     * hasTeen(20, 10, 13) → true
     *
     * @param a The first integer.
     * @param b The second integer.
     * @param c The third integer.
     * @return True if any of the three integers are in the teen range.
     */
    public boolean hasTeen(final int a, final int b, final int c) {
        return (a >= TEEN_MIN && a <= TEEN_MAX)
                || (b >= TEEN_MIN && b <= TEEN_MAX)
                || (c >= TEEN_MIN && c <= TEEN_MAX);
    }

    // ======== Boolean expressions ========

    /**
     * The parameter weekday is true if it is a weekday,
     * and the parameter vacation is true if we are on vacation.
     * We sleep in if it is not a weekday or we're on vacation.
     * Return true if we sleep in.
     * Example:
     * sleepIn(false, false) → true
     * sleepIn(true, false) → false
     * sleepIn(false, true) → true
     *
     * @param weekday  True if it is a weekday.
     * @param vacation True if we are on vacation.
     * @return True if we can sleep in, false otherwise
     */
    public boolean sleepIn(final boolean weekday, final boolean vacation) {
        return !weekday || vacation;
    }

    /**
     * We have two monkeys, a and b, and the
     * parameters aSmile and bSmile indicate if each is smiling.
     * We are in trouble if they are both smiling or if
     * neither of them is smiling. Return true if we are in trouble.
     * Example:
     * monkeyTrouble(true, true) → true
     * monkeyTrouble(false, false) → true
     * monkeyTrouble(true, false) → false
     *
     * @param aSmile True if monkey 'a' is smiling.
     * @param bSmile True if monkey 'b' is smiling.
     * @return True if we are in trouble, false otherwise.
     */
    public boolean monkeyTrouble(final boolean aSmile, final boolean bSmile) {
        return (aSmile && bSmile || !aSmile && !bSmile);
    }

    /**
     * Given 2 int values, return true if one is negative
     * and one is positive. Except if the parameter "negative"
     * is true, then return true only if both are negative.
     * Example:
     * posNeg(1, -1, false) → true
     * posNeg(-1, 1, false) → true
     * posNeg(-4, -5, true) → true
     *
     * @param a        The first integer.
     * @param b        The second integer.
     * @param negative A boolean to control the negative check.
     * @return True if one is positive and the other
     * is negative, or both negative if 'negative' is true
     */
    public boolean posNeg(final int a, final int b, final boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        }
    }

    // ======== Loops and Arrays ========
    /**
     * Target number used for searching in arrays (default = 9).
     */

    private static final int TARGET_NUMBER = 9;

    /**
     * Given an array of ints, return the number of 9's in the array.
     * Example:
     * arrayCount9([1, 2, 9]) → 1
     * arrayCount9([1, 9, 9]) → 2
     * arrayCount9([1, 9, 9, 3, 9]) → 3
     *
     * @param nums The array of integers to search through.
     * @return The number of 9s found in the array.
     */
    public int arrayCount9(final int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == TARGET_NUMBER) {
                count++;
            }
        }
        return count;
    }

    /**
     * private static final int TARGET_NUMBER = 9.
     */
    private static final int TARGET_NUMBERV2 = 9;
    /**
     * Maximum number of elements to search from start of array..
     */
    private static final int SEARCH_LIMIT = 4;

    /**
     * Given an array of ints, return true if
     * one of the first 4 elements in the array is a 9.
     * The array length may be less than 4.
     * Example:
     * arrayFront9([1, 2, 9, 3, 4]) → true
     * arrayFront9([1, 2, 3, 4, 9]) → false
     * arrayFront9([1, 2, 3, 4, 5]) → false
     *
     * @param nums The array of numbers to search through.
     * @return True if any of the first up to four
     * elements is {@code 9}; false otherwise.
     */
    public boolean arrayFront9(final int[] nums) {
        for (int i = 0; i < Math.min(nums.length, SEARCH_LIMIT); i++) {
            if (nums[i] == TARGET_NUMBERV2) {
                return true;
            }
        }
        return false;
    }

    /**
     * value representing the last element in the sequence 1-2-3..
     */
    private static final int SEQUENCE_END = 3;

    /**
     * given an array of ints.
     * return true if the sequence of numbers 1, 2, 3
     * appears in the array somewhere.
     * example:
     * array123([1, 1, 2, 3, 1]) → true
     * array123([1, 1, 2, 4, 1]) → false
     * array123([1, 1, 2, 1, 2, 3]) → true
     *
     * @param nums The array of integers to search.
     * @return True if the sequence 1, 2, 3 is found, false otherwise.
     */
    public boolean array123(final int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2]
                    == SEQUENCE_END) {
                return true;
            }
        }
        return false;
    }

    // ======== Strings ========

    /**
     * given a string name, e.g. "Bob".
     * return a greeting of the form "Hello Bob!".
     * example:
     * helloName("Bob") → "Hello Bob!"
     * helloName("Alice") → "Hello Alice!"
     * helloName("X") → "Hello X!"
     *
     * @param name The name of the user to greet.
     * @return A greeting string in the form "Hello {@code name}!".
     */
    public String helloName(final String name) {
        return "Hello " + name + "!";

    }

    /**
     * given a string of any length.
     * return a new string where the last 2 chars.
     * if present, are swapped, so "coding".
     * yields "codign"
     * Example:
     * lastTwo("coding") → "codign"
     * lastTwo("cat") → "cta"
     * lastTwo("ab") → "ba"
     *
     * @param str The string to be processed.
     * @return The original string with its last two
     * characters swapped (or the original string if length < 2).
     */
    public String lastTwo(final String str) {
        if (str == null || str.length() < 2) {
            return str;
        }
        return str.substring(0, str.length() - 2)
                + str.charAt(str.length() - 1)
                + str.charAt(str.length() - 2);
    }

    /**
     * given a string of even length.
     * return a string made of the middle two chars.
     * so the string "string" yields "ri".
     * the string length will be at least 2.
     * middleTwo("string") → "ri"
     * middleTwo("code") → "od"
     * middleTwo("Practice") → "ct"
     *
     * @param str The string to be processed.
     * @return A string consisting of the two middle characters.
     */
    public String middleTwo(final String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }
}
