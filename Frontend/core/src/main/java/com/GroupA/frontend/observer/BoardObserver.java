package com.GroupA.frontend.observer;

/**
 * Design Pattern: Observer (Observer Interface)
 * Implemented by UI/HUD components that listen for changes on MahjongBoard.
 */
public interface BoardObserver {

    // =========================================================================
    // UML INTERFACE METHODS
    // =========================================================================
    // TODO: Declare + onTilesChanged() : void
    //       Called when a pair of tiles is matched/removed or the board tile count changes.

    // TODO: Declare + onBoardShuffled() : void
    //       Called when the remaining tiles on MahjongBoard are shuffled.

    // =========================================================================
    // SCORE SYSTEM EXTENSION
    // =========================================================================
    // TODO: Declare + onScoreChanged(long newScore) : void
    //       Called when the player's score changes (e.g., matching a pair or applying a shuffle penalty).
}
