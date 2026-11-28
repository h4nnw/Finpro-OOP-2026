package com.groupa.backend.model;

/**
 * JPA Entity representing a saved player score in the "scores" PostgreSQL table.
 * Reference: BannaFarhanAthallah_OOP backend Score model.
 */
// TODO: Add @Entity and @Table(name = "scores") annotations
public class Score {

    // =========================================================================
    // ATTRIBUTES (JPA COLUMNS)
    // =========================================================================
    // TODO: Declare - scoreId : UUID
    //       Annotate with @Id, @GeneratedValue(strategy = GenerationType.UUID), @Column(name = "score_id")
    // TODO: Declare - playerName : String
    //       Annotate with @Column(name = "player_name", nullable = false)
    // TODO: Declare - point : Integer
    //       Annotate with @Column(name = "points", nullable = false)
    // TODO: Declare - createdAt : LocalDateTime
    //       Annotate with @CreationTimestamp and @Column(name = "date_achieved", updatable = false)

    // =========================================================================
    // CONSTRUCTORS & GETTERS / SETTERS
    // =========================================================================
    // TODO: Implement no-arg constructor Score() (required by JPA)
    // TODO: Implement Score(String playerName, Integer point) constructor
    // TODO: Implement getters and setters for scoreId, playerName, point, and createdAt
}
