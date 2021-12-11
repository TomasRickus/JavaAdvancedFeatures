package testingRecap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShapeCalculatorTest {

    private ShapeCalculator shapeCalculator = new ShapeCalculator();

    @Test
    void testCalculateSquareArea() {
        //given
        Square square = new Square(5.5, 0, 6.8);

        //when CLTRL + ALT + V pazymejus visa eilute
        double squareArea = shapeCalculator.calculateSquareArea(square);

        //then
        assertThat(squareArea).isEqualTo(37.4);
    }

    @Test
    void shouldReturnZero_WhenParametersAreNegative() {
        Square square = new Square(5.5, 0, -6.8);

        double squareArea = shapeCalculator.calculateSquareArea(square);

        assertThat(squareArea).isEqualTo(0);
    }

    @Test
    void testCalculateSquareVolume() {
        Square square = new Square(5.5, 2, 6.8);

        double squareVolume = shapeCalculator.calculateSquareVolume(square);

        assertThat(squareVolume).isEqualTo(74.8);

    }

    @Test
    void testCalculateSquarePrice() {
        Square square = new Square(5.5, 2, 6.8, 15);

        double squarePrice = shapeCalculator.calculateSquarePrice(square);

        assertThat(squarePrice).isEqualTo(204.0);

    }
}
