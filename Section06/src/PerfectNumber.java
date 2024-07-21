public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6)); // true
        System.out.println(isPerfectNumber(28)); // true
        System.out.println(isPerfectNumber(5)); // false
        System.out.println(isPerfectNumber(-1)); // false
    }

    public static boolean isPerfectNumber(int number) {
        // since the smallest perfect number is 6 therefore any number below 6 is not a perfect number
        if (number < 6) return false;

        // to reduce the iteration, the second-lowest proper divisor would be 2
        int highestProperDivisor = number / 2;
        // sum starts with 1 since 1 is a proper divisor
        int sum = 1;

        for (int i = 2; i <= highestProperDivisor; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
