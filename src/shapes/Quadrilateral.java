package shapes;

public abstract class Quadrilateral implements Measurable {
  // fields
   protected int length;
   protected int width;

// constructor
    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

//// imma need method here  for length  and width


// getters & setters (setters are abstract)

    public  int getLength() {
        return length;
    }

    public  abstract void setLength(int length);

    public int getWidth() {
        return width;
    }

    public abstract void setWidth(int width);




}
