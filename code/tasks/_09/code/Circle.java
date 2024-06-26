package tasks._09.code;

public class Circle extends Shape implements Movable
{
    //# Fields
    private double radius;
    double x;
    double y;

    private MovablePoint movablePoint = new MovablePoint(x, y);

    //# Constructors
    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        super();

        this.setRadius(radius);
    }

    public Circle(double radius, String color, boolean filled, MovablePoint movablePoint) {
        super(color, filled);

        this.setRadius(radius);
        this.movablePoint = movablePoint;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);

        this.setRadius(radius);
        MovablePoint movablePoint = new MovablePoint(0,0);
        this.x = 0;
        this.y = 0;
    }


    //# Getter-methods
    public double getRadius() {
        return this.radius;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public MovablePoint getMovablePoint() {
        return movablePoint;
    }

    //# Setter-methods
    protected void setRadius(double value) {
        this.radius = value;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setMovablePoint(MovablePoint movablePoint) {
        this.movablePoint = movablePoint;
    }

    //# Methods
    @Override
    public double getArea() {
        return (2*radius)*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.getRadius();
    }

    @Override
    public String toString() {
        /*
        return String.format(
                "%s => Circle[radius=%f;]",
                super.toString(), this.getRadius()
        );
         */
        return "Radius: " + radius + "\n"
        + "Farge: " + getColor() + "\n"
        + "Is a filled shape: " + getFilled() + "\n"
        + "Radius: " + getRadius() + "\n"
        + "Perimiter: " + getPerimeter() + "\n"
        + "Senterpunkt: " + movablePoint.x + ", " + movablePoint.y;
    }

    @Override
    public void moveUp(double distance) {
        this.y +=1;
    }

    @Override
    public void moveDown(double distance) {
        this.y -=1;
    }

    @Override
    public void moveLeft(double distance) {
        this.x -=1;
    }

    @Override
    public void moveRight(double distance) {
        this.x +=1;
    }
}