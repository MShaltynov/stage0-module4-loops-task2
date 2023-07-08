package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public static void main(String[] args) {
        buildPhrase('a', 'b', 'c');
    }

    public static void buildPhrase(char... chars) {
        int i = 0;
        while (i<1) {
            System.out.print(chars);
            i++;
        }
    }
}
