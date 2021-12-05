package testingRecap;

import org.apache.log4j.Logger;

import java.util.Arrays;

public class Calculator {

    private static final Logger LOGGER = Logger.getLogger(Calculator.class);

    public int add(int firstNumber, int secondNumber) {
        LOGGER.info("Adding two numbers " + firstNumber + " and " + secondNumber);
        return firstNumber + secondNumber;
    }

    public int addMultipleNumbers(int[] numbers) {
        LOGGER.info("Adding numbers " + Arrays.toString(numbers));
        int total = 0;
        for (int number : numbers) {
            total += number;
        }

        return total;
    }

    public int subtractionTwoNumbers(int firstNumber, int secondNumber) {
        LOGGER.info("Subtracting two numbers " + firstNumber + " and " + secondNumber);
        return firstNumber - secondNumber;
    }

    public int subtractionMultipleNumbers(int[] numbers) {
        LOGGER.info("Subtracting numbers " + Arrays.toString(numbers));
        int total = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            total -= numbers[i];
        }


        return total;

    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int multiplyMultipleNumbers(int[] numbers) {
        int total = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            total *= numbers[i];

        }
        return total;

    }

    public double divideIntegers(int firstNumber, int secondNumber) {
        return (double) firstNumber / secondNumber;
    }

}


