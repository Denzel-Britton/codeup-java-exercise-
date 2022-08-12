package shapes;

public class Square extends Quadrilateral {

    public Square(int length) {
        super(length, length);
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return  4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}