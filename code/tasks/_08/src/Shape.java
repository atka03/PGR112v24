package tasks._08.src;

abstract public class Shape
{
    //# Felter
    private String color;
    private boolean filled;

    //# Konstruktører
    public Shape() {
        this("red", true);
    }

    public Shape(String color, boolean filled) {
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
    public abstract void makeSound();

    //# Metoder
    @Override
    public String toString() {
        return "Shape[color=" + this.getColor() + ";filled=" + this.isFilled() + ";]";
    }
}