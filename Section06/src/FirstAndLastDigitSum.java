public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252)); // 4
        System.out.println(sumFirstAndLastDigit(257)); // 9
        System.out.println(sumFirstAndLastDigit(0)); // 0
        System.out.println(sumFirstAndLastDigit(5)); // 10
        System.out.println(sumFirstAndLastDigit(-10)); // -1
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        int lastNum = number % 10;
        int firstNum = 0;
        while (number > 0) {
            if (number < 10) {
                firstNum = number;
            }
            number /= 10;
        }
        return lastNum + firstNum;
    }
}
