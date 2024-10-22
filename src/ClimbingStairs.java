public class ClimbingStairs {
    public static void main(String[] args) {

        System.out.println(climbStairs(5));

    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int oneStepBefore = 2;
        int twoStepsBefore = 1;
        int allWays = 0;

        for (int i = 3; i <= n; i++) {
            allWays = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = allWays;
        }

        return allWays;
    }

}
