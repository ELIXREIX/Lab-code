package P1.Term2.week2term2;


public class findaverage {
    public static void main(String[] args) {
        double arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Average is: " +  calculated(arr));
}
    public static double calculated (double [] arr) {
        double sum = 0;
        for (double i:arr){
            sum += i;
        }
        double average = sum/arr.length;
        return average;
    }
}
