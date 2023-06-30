package Term2.week3term2;

public class date {
    private int day;
    private int months;
    private int year ;

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonths() {
        return months;
    }
    public void setMonths(int months) {
        this.months = months;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
        public void setdate(int day,int months,int year){
    //if (0<day && day<32) this.day = day ;

    this.day = (0<day && day<32) ? day : 0; //วิธีเขียนอีกแบบ

    //if (0<months && months<13) this.months = months ;
    
    this.months = (0<months && months<13) ? months : 0;

    //if (year >= 1999 && year <= 9999) this.year = year;

    this.year = (year >= 1999 && year <= 9999) ? year : 0;
}
    public String toString(){
     return this.day+"/"+this.months+"/"+this.year;
}
}
