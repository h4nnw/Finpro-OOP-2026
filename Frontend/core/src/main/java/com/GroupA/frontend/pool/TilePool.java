package com.GroupA.frontend.pool;

/**
 * Design Pattern: Object Pool
 * Manages reusable Tile instances to avoid repeated object allocation/garbage collection.
 */
public class TilePool {

    // =========================================================================
    // ATTRIBUTES
    // =========================================================================
    // TODO: Declare a collection/queue of inactive Tile objects available for reuse

    // =========================================================================
    // UML METHODS
    // =========================================================================
    // TODO: Implement + obtain(x, y, z, face) : Tile
    //       Reuse an available Tile from the pool (or instantiate a new Tile if the pool is empty),
    //       configure its (x, y, z, face) and set active = true, then return it.

    // TODO: Implement + free(tile) : void
    //       Call tile.reset() on the matched/removed Tile and return it to the pool collection.
}
