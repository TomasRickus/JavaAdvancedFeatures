package testingRecap;

public class ShapeCalculator {

    public double calculateSquareArea(Square square) {
        //gerai patikrinti butu ar ne nullas
        if (square.getHeight() <= 0 || square.getWidth() <= 0) {
            System.out.println("Can't calculate area since one of the given params are below 0");
            return 0;
        }
        return square.getHeight() * square.getWidth();
    }

    public double calculateSquareVolume(Square square) {
        return square.getHeight() * square.getWidth() * square.getLength();
    }

    public double calculateSquarePrice(Square square) {
        return square.getHeight() * square.getPrice() * 2;
    }

}