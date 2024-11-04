package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int currentTerm = 0;
        int sum = 0;

        for (int i = 0; i < lengthOfLastNumber; i++) {
            currentTerm = currentTerm * 10 + 9;
            sum += currentTerm;
        }

        System.out.println(sum);
    }
}
