public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(71484)); // false
        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(707)); // true
        System.out.println(isPalindrome(11212)); // false
    }

    public static boolean isPalindrome(int number) {
        int reversedNum = 0;
        int changingNum = number;

        while (changingNum > 9) {
            reversedNum = (reversedNum * 10) + (changingNum % 10);
            changingNum /= 10;
        }

        return number == (reversedNum * 10 + changingNum);
    }
}
