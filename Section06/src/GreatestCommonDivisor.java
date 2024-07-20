public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15)); // 5
        System.out.println(getGreatestCommonDivisor(12, 30)); // 6
        System.out.println(getGreatestCommonDivisor(9, 18)); // -1
        System.out.println(getGreatestCommonDivisor(81, 153)); // 9
        System.out.println(getGreatestCommonDivisor(30, 60)); // 30
    }

    public static int getGreatestCommonDivisor(int first,  int second) {
        if (first < 10 || second < 10) return -1;

        int lesser = Math.min(first, second);
        int greatestCommonDivisor = 0;
        for (int i = lesser; i > 0; i--) {
            if (first % i == 0 && second % i == 0) {
                greatestCommonDivisor = i;
                break;
            }
        }
        return greatestCommonDivisor;
    }
}
