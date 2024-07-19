public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); // true
        System.out.println(hasSharedDigit(9, 99)); // false
        System.out.println(hasSharedDigit(15, 55)); // true
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) return false;

        while (num1 > 0) {
            int curNum1 = num1 % 10;
            int changingNum2 = num2;
            while (changingNum2 > 0) {
                int curNum2 = changingNum2 % 10;
                if (curNum1 == curNum2) {
                    return true;
                }
                changingNum2 /= 10;
            }
            num1 /= 10;
        }
        return false;
    }
}
