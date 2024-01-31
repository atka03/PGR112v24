package tasks._08.src;

public class Circle extends Shape {
    //# Felter
    private double radius;

    //# Konstruktører
    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        super();

        this.setRadius(radius);
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);

        this.setRadius(radius);
    }

    //# Getter-metoder
    public double getRadius() {
        return this.radius;
    }

    //# Setter-metoder
    private void setRadius(double value) {
        this.radius = value;
    }

    //# Metoder
    // Regn ut areal
    public double getArea() {
        return (radius * radius) * 3.14;
    }

    // Regn ut omkrets
    public double getPerimeter() {
        return (radius * 2) * 3.14;
    }

    @Override
    public String toString() {
        return "ID:" + getId() + "\n"
                + "Radius: " + getRadius() + "\n"
                + "Omkrets: " + getPerimeter() + "\n"
                + "Areal: " + getArea() + "\n"
                + "Farge" + getColor();
    }
}