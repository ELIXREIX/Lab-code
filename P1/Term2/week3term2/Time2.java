package P1.Term2.week3term2;

public class Time2 {
    private int hour ;
    private int minute ;
    private int second ;
    public void setHour(int hour) {
        this.hour = (hour >=0 && hour < 24) ? hour: 0;
    }
    public void setMinute(int minute) {
        this.minute = (minute >=0 && minute < 60) ? minute: 0;
    }
    public void setSecond(int second) {
        this.second = (second >=0 && second < 60) ? second: 0;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    //Constuctor
    public Time2() {

        //this.hour = 0;
        //this.second = 0;
       //this.minute = 0;
       this(0,0,0);

    }

    public Time2(int h) {

        //setHour(h);
        //this.second = 0;
        //this.minute = 0;
        this(h,0,0);
    }

    public Time2(int h, int s) {

        //setHour(h);
        //setSecond(s);
        //this.minute = 0;
        this(h,0,s);
    }
    public Time2 (int h, int m ,int s){
        setHour(h);//this.hour = h;
        setMinute(m);//this.minute = m;
        setSecond(s);//this.second = s;
    }
    public Time2(Time2 time) {

        this.hour = time.getHour();
        this.second = time.getSecond();
        this.minute = time.getMinute();

    }
    
    public void setTime (int h, int m, int s) {
      //  hour = ((h >=0 && h < 24) ? h: 0);
      //  minute = (( m >= 0 && m < 60) ? m:0);
      //  second = ((s>=0 && s < 60) ? s:0);
      setTime(h,m,s);
    }
    public String toUniversalString(){
    	return String.format("%02d:%02d:%02d", hour,minute,second);
    }
    public String toString () {
    	return String.format("%d:%02d:%02d %s",((hour==0 || hour==12) ? 12 : hour % 12), 
        minute,second,(hour < 12 ? "AM":"PM"));
    }
}




