package SortAlgorithms;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/27/2020, Thu
 **/
public class Recursive {

    public static void main(String[] args) {
        System.out.println(iterativeFactorial(3));
    }

    /**
     *
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
}
