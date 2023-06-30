package Term2.week7term2;



public class circle extends shape {
    
    private int radius ;

    public circle (int radius) {
        this.radius = radius;
    }

    @Override
    double getarea() {
        
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    double getperimeters() {
        
        return 2*Math.PI*radius;
    }
    public String toString(){
        return this.getClass().getSimpleName()+":"+"\n"
        +"- Radius: " + radius + "\n"
        +"- Area: "+ getarea() + "\n"
        +"- Perimeters: "+ getperimeters();
        
    }
}
