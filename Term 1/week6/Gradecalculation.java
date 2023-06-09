package week6;
import java.util.Scanner; 

public class Gradecalculation { 

    public static void main(String[] args) { 

    Scanner input = new Scanner (System.in); 

    int [] score = new int [5]; // {10,20,30,40,50}; 

    int sum = 0; 

    System.out.println("input score " + score.length + " students"); 
    System.out.print("Enter Scores: ");

        for (int i = 0; i < score.length ; i ++) {  

            score [i] = input.nextInt(); 

        } 
        for (int i = 0; i < score.length ; i ++) {  

            sum = sum+score[i]; 

        }  

    System.out.println("Score of class :" + sum); 
    input.close();
    } 

} 