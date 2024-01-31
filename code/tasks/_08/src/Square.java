package tasks._08.src;

public class Square extends Shape
{
    //# Felter
    private double side;

    //# Konstruktører
    public Square() {
        this(1.0);
    }

    public Square(double side) {
        super();

        this.setSide(side);
    }

    //# Getter-metoder
    public double getSide() {
        return this.side;
    }

    //# Setter-metoder
    private void setSide(double value) {
        this.side = value;
    }

    //# Metoder
    // Regn ut areal
    public double getArea() {
        return side*side;
    }

    // Regn ut omkrets
    public double getPerimeter() {
        return side*4;
    }
}