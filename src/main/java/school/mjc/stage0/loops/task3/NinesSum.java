package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        String s = "9";
        for (int i = 0; i < lengthOfLastNumber; i++) {
            sum += Integer.parseInt(s);
            s = s+9;
        }
        System.out.println(sum);
    }
}
