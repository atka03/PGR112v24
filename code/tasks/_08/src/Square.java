package tasks._08.src;

public class Square extends Rectangle {

    //# Konstruktører
    public Square() {
        this(1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    //# Getter-metoder
    public double getSide() {
        return this.height;
    }

    //# Setter-metoder
    private void setSide(double value) {
        this.height = value;
    }

    //# Metoder
    // Regn ut areal
    public double getArea() {
        return width * height;
    }

    // Regn ut omkrets
    public double getPerimeter() {
        return height * 4;
    }
}