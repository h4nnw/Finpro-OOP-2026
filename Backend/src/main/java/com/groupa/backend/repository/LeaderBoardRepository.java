package com.groupa.backend.repository;

/**
 * Spring Data JPA Repository for querying and persisting Score entities.
 */
// TODO: Add @Repository annotation and extend JpaRepository<Score, UUID>
public interface ScoreRepository {

    // =========================================================================
    // QUERY METHODS
    // =========================================================================
    // TODO: Declare findByPointGreaterThan(Integer minValue) : List<Score>
    // TODO: Declare findAllByOrderByCreatedAtDesc() : List<Score>
    // TODO: Declare findTopScores(Pageable pageable) : List<Score>
    //       Annotate with @Query("SELECT s FROM Score s ORDER BY s.point DESC")
}
