package tasks._08.src;

abstract public class Shape
{
    //# Felter
    private String color;
    private boolean filled;
    private final int id;
    public static int counter = 0;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Shape.counter = counter;
    }

    //# Konstruktører
    public Shape() {
        this("red", true);
    }

    public Shape(String color, boolean filled) {
        counter++;
        id = counter;
        this.setColor(color);
        this.setFilled(filled);
    }

    //# Getter-metoder

    public String getColor() {
        return this.color;
    }

    public boolean isFilled() {
        return this.filled;
    }
    public int getId(){
        return id;
    }

    //# Setter-metoder
    private void setColor(String value) {
        this.color = value;
    }

    private void setFilled(boolean value) {
        this.filled = value;
    }

    public void eat(){
        System.out.println("Eat");
    };
    public abstract double getArea();
    public abstract double getPerimeter();

    //# Metoder
    @Override
    public String toString() {
        return "Shape[color=" + this.getColor() + ";filled=" + this.isFilled() + ";]";
    }
}