package core.basesyntax.shape;

import core.basesyntax.Figure;
import core.basesyntax.Shape;

public class RightTriangle extends Shape implements Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, firstLeg: " + firstLeg + " secondLeg: " + secondLeg + " units, color: " + color);
    }
}
