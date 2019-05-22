package uk.gov.hmcts.reform.nodeload;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;


public class ApplicationTest {

    @Test
    public void whenPrimeNumbersExist_thenReturnedInList() {
        List<Integer> primes = Application.primeNumbersTill(15);
        System.out.println(primes);
        assertEquals(6, primes.size());
        assertThat(primes).containsExactly(2, 3, 5, 7, 11, 13);
    }

    @Test
    public void whenPrimeNumbersDoNotExist_thenNoneReturnedInList() {
        List<Integer> primes = Application.primeNumbersTill(1);
        System.out.println(primes);
        assertEquals(0, primes.size());
    }

}

