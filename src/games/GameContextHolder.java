package games;

import games.impl.Boxing;
import games.impl.Football;
import games.impl.IceHockey;

import java.util.HashMap;
import java.util.Map;

public class GameContextHolder {

    private static Map<Integer, GameFunctions> gameContext = new HashMap<>();

    public static Map<Integer, GameFunctions> getGameContext() {
        gameContext.put(GameTypes.ICE_HOCKEY.getOrderNumber(), new IceHockey());
        gameContext.put(GameTypes.BOXING.getOrderNumber(), new Boxing());
        gameContext.put(GameTypes.FOOTBALL.getOrderNumber(), new Football());
        return gameContext;
    }
}
