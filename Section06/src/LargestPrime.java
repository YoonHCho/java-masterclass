public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21)); // 7
        System.out.println(getLargestPrime(217)); // 31
        System.out.println(getLargestPrime(0)); // -1
        System.out.println(getLargestPrime(45)); // 5
        System.out.println(getLargestPrime(-1)); // -1
    }

    public static int getLargestPrime(int number) {
        // return -1 as invalid value for any number less than equal to 1 b/c the lowest prime factor is 2
        if (number < 2) return -1;
        for (int i = number; i > 1; i--) {
            // created another method isPrime, checking if i is divisible evenly and if that i isPrime
            if (number % i == 0 && isPrime(i)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isPrime(int number) {
        // since prime number can only be factored by 1 and by itself, iterate starts at 2 and ends before itself.
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
