import java.util.Scanner;

public class HighScoreWins {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {
        System.out.print("Please enter a game score: ");
        String scoreText = scanner.nextLine();

        String[] firstSplit = scoreText.split("\\|");
        String[] teamNames = firstSplit[0].split(":");
        String[] teamScores = firstSplit[1].split(":");
        if (Integer.parseInt(teamScores[0]) > Integer.parseInt(teamScores[1])){
            System.out.println("Winner: " + teamNames[0]);
        }
        else {
            System.out.println("Winner: " + teamNames[1]);
        }
    }
}
