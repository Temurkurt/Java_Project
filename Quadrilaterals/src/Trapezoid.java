public class Trapezoid extends Quadrilateral{

    private double height;

    //constructor for the trapezoid's corners' location in the cartesian system

    public Trapezoid (double x1, double y1, double x2, double y2,
                      double x3, double y3 , double x4, double y4)
    {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    //Due to formula of the area of Trapezoid which is sum of two parallel sides (bases)/2 times height
    //we have to calculate height and two sides of the trapezoid so;

    public double getHeight()
                              //If we want to use the formula of the distance between two point we can write like that:
                              // This is the formula of the distance between two points:
                              // d(P, Q) = p(x2 − x1)^2 + (y2 − y1)^2
                              //        height = Math.sqrt(Math.pow((getC4().getX()- getC1().getX()),2)
                              //        + Math.pow((getC4().getY()- getC1().getY()),2)); //C4 is the one of the top points, and we applied the distance formula
                                                                                         // between  c4 and the c1
    {
               if (getC1().getY() == getC2().getY())
                   return Math.abs(getC2().getY() - getC3().getY()); // We take the absolute value because the points' order can be mixed.
               else
                   return Math.abs (getC1().getY() - getC2().getY());
    }
    public double getSumOfTwoSides()
    {
        if (getC1().getY() == getC2().getY())
            return Math.abs(getC1().getX() - getC2().getX() ) +
                    Math.abs(getC3().getX() - getC4().getX());
        else
            return Math.abs(getC2().getX() - getC3().getX()) +
                    Math.abs(getC4().getX() - getC1().getX());
    }
    //Now we can calculate the area;

    public double getArea()
    {
        return getSumOfTwoSides()*getHeight() / 2;
    }

    //To string method to print out the trapezoid's location and the area;

    public String toString()
    {
        return String.format("\n%s: \n%s%s: %s\n%s: %s\n", "Coordinates of Trapezoid are", getCoordinates(),
            "Height is", this.getHeight(), "Area is", this.getArea());
    }
}
