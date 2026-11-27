package com.groupa.backend.service;

/**
 * Service layer handling business logic for saving, querying, and ranking Mahjong scores.
 */
// TODO: Add @Service annotation
public class ScoreService {

    // =========================================================================
    // DEPENDENCIES
    // =========================================================================
    // TODO: Inject ScoreRepository (via constructor injection or @Autowired)

    // =========================================================================
    // SERVICE METHODS
    // =========================================================================
    // TODO: Implement + createScore(Score score) : Score
    // TODO: Implement + getScoreByID(UUID scoreId) : Optional<Score>
    // TODO: Implement + getAllScores() : List<Score>
    // TODO: Implement + getRecentScores() : List<Score>
    // TODO: Implement + getScoreAboveValue(Integer minValue) : List<Score>
    // TODO: Implement + getLeaderboard(Integer limit) : List<Score>
    //       Use PageRequest.of(0, limit) with scoreRepository.findTopScores(...)
    // TODO: Implement + deleteScore(UUID scoreId) : void
}
