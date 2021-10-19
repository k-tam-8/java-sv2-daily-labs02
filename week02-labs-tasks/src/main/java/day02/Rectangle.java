package day02;

public class Rectangle {
    private double sidaA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
    this.sidaA=sideA;
    this.sideB=sideB;
    }
    public double CalculateArea() {
        return sidaA*sideB;
    }
}
