import java.util.Scanner;
// class TestScore  is connected with Score java.
public class TestScore
        {
public static void main(String[] args) {
        int score1, score2, score3, score4, score5;

        //create scanner for input
        Scanner scanner = new Scanner(System.in);
        //Ask the user for the 5 test scores
        System.out.println("Please enter test score 1");
        score1 = scanner.nextInt();
        System.out.println("Please enter test score 2");
        score2 = scanner.nextInt();
        System.out.println("Please enter test score 3");
        score3 = scanner.nextInt();
        System.out.println("Please enter test score 4");
        score4 = scanner.nextInt();
        System.out.println("Please enter test score 5");
        score5 = scanner.nextInt();
        //Calculate the average score for the tests
        Score TestScore = new Score(score1, score2, score3, score4, score5);
        {
                //Display Average test Score
                System.out.println(TestScore.average());
        }
}
        }
