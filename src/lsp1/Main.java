package lsp1;

import lsp1.shape.Quadriliteral;
import lsp1.shape.Rectangle;
import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Quadriliteral quadriliteral = new Square(5);
        System.out.printf("In a quadriliteral area =  ", quadriliteral.getArea());
        ShapeView view = new ShapeView(quadriliteral);
        view.showArea();
    }
}
