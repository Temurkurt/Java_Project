public class QuadrilateralTest {
    public static void main(String args[])
    {//We will define the points
        Quadrilateral quadrilateral =
                new Quadrilateral(1,5,6,8,3,4,7,8);
        Trapezoid trapezoid =
                new Trapezoid(1,1,6,1,4,4,2,4);
        Parallelogram parallelogram =
                new Parallelogram(0,6,5,6,7,10,2,10);
        Rectangle rectangle =
                new Rectangle(0,0,0,10,10,10,0,10);
        Square square =
                new Square(2,5,2,7,4,7,2,7);

        System.out.printf("%s %s %s %s %s\n", quadrilateral,trapezoid,parallelogram,rectangle,square);
    }
}
