public class TriangleTest {

    public static void main(String[] args) {
        Triangle [] list = new Triangle[4];

        list[0] = new Right(4.0);
        list[1] = new Right(6.0);
        list[2] = new Equilateral(4.0);
        list[3] = new Equilateral(6.0);

        for (Triangle shape : list){
            System.out.println(shape.toString());
            System.out.println("Area = " + shape.area());
            System.out.println("Perimeter = " + shape.perimeter());
            System.out.println("Ratio = " + shape.ratio());
        }
    }
}