public class Parallelogram extends Trapezoid{

    //constructor to use the corners' locations on the cartesian system
    public Parallelogram(double x1, double y1, double x2, double y2,
                         double x3, double y3, double x4, double y4)
    {
        super (x1, y1, x2, y2, x3, y3, x4, y4);
    }

    //To calculate the area of the parallelogram's area we have to know width and height of the parallelogram's width
    //and height so;

    public double getWidth() //We will do the width calculation first time. So, we can not use this algorithm from the inheritance.
    {
        if (getC1().getY() == getC2().getY()) //If these points are in the same y line we can calculate
            return Math.abs(getC1().getX() - getC2().getX());
        else
            return Math.abs(getC2().getX() - getC3().getX());
    }

    //If we want to use the formula of the distance between two point we can write like that:
    // This is the formula of the distance between two points:
    // d(P, Q) = p(x2 − x1)^2 + (y2 − y1)^2
    // width = Math.sqrt(Math.pow((getC2().getX()-getC1().getX()),2) //c1 and the c2 are the bottom corners of the rectangle
    //        + Math.pow((getC2().getY()-getC1().getY()),2));

    @Override
    public double getArea()
    {
        return getWidth()*getHeight();
    }

    public String toString()
    {
        return String.format("\n%s:\n%s%s: %s\n%s: %s\n%s: %s\n",
                "Coordinates of Parallelogram are", getCoordinates(),
                "Width is", this.getWidth(), "Height is", getHeight(), "Area is", getArea());
    }
    //We can use the getCoordinates getHeight and due to inheritance.
}
