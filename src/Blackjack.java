import java.util.Scanner;

public class Blackjack {
    //Declaring variables and creating a scanner object
    static boolean gameContinue = true;
    static String yesNo;

    //The game itself calling on methods
    public static void main(String[] args) {
        System.out.println("*----------------------*");
        System.out.println("* WELCOME TO BLACKJACK *");
        System.out.println("*     DICE EDITION     *");
        System.out.println("*    YOU VS MACHINE!   *");
        System.out.println("*----------------------*");
        play();
        playAgain();
    }

    //Method with the game loop that decides the turn and checks if the game continues or not
    public static void play() {
        Scanner scanner = new Scanner(System.in);
        while (gameContinue) {
            System.out.println("Would you like to roll the dice? type y for 'yes' or n for 'no' and press ENTER!");
            yesNo = scanner.nextLine();
            if (yesNo.equals("y")) Turn.userThrow();
            if (yesNo.equals("n")) Turn.machineThrow();
        }
    }

    //Method that attempts re-playability
    public static void playAgain() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (!gameContinue) {
            System.out.println("*---------------------------------------*");
            System.out.println("*               OPTION MENU             *");
            System.out.println("*   Play again: type 1 and press ENTER  *");
            System.out.println("*    Quit game: type 2 and press ENTER  *");
            System.out.println("*---------------------------------------*");
            Turn.userScore = 0;
            Turn.machineScore = 0;
            gameContinue = true;
            choice = scanner.nextInt();
            if (choice == 1) {
                play();
            } else {
                break;
            }
        }
        System.out.println("Goodbye! Thanks for playing!");
    }
}