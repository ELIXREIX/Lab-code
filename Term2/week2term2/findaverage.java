package Term2.week2term2;


public class findaverage {
    public static void main(String[] args) {
        double arr[] = {1,2,3,4,5,6,7,8,9,10};
        double sum = 0;
        for (double i:arr){
            sum += i;
        }
        double average = sum/arr.length;
        System.out.println("Average is: " + average);


}
}
