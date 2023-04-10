public class Point {

    //Variables
    private double x;
    private double y; //These are the locations in the cartesian system

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    //Setters and Getters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    @Override
    public String toString(){
        return "(" + x + "," + y + ")"; //Printing function with Override method
    }
}
