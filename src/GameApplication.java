import games.GameContextHolder;
import games.GameTypes;

import java.util.Scanner;

public class GameApplication {

    public static void main(String[] args) {
        printIntroduction();
        int gameNumber = getUserInput();
        runMenuWithEnum(gameNumber);
        runMenuWithMap(gameNumber);
    }

    private static void printIntroduction(){
        System.out.println("Please enter the desired game number");
        for(GameTypes gameTypes : GameTypes.values()){
            System.out.println("Game number: [" + gameTypes.getOrderNumber() + "] game: '" + gameTypes.getGameName() + "'");
        }
    }

    private static int getUserInput(){
        System.out.print("You chose: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private static void runMenuWithEnum(int gameNumber) {
        GameTypes.findGameTypeByNum(gameNumber).getGame().gameStart();
    }

    private static void runMenuWithMap(int gameNumber) {
        GameContextHolder.getGameContext().get(gameNumber).gameStart();
    }

}
