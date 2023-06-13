import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    //Si el número es divisible por 3, retorna “Fizz”
//Si el número es divisible por 5, retorna “Buzz”
//Si el número es divisible por 3 y por 5, retorna “FizzBuzz”
//En otro caso, retorna el mismo número
    @Test
    void should_return_fizz_if_is_divisible_by_3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
    }

    @Test
    void should_return_buzz_if_is_divisible_by_5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    void should_return_fizzbuzz_if_is_divisible_by_3_and_5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }

    @Test
    void should_return_a_number_if_is_not_divisible_by_3_and_5() {
        assertEquals("2", FizzBuzz.fizzBuzz(2));
        assertEquals("16", FizzBuzz.fizzBuzz(16));
    }
}