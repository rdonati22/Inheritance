public abstract class Triangle {

    private double side;

    public Triangle (double len){
        side = len;
    }

    public double getSide(){
        return side;
    }

    public double ratio(){
        return area()/perimeter();
    }

    public abstract double area();

    public abstract double perimeter();
}