package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void main(String[] args) {
        printPower(5);
    }

    public static void printPower(int power) {
        int i = 0;
        int result = 1;
        if (power >= 0) {
            while (i <= power) {
                if (i == 0) {
                    System.out.println(1);
                } else {
                    result = result * 2;
                    System.out.println(result);
                }
                i++;
            }

        } else {
            System.out.println("too much power");
        }
    }
}
