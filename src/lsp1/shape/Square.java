package lsp1.shape;

public class Square implements Quadriliteral {

    private int side;

    public Square(int side) {
        this.side = side;
    }


    public void setSide(int sideA) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return  Math.pow(getSide(), 2);
    }

    private double getSide() {
        return side;
    }
}
