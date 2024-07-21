public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(0)); // 1;
        System.out.println(getDigitCount(123)); // 3
        System.out.println(getDigitCount(-12)); // -1
        System.out.println(getDigitCount(5200)); // 4

        System.out.println(reverse(-121)); // -121
        System.out.println(reverse(1212)); // 2121
        System.out.println(reverse(1234)); // 4321
        System.out.println(reverse(100)); // 1

        numberToWords(123); // One Two Three
        numberToWords(1010); // One Zero One Zero
        numberToWords(1000); // One Zero Zero Zero
        numberToWords(-12); // Invalid Value
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversed = reverse(number);
        int count = getDigitCount(number);

        for (int i = 0; i < count; i++) {
            int lastDigit = reversed % 10;
            switch (lastDigit) {
                case 1 -> System.out.print("One ");
                case 2 -> System.out.print("Two ");
                case 3 -> System.out.print("Three ");
                case 4 -> System.out.print("Four ");
                case 5 -> System.out.print("Five ");
                case 6 -> System.out.print("Six ");
                case 7 -> System.out.print("Seven ");
                case 8 -> System.out.print("Eight ");
                case 9 -> System.out.print("Nine ");
                default -> System.out.print("Zero ");
            }
            reversed /= 10;
        }
        System.out.println(" ");
    }

    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            reversed = (reversed * 10) + number % 10;
            number /= 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        if (number < 10) return 1;
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
