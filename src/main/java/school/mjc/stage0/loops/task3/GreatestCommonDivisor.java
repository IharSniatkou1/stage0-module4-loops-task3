package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == 0) {
            System.out.println(second);  // GCD(0, n) is n
            return;
        } else if (second == 0) {
            System.out.println(first);   // GCD(n, 0) is n
            return;
        }

        int gcd = 1;
        int limit = Math.min(first, second);

        for (int i = 1; i <= limit; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }

        System.out.println(gcd);
        }

    }
