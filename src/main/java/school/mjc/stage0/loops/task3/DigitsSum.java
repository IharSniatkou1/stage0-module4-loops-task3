package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        t = Math.abs(t);
        String numberStr = Integer.toString(t);
        int sum = 0;

        for (int i = 0; i < numberStr.length(); i++) {
            sum += numberStr.charAt(i) - '0';
            }
        System.out.println(sum);
}
}
