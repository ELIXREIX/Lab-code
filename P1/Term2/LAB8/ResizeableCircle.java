package P1.Term2.LAB8;

public class ResizeableCircle extends Circle implements Resizeable {

    public ResizeableCircle(double radius) {
        super(radius);
    }
    
    @Override
    public void resize(int percent) {
        super.radius *= percent * 0.01;
    }
}

