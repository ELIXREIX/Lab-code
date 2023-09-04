package week3;

public class monthsw {
  
    public static String getMonth(int month) {
        switch (month) {
          case 1:
            return "January";
          case 2:
            return "February";
          case 3:
            return "March";
          case 4:
            return "April";
          case 5:
            return "May";
          case 6:
            return "June";
          case 7:
            return "July";
          case 8:
            return "August";
          case 9:
            return "September";
          case 10:
            return "October";
          case 11:
            return "November";
          case 12:
            return "December";
          default:
            return "Invalid month";
        }
      }
      public static void main(String[] args) {
        System.out.println(getMonth(4));
        System.out.println(getMonth(6));
      }
}
