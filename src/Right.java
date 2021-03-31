public class Right extends Triangle{

    public Right (double len){
        super(len);
    }

    public double area(){
        return getSide()*getSide()/2;
    }

    public double perimeter(){
        return getSide()*2 + getSide()*Math.sqrt(2);
    }

    public String toString(){
        return "A right triangle with legs length " + getSide();
    }
}