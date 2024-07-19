public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789)); // 20
        System.out.println(getEvenDigitSum(252)); // 4
        System.out.println(getEvenDigitSum(-22)); // -1
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int sum = 0;

        while (number > 0) {
            int curNum = number % 10;
            if (curNum % 2 == 0) {
                sum += curNum;
            }
            number /= 10;
        }
        return sum;
    }
}
