package com.groupa.backend.controller;

/**
 * REST API Controller exposing "/api/scores" endpoints consumed by ScoreboardFacade.
 */
// TODO: Add @RestController, @RequestMapping("/api/scores"), and @CrossOrigin(origins = "*")
public class ScoreController {

    // =========================================================================
    // DEPENDENCIES
    // =========================================================================
    // TODO: Inject ScoreService

    // =========================================================================
    // REST ENDPOINTS (use relative paths under "/api/scores")
    // =========================================================================
    // TODO: POST /api/scores                  -> @PostMapping
    //       Accept @RequestBody Score, save via scoreService.createScore(score), return HTTP 201 CREATED.

    // TODO: GET /api/scores                   -> @GetMapping
    //       Return all scores via scoreService.getAllScores().

    // TODO: GET /api/scores/{scoreId}         -> @GetMapping("/{scoreId}")
    //       Return matching score (200 OK) or 404 NOT_FOUND.

    // TODO: GET /api/scores/leaderboard       -> @GetMapping("/leaderboard")
    //       Accept @RequestParam(defaultValue = "10") Integer limit, return top scores via scoreService.getLeaderboard(limit).

    // TODO: GET /api/scores/above/{minValue}  -> @GetMapping("/above/{minValue}")
    //       Return scores above minValue.

    // TODO: GET /api/scores/recent            -> @GetMapping("/recent")
    //       Return scores ordered by newest creation timestamp.

    // TODO: DELETE /api/scores/{scoreId}      -> @DeleteMapping("/{scoreId}")
    //       Delete score by ID or return 404 NOT_FOUND.
}
