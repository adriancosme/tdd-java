import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberConverterTest {

    @Test
    void should_convert_from_3_to_III() {
        assertEquals("III", RomanNumberConverter.decimalToRoman(3));
    }
    @Test
    void should_convert_numbers_that_need_to_subtract() {
        assertEquals("XCIX", RomanNumberConverter.decimalToRoman(99));
    }
    @Test
    void should_throw_exception_when_number_is_negative() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumberConverter.decimalToRoman(-1));
    }

    @Test
    void should_throw_exception_when_number_is_greater_than_3999() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumberConverter.decimalToRoman(4000));
    }

    @Test
    void should_throw_exception_when_number_is_zero() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumberConverter.decimalToRoman(0));
    }

}