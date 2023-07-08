package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public static void main(String[] args) {
        printPrimeNumbers(10);
    }

    public static void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        int k = 0;

        boolean isSimpleFalse = false;
        while (i <= printToInclusive) {
            k = i - 1;
            while (k > 1) {

                if (i % k == 0 && i != 2) {
                    isSimpleFalse = true;
                    break;
                }
                k--;
            }
            if (k <= 1 && isSimpleFalse == false || i == 2) {
                System.out.println(i);
            }
            isSimpleFalse = false;
            i++;

        }

    }
}
