package games;

import games.impl.Boxing;
import games.impl.Football;
import games.impl.IceHockey;

public enum GameTypes {
    ICE_HOCKEY(0, IceHockey.class.getSimpleName(), new IceHockey()),
    FOOTBALL(1, Football.class.getSimpleName(), new Football()),
    BOXING(2, Boxing.class.getSimpleName(), new Boxing());

    private final String gameName;
    private final Integer orderNumber;
    private final GameFunctions game;

    GameTypes(Integer orderNumber, String gameName, GameFunctions game) {
        this.gameName = gameName;
        this.orderNumber = orderNumber;
        this.game = game;
    }

    public GameFunctions getGame() {
        return this.game;
    }

    public String getGameName() {
        return gameName;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public static GameTypes findGameTypeByNum(Integer num) {
        for (GameTypes gameType : GameTypes.values()) {
            if (gameType.getOrderNumber().equals(num)) {
                return gameType;
            }
        }
        return null;
    }
}
