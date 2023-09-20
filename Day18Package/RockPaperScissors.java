package Day18Package;

import java.util.Scanner;

public class RockPaperScissors {
    static String Rock,Paper,Scissors;
    public static void main(String[] args) {
        String firstPlayer, secondPlayer;
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to the Famous Rock Paper Scissors Game");
        System.out.println("Please choose Rock or Paper or Scissors");
        System.out.println("First Player's turn: ");
        firstPlayer = sc.next();
        System.out.println("Second Player's Turn: ");
        secondPlayer = sc.next();
        rockpaperscissors(firstPlayer,secondPlayer);
    }
    public static void rockpaperscissors(String firstPlayer,String secondPlayer) {
        System.out.println("Entered");
        if ((firstPlayer == Rock && secondPlayer == Rock) || (firstPlayer == Scissors && secondPlayer == Scissors) || (firstPlayer == Paper && secondPlayer == Paper)) {
            System.out.println("TIE");
            System.out.println("Executed common");
        }
        System.out.println("Executed common");
        if (firstPlayer == Rock && secondPlayer == Scissors || firstPlayer == Paper && secondPlayer == Rock || firstPlayer == Scissors && secondPlayer == Paper) {
            System.out.println("First Player wins");
            System.out.println("Executed first player winnings");
        }
        System.out.println("Executed first player winnings");
        if (firstPlayer == Scissors && secondPlayer == Rock || firstPlayer == Rock && secondPlayer == Paper || firstPlayer == Paper && secondPlayer == Scissors) {
            System.out.println("Second Player Wins");
            System.out.println("Executed second player winnings");
        }
        System.out.println("Executed second player winnings");
    }
}