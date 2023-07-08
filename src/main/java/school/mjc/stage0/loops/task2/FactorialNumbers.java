package school.mjc.stage0.loops.task2;

public class FactorialNumbers {

    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        int k = 1;
        while (i <= printToInclusive) {
            if (i == 0) {
                System.out.println(1);
            } else {
                k = k * i;
                System.out.println(k);
            }
            i++;
        }

    }
}
