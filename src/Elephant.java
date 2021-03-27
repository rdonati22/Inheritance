public class Elephant extends Herbivore{

    private double length;

    public Elephant(String n, double l){
        super("elephant", n);
        length = l;
    }

    public String toString(){
        return super.toString() + " with tusks " + length + " meters long";
    }
}
