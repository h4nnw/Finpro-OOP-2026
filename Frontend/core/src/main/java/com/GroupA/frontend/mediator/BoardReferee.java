package com.GroupA.frontend.mediator;

/**
 * Design Pattern: Mediator (Concrete Mediator)
 * Coordinates interactions between InputHandler, MahjongBoard, and TilePool.
 */
public class BoardReferee implements GameMediator {

    // =========================================================================
    // UML ATTRIBUTES
    // =========================================================================
    // TODO: Declare - board : MahjongBoard
    // TODO: Declare - tilePool : TilePool
    // TODO: Declare - inputHandler : InputHandler
    // TODO: Declare any referee state needed for gameplay (e.g., currently selected first Tile,
    //       game-over / board-cleared flags for Main to trigger ScoreboardFacade submission)

    // =========================================================================
    // CONSTRUCTOR
    // =========================================================================
    // TODO: Implement constructor to wire MahjongBoard, TilePool, and InputHandler with this mediator

    // =========================================================================
    // UML METHODS (from GameMediator)
    // =========================================================================
    // TODO: Implement + notify(sender, event) : void
    //       Handle events from InputHandler (e.g., tile click -> check board.isTileFree, select/deselect,
    //       or call board.tryMatch and tilePool.free on matched tiles; shuffle click -> call board.shuffleRemaining)
    //       and events from MahjongBoard (e.g., board cleared / no-more-moves end-of-run checks).
}
