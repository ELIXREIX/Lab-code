package Term2.week4term2;

public class Date {
    private int days;
    private int months;
    private int years ;

    public int getDay() {
        return days;
    }
    public void setDay(int day) {
        this.days = day;
    }
    public int getMonths() {
        return months;
    }
    public void setMonths(int months) {
        this.months = months;
    }
    public int getYear() {
        return years;
    }
    public void setYear(int year) {
        this.years = year;
    }
        public void setdate(int day,int months,int year){
    //if (0<day && day<32) this.day = day ;

    this.days = (0<day && day<32) ? day : 0; //วิธีเขียนอีกแบบ

    //if (0<months && months<13) this.months = months ;
    
    this.months = (0<months && months<13) ? months : 0;

    //if (year >= 1999 && year <= 9999) this.year = year;

    this.years = (year >= 1999 && year <= 9999) ? year : 0;

    }
    public Date (int thedays,int themonths, int theyears){
        days = thedays;
        months = themonths;
        years = theyears;
        System.out.println(this);
    }
    public String toString (){
        return String.format("%02d/%02d/%02d",days,months,years);
    }
}


