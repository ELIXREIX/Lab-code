package Term2.week2term2;

public class summm {

public static int sum(int x,int y){
    int sum = 0;
    for(int i = x; i < y; i++)
    sum += i;
    return sum;
}
public static void main(String[] args) {
    System.out.println(sum(1, 100));
}
}