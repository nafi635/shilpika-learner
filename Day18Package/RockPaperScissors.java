package Day18Package;

import java.util.Scanner;

public class RockPaperScissors {

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
        if ((firstPlayer.equals("Rock") && secondPlayer.equals("Rock")) || (firstPlayer.equals("Scissors") && secondPlayer.equals("Scissors")) || (firstPlayer.equals("Paper") && secondPlayer.equals("Paper"))) {
            System.out.println("TIE");
        }
        if ((firstPlayer.equals("Rock") && secondPlayer.equals("Scissors")) || (firstPlayer.equals("Paper") && secondPlayer.equals("Rock")) || (firstPlayer.equals("Scissors") && secondPlayer.equals("Paper"))) {
            System.out.println("First Player wins");
        }
        if ((firstPlayer.equals("Scissors") && secondPlayer.equals("Rock")) || (firstPlayer.equals("Rock") && secondPlayer.equals("Paper")) || (firstPlayer.equals("Paper") && secondPlayer.equals("Scissors"))) {
            System.out.println("Second Player Wins");
        }
    }
}