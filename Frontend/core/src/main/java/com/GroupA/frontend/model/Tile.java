package com.GroupA.frontend.model;

/**
 * Design Pattern: Object Pool (Reusable Pooled Object)
 * Represents a single Solitaire Mahjong tile on the 3D layered grid.
 */
public class Tile {

    // =========================================================================
    // UML ATTRIBUTES
    // =========================================================================
    // TODO: Declare - x : int        (grid column / horizontal position)
    // TODO: Declare - y : int        (grid row / vertical position)
    // TODO: Declare - z : int        (layer / stack height, 0 = bottom layer)
    // TODO: Declare - face : String  (tile suit & rank identifier, e.g., "bamboo_1", "dragon_red")
    // TODO: Declare - active : boolean (whether this tile is currently in play on the board)

    // =========================================================================
    // CONSTRUCTORS & GETTERS / SETTERS
    // =========================================================================
    // TODO: Implement constructor(s) and initialization helper for TilePool
    // TODO: Implement getters and setters as needed by MahjongBoard and rendering

    // =========================================================================
    // UML METHODS
    // =========================================================================
    // TODO: Implement + reset()
    //       Reset x, y, z, face, and active back to default/inactive values when returned to TilePool.
}
