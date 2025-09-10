package lab1;

public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int total = 0;
        while (i < 1000) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            // Print our appropriate result.
            if (divisibleBy3) {
                total++;
            }  else if (divisibleBy5) {
                total++;
            }
            i++;
        } System.out.println(total);
    }
}
