package Term2.week7term2;

public class rectangle extends shape {

    private int width;
    private int length ;

    public rectangle (int width, int length){
        this.width = width ;
        this.length = length ;
    }

    @Override
    double getarea() {
        
        return width*length;
    }

    @Override
    double getperimeters() {
        
        return 2*(width+length);
    }
    public String toString(){
        return this.getClass().getSimpleName()+":"+"\n"
        +"- length: " + length + "\n"
        +"- width: " + width + "\n"
        +"- Area: "+ getarea() + "\n"
        +"- Perimeters: "+ getperimeters();
        
    }
}
