package lsp1.view;

import lsp1.shape.Quadriliteral;
import lsp1.shape.Rectangle;

public class ShapeView {
    private final Quadriliteral quadriliteral;

    public ShapeView(Quadriliteral quadriliteral) {
        this.quadriliteral = quadriliteral;
    }

    public void showArea() {
        System.out.print("Area of quadriliteral equal:");
        System.out.println(quadriliteral.getArea());
    }
}
