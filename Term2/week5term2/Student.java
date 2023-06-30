package Term2.week5term2;

public class Student {
    private String program;
    private int year;
    private double fee;
    public  Student(String name, String address, String program, int year, double fee) {
        super();
        this.program = program;
        this.fee=fee;
        this.year=year;
         System.out.println("Invoke Student(String name, String address, String program, int year, double fee)");
    }
    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    
    
    public String toString () {
    return String.format("Student[%s,Progarm=%s,year=%d,fee=%.2f]", super.toString(), program,year,fee);
    }
}


