package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        if (firstBoarder > secondBoarder) {
            for (int i = secondBoarder; i <= firstBoarder; i++) {
                sum += i;
            }
        } else if (firstBoarder < secondBoarder) {
            for (int i = firstBoarder; i <= secondBoarder; i++) {
                sum += i;
            }
        }         else {
                sum += firstBoarder;
            }
        System.out.println(sum);
        }
    }
