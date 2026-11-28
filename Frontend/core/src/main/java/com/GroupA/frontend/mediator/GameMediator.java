package com.GroupA.frontend.mediator;

/**
 * Design Pattern: Mediator (Mediator Interface)
 * Defines the communication contract used by colleague components (InputHandler, MahjongBoard).
 */
public interface GameMediator {

    // =========================================================================
    // UML INTERFACE METHODS
    // =========================================================================
    // TODO: Declare + notify(sender, event) : void
    //       Receive event notifications from colleague objects and coordinate game actions.
    // woy yg buat ai banget xixixi
    void notify(Object sender, String event);
}
