package testingRecap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();


    @Test
    void testAddTwoNumbers() {
        //given
        int firstNumber = 12;
        int secondNumber = 3;

        //when
        int actualAddResult = calculator.add(firstNumber, secondNumber);

        //then
        assertEquals(15, actualAddResult); //JUNIT assertEquals
        assertThat(actualAddResult).isEqualTo(15); //tas pats su ASSERTJ biblioteka
    }

    @Test
    void testAddMultipleNumbers() {

        int[] numbersToTest = {5, 2, -6, 8, 1};

        int actualResult = calculator.addMultipleNumbers(numbersToTest);

        assertEquals(10, actualResult);
        assertThat(actualResult).isEqualTo(10);
    }

    @Test
    void testSubtractTwoNumbers() {

        int firstNumber = 10;
        int secondNumber = 5;

        int actualResult = calculator.subtractionTwoNumbers(firstNumber, secondNumber);

        assertThat(actualResult).isEqualTo(5);
    }

    @Test
    void testSubtractionMultipleNumbers() {

        int[] numbersToTest = {5, 8, 3, 2, 1};

        int actualResult = calculator.subtractionMultipleNumbers(numbersToTest);

        assertThat(actualResult).isEqualTo(-9);
    }

    @Test
    void testMultiplyTwoNumbers() {

        int firstNumber = 5;
        int secondNumber = 6;

        int actualResult = calculator.multiply(firstNumber, secondNumber);

        assertEquals(30, actualResult);
    }

    @Test
    void testMultiplyMultipleNumbers() {

        int[] numberToTest = {3, 5, 2};

        int actualResult = calculator.multiplyMultipleNumbers(numberToTest);

        assertThat(actualResult).isEqualTo(30);

    }

    @Test
    void testDivideTwoNumbers() {
        int firstNumber = 4;
        int secondNumber = 2;

        double actualResult = calculator.divideIntegers(firstNumber, secondNumber);

        assertThat(actualResult).isEqualTo(2);
    }

    @Test
    void testDivideTwoNumbersWhereResultIsNotAnInteger() {
        int firstNumber = 9;
        int secondNumber = 2;

        double actualResult = calculator.divideIntegers(firstNumber, secondNumber);

        assertThat(actualResult).isEqualTo(4.5);

    }


    @Test
    void testDivideNumberByZero() {

        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> calculator.divideIntegers(5, 0));

        assertTrue(exception.getMessage().contains("by zero"));


    }

}