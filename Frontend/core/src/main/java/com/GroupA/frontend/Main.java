package com.GroupA.frontend;

import com.badlogic.gdx.ApplicationAdapter;

/**
 * Main LibGDX Application entry point (corresponds to MahjongGame in the UML diagram).
 * Launched by Lwjgl3Launcher.
 */
public class Main extends ApplicationAdapter {

    // =========================================================================
    // ATTRIBUTES
    // =========================================================================
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

    // TODO: Override + render() : void
    //       Clear the screen and render the MahjongBoard layers and GameHUD each frame.

    // TODO: Override + dispose() : void
    //       Dispose SpriteBatch/Stage and AssetManager resources on exit.
}
