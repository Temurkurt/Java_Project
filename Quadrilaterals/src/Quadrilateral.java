public class Quadrilateral {

    //Variables
    private Point c1;
    private Point c2;
    private Point c3;
    private Point c4; //Due to quadrilaterals' shape we identified four corner

    public Quadrilateral(double x1 ,double y1 ,double x2, double y2,
                         double x3, double y3, double x4, double y4)
    {
        this.c1 = new Point(x1,y1);
        this.c2 = new Point(x2,y2);
        this.c3 = new Point(x3,y3);
        this.c4 = new Point(x4,y4);
    }
    //Getters Setters
    public Point getC1() {
        return c1;
    }

    public void setC1(Point c1) {
        this.c1 = c1;
    }

    public Point getC2() {
        return c2;
    }

    public void setC2(Point c2) {
        this.c2 = c2;
    }

    public Point getC3() {
        return c3;
    }

    public void setC3(Point c3) {
        this.c3 = c3;
    }

    public Point getC4() {
        return c4;
    }

    public void setC4(Point c4) {
        this.c4 = c4;
    }

    public String toString(){
        return String.format("%s:\n%s",
                "Coordinates of Quadrilateral are", getCoordinates());
    }
    public String getCoordinates() {
        return String.format("%s, %s, %s %s\n", c1,c2,c3,c4);
    }
}
