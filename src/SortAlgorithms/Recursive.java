package SortAlgorithms;

import java.time.Duration;
import java.time.Instant;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/27/2020, Thu
 **/
public class Recursive {

    public static void main(String[] args) {
        Instant iterative = Instant.now();
        System.out.println("iterativeFactorial " + iterativeFactorial(10));
        Instant recursive = Instant.now();
        System.out.println(Duration.between(iterative, recursive).toMillis());
        System.out.println("recursiveFactorial " + recursiveFactorial(10));
        Instant finished = Instant.now();
        System.out.println(Duration.between(recursive, finished).toMillis());
    }

    /**
     * 1! = 1 * 0! = 1
     * 2! = 2 * 1 = 2 * 1!
     * 3! = 3 * 2 * 1 =  3 * 2!
     * @param num factorial wished
     * @return factorial result
     */
    public static int iterativeFactorial(int num) {
        //breaking condition
        if (num == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * This method will have a 'calls stackables' therefore a lower performance
     * and a probable  stack over flow because of memory
     * <p>
     * !n =  n * (n - 1)!
     *
     * @param num factorial wished
     * @return factorial result
     */
    public static int recursiveFactorial(int num) {
        //breaking condition
        if (num == 0) {
            return 1;
        }
        return num * recursiveFactorial(num - 1);
    }
}
