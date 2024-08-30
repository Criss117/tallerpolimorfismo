package co.edu.unicauca.taller1;

public class Triangle implements IFigure {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return this.base;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public double calculateArea() {
        return (this.base * this.height) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * this.base;
    }

}
