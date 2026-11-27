package com.GroupA.frontend;

import com.badlogic.gdx.ApplicationAdapter;

/**
 * Main LibGDX Application entry point (corresponds to MahjongGame in the UML diagram).
 * Launched by Lwjgl3Launcher.
 */
public class Main extends ApplicationAdapter {

    // =========================================================================
    // ATTRIBUTES & SCOREBOARD CONSTANTS
    // =========================================================================
    // TODO: Declare player/leaderboard constants & state (e.g., PLAYER_NAME, LEADERBOARD_SIZE = 5,
    //       LeaderBoardFacade scoreboard, boolean scoreSubmitted)
    // TODO: Declare rendering tools (e.g., SpriteBatch / Stage) and core game components
    //       (TilePool, MahjongBoard, InputHandler, BoardReferee, GameHUD)

    // =========================================================================
    // UML / LIBGDX LIFECYCLE METHODS
    // =========================================================================
    // TODO: Override + create() : void
    //       1. Initialize AssetManager singleton via AssetManager.getInstance().init()
    //       2. Instantiate TilePool, MahjongBoard, InputHandler, and GameHUD
    //       3. Register GameHUD as a BoardObserver on MahjongBoard
    //       4. Instantiate BoardReferee (GameMediator) to connect MahjongBoard, TilePool, and InputHandler
    //       5. Instantiate LeaderBoardFacade (Facade connecting Frontend to Backend REST API)

    // TODO: Override + render() : void
    //       1. Handle game restart input (reset board, reset scoreSubmitted = false, call gameHUD.clearScoreboard())
    //       2. Check if the Mahjong run ended (board cleared or no moves left) and call submitScoreOnRunEnd()
    //       3. Clear the screen and render the MahjongBoard layers and GameHUD each frame

    // =========================================================================
    // SCOREBOARD FACADE HELPER
    // =========================================================================
    // TODO: Implement - submitScoreOnRunEnd() : void
    //       Guard with scoreSubmitted so a run's score is only submitted once, then call:
    //       scoreboard.submitScore(PLAYER_NAME, board.getScore(),
    //           saved -> scoreboard.fetchLeaderboard(LEADERBOARD_SIZE, gameHUD::showLeaderboard, gameHUD::setScoreboardStatus),
    //           gameHUD::setScoreboardStatus);

    // TODO: Override + dispose() : void (optional LibGDX cleanup)
    //       Dispose SpriteBatch/Stage, GameHUD, and AssetManager resources on exit.
}
