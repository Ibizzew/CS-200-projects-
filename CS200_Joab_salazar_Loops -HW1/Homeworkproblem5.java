import java.util.Scanner;

public class Homeworkproblem5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] scores = new double[5];

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter exam score " + (i + 1) + ": ");
            scores[i] = input.nextDouble();
        }

        double sum = 0;
        for (double d : scores) {
            sum += d;
        }

        System.out.println("Average score: " + sum / scores.length);

        input.close();
    }
}