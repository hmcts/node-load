package uk.gov.hmcts.reform.nodeload;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Application {

    public static List<Integer> primeNumbersTill(int n) {
        return IntStream.rangeClosed(2, n)
                .filter(x -> isPrime(x)).boxed()
                .collect(Collectors.toList());
    }

    // This aims to use the fork-join pool inefficiently. Please do not optimize
    private static boolean isPrime(int number) {
        return IntStream.range(2, number)
                .parallel()
                .allMatch(n -> number % n != 0);
    }


    public static void main(String[] args) {
        long n = 0;
        while (true) {
            n++;
            System.out.println(String.format("Iteration %d started", n));
            List<Integer> primes = primeNumbersTill(Integer.valueOf(args[0]));
            System.out.println(String.format("Iteration %d completed. Found %d primes", n, primes.size()));
        }
    }

}
