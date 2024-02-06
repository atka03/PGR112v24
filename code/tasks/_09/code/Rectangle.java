package tasks._09.code;

public class Rectangle extends Shape
{
    //# Fields
    private double width;
    private double height;
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    private MovablePoint topRightCorner = new MovablePoint( x1,  y1);
    private MovablePoint bottomLeftCorner = new MovablePoint(x2,y2);

    //# Constructors
    public Rectangle() {
        this.setHeight(1);
    }

    public Rectangle(double width, double height, MovablePoint topRightCorner, MovablePoint bottomLeftCorner) {
        super();

        this.setWidth(width);
        this.setHeight(height);
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);

        this.setWidth(width);
        this.setHeight(height);
    }


    //# Getter-methods
    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    //# Setter-methods
    protected void setWidth(double value) {
        this.width = value;
    }

    protected void setHeight(double value) {
        this.height = value;
    }


    //# Methods
    @Override
    public double getArea() {
        return this.getWidth()*this.getHeight();
    }

    @Override
    public double getPerimeter() {
        return 2*(this.getWidth() + this.getHeight());
    }

    @Override
    public String toString() {
        return String.format(
                "%s => Rectangle[width=%f; height=%f;]",
                super.toString(), this.getWidth(), this.getWidth()
        );
    }
}
