package P1.Term2.week8term2;

import java.util.Formatter;

public abstract class Shape {
    
    private String  color   = "red";
    private boolean filled  = true;

    public Shape() {}

    public Shape(String color, boolean filled) {
        this.color  = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color= color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
     
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        try (Formatter formatter = new Formatter(sb)) {
        formatter.format("A Shape with color of %s and %s", color, (filled ? "filled" : "not filled"));
        return sb.toString();
    }
    }
}
