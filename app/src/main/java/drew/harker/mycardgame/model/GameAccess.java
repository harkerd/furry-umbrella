package drew.harker.mycardgame.model;

import drew.harker.mycardgame.controller.GameController;

public class GameAccess
{
    private static GameController controller;
    private static Game currentGame;

    public static void setGameInView(Game game)
    {
        currentGame = game;
        controller = new GameController(currentGame);
    }

    public static GameController getController()
    {
        return controller;
    }

    public static Game getCurrentGame()
    {
        return currentGame;
    }
}
