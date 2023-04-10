public class Rectangle extends Parallelogram {

    //We defined the rectangle as a subclass of parallelogram. If we don't define rectangle as a subclass of parallelogram
    //we have to rewrite the getWidth function. Now, we can use the getWidth function without any other define.

    public Rectangle (double x1, double y1, double x2, double y2,
                      double x3, double y3, double x4, double y4)
    {
        super(x1,y1,x2,y2,x3,y3,x4,y4);
    }

    public String toString()
    {
        return String.format("\n%s:\n%s%s: %s\n%s: %s\n%s: %s\n","Coordinates of Rectangle are", getCoordinates(),
                "Height is", getHeight(),"Width is", getWidth(), "Area is", getArea() );
    }
}