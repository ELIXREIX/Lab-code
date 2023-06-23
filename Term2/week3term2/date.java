package Term2.week3term2;

public class date {
    public int day;
    public int months;
    public int year ;
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

class datetest {
    public static void main(String[] args) {
        date today = new date();
        today.setdate(12, 4, 2017);
        System.out.println(today);
        date newday = new date();
        newday.setdate(50, 17, 15201);
        System.out.println(newday);
    }

}