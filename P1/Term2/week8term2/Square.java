package P1.Term2.week8term2;

public class Square extends Rectangle {

    private double side;
    
    public Square() {
   
    }

    public Square(double side) {
      
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {

        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side=" + side + ", which is a " + super.toString();
    }
}
