public class Equilateral extends Triangle{

    public Equilateral(double len){
        super(len);
    }

    public double area(){
        double height = Math.sqrt(getSide()*getSide()-getSide()/2*getSide()/2);
        return getSide()*height/2;
    }

    public double perimeter(){
        return getSide()*3;
    }

    public String toString(){
        return "An equilateral triangle with sides length " + getSide();
    }
}