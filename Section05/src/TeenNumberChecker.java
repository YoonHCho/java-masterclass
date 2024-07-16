public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19)); // should return true since 19 is in range 13 - 19
        System.out.println(hasTeen(23, 15, 42)); // should return true since 15 is in range 13 - 19
        System.out.println(hasTeen(22, 23, 34)); // should return false since numbers 22, 23, 34 are not in range 13-19

        System.out.println(isTeen(9)); // should return false since 9 is in not range 13 - 19
        System.out.println(isTeen(13)); // should return true since 13 is in range 13 - 19
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        return (num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19);
    }

    public static boolean isTeen(int num1) {
        return num1 >= 13 && num1 <= 19;
    }
}
