import java.util.ArrayList;
import java.util.List;

/**
 * Created by garyturovsky on 5/26/16.
 */
public class FibonacciMaker {
    public Integer fib(int n) {
        if (n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }

    public List<Integer> get(int n) {

        ArrayList<Integer> fibs = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {
           fibs.add( fib(i));
        }

        return fibs;
    }
}
