public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4)); // false
        System.out.println(canPack(1, 0, 5)); // true
        System.out.println(canPack(0, 5, 4)); // true
        System.out.println(canPack(2, 2, 11)); // true
        System.out.println(canPack(-3, 2, 12)); // false
        System.out.println(canPack(3, 3, 20)); // false
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        // not enough big and/or small to pack the goal
        if (bigCount * 5 + smallCount < goal) return false;

        int bigBagHold = 5;
        int totalBigBags = bigCount * bigBagHold;
        // there are enough bigBags to cover the goal
        if (totalBigBags >= goal) {
            int remaining = goal % bigBagHold;
            return smallCount >= remaining;
        } else {
            return goal - totalBigBags <= smallCount;
        }
    }
}
