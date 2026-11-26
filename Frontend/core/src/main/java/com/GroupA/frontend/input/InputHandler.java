package com.GroupA.frontend.input;

/**
 * Design Pattern: Mediator (Colleague)
 * Captures player clicks on tiles and UI controls (such as Shuffle) and notifies GameMediator.
 */
public class InputHandler {

    // =========================================================================
    // UML ATTRIBUTES
    // =========================================================================
    // TODO: Declare - mediator : GameMediator
    // TODO: Declare any input state needed (e.g., clicked tile reference, screen-to-board hit detection)

    // =========================================================================
    // CONSTRUCTORS & LIBGDX INPUT WIRING
    // =========================================================================
    // TODO: Implement constructor / setter for GameMediator and hook into LibGDX input processing

    // =========================================================================
    // UML METHODS
    // =========================================================================
    // TODO: Implement + onTileClick(tile) : void
    //       Triggered when the player clicks a Tile; forward the interaction to mediator.notify(...).

    // TODO: Implement + onShuffleClick() : void
    //       Triggered when the player clicks the Shuffle button; forward the event to mediator.notify(...).
}
