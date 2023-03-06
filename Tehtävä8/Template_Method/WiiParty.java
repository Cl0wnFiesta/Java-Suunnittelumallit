import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WiiParty extends Game {

    private static final int MAP_LENGTH = 50;

    private static final int SPACE_NORMAL = 0;
    private static final int SPACE_BONUS = 1;
    private static final int SPACE_PENALTY = 2;
    private int[] gameMap = new int[MAP_LENGTH];
    private static int[] playerPositions = new int[4];
    private static int[] scores = new int[4];
    private static int winner = 0;
    private boolean gameRunning = true;

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    @Override
    void initializeGame() {

        // initialize the game map

        Arrays.fill(gameMap, SPACE_NORMAL); // set all spaces to normal

        int numBonusSpaces = random.nextInt(5) + 1; // generate 1 to 5 bonus spaces
        int numPenaltySpaces = random.nextInt(5) + 1; // generate 1 to 5 penalty spaces

        for (int i = 0; i < numBonusSpaces; i++) {
            int bonusSpaceIndex = random.nextInt(MAP_LENGTH);
            if (gameMap[bonusSpaceIndex] == SPACE_NORMAL) {
                gameMap[bonusSpaceIndex] = SPACE_BONUS;
            } else {
                i--; // retry if the space is not normal
            }
        }

        for (int i = 0; i < numPenaltySpaces; i++) {
            int penaltySpaceIndex = random.nextInt(MAP_LENGTH);
            if (gameMap[penaltySpaceIndex] == SPACE_NORMAL) {
                gameMap[penaltySpaceIndex] = SPACE_PENALTY;
            } else {
                i--; // retry if the space is not normal
            }
        }

        // initialize the player positions

        Arrays.fill(playerPositions, 0);

    }

    @Override
    void makePlay(int player) {

        // roll the dice

        System.out.println(player + 1 + "'s turn. Press Enter to roll the dice.");
        scanner.nextLine(); // wait for Enter key
        int diceRoll = random.nextInt(6) + 1; // generate 1 to 6

        // move the player

        int newPosition = playerPositions[player] + diceRoll;

        System.out.println(player + 1 + " rolled ");
        System.out.println("Dice roll: " + diceRoll);
        System.out.println(player + 1 + " is now at space " + (newPosition));

        // check the space type and apply the effect

        if (newPosition < MAP_LENGTH) {

            int spaceType = gameMap[newPosition];
            if (spaceType == SPACE_BONUS) {
                System.out.println(player + 1 + " landed on a bonus space and gained 5 space!");
                newPosition = newPosition += 5;
                scores[player] += 5;
                System.out.println(player + 1 + " is now at space " + (newPosition));

            } else if (spaceType == SPACE_PENALTY) {
                System.out.println(player + 1 + " landed on a penalty space and lost 5 space!");
                newPosition = newPosition -= 5;
                if (newPosition < 0) {
                    newPosition = 0;
                }
                scores[player] -= 5;
                System.out.println(player + 1 + " is now at space " + (newPosition));

            }

        }

        if (newPosition >= MAP_LENGTH) {
            System.out.println(player + 1 + " has reached the end of the map!");
            newPosition = MAP_LENGTH - 1; // restrict the position to the end of the map
        }

        playerPositions[player] = newPosition;

        // print the current status

        System.out.println();

        // check the winning condition and end the game if necessary

        if (playerPositions[player] == MAP_LENGTH - 1) {

            // the player has reached the end of the map and won the game

            System.out.println(player + 1 + " has won the game!");
            winner = player;
            gameRunning = false; // end the game
        }
    }

    @Override
    boolean endOfGame() {
        if (gameRunning)
            return false;

        return true;
    }

    @Override
    void printWinner() {
        System.out.println("The game is over! The winner " + (winner + 1) + " has " + scores[winner] + " points.");
    }

}
