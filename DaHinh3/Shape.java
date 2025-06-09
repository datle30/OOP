import java.awt.*;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    protected int x, y; //Toa do x y
    protected Color colorshape; //mau cua hinh
    protected int velocityX, velocityY; //Toc do di chuyen theo truc x y


    /**
     * Shape.
     */
    public Shape() {}

    /**
     * Shape().
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Shape(chuyen dong).
     */
    public Shape(int x, int y, Color colorshape, int velocityX, int velocityY) {
        this.x = x;
        this.y = y;
        this.colorshape = colorshape;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    /**
     * Getter and Setter.
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColorshape() {
        return colorshape;
    }

    public void setColorshape(Color colorshape) {
        this.colorshape = colorshape;
    }

    public int getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(int velocityX) {
        this.velocityX = velocityX;
    }

    public int getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(int velocityY) {
        this.velocityY = velocityY;
    }

    /**
     * getArea.
     */
    public abstract double getArea();

    /**
     * getPerimeter.
     */
    public abstract double getPerimeter();

    /**
     * move.
     */
    public abstract void move();

    /**
     * draw.
     */
    public abstract void draw(Graphics g);

    /**
     * toString.
     */
    public String toString() {
        return "Shape[color=" + this.color + ",filled=" + this.filled + "]";
    }
}
