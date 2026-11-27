package com.GroupA.frontend.network;

/**
 * Design Pattern: Facade
 * Provides a simplified interface for the Frontend (Main / GameHUD) to communicate with
 * the Spring Boot Score Backend, hiding LibGDX HTTP networking (Gdx.net), JSON serialization,
 * request timeouts, and render-thread callback marshaling (Gdx.app.postRunnable).
 */
public class LeaderBoardFacade {

    // =========================================================================
    // CONSTANTS & ATTRIBUTES
    // =========================================================================
    // TODO: Declare BASE_URL constant (e.g., "http://localhost:8080/api") and TIMEOUT_MS (e.g., 3000)
    // TODO: Declare LibGDX Json instance configured for standard JSON output
    //       (OutputType.json, setUsePrototypes(false), setIgnoreUnknownFields(true))
    // TODO: Declare inner payload helper class ScoreSubmission(String playerName, int point) for POST /api/scores

    // =========================================================================
    // CONSTRUCTOR
    // =========================================================================
    // TODO: Implement LeaderBoardFacade() constructor to initialize and configure the Json serializer

    // =========================================================================
    // FACADE PUBLIC API
    // =========================================================================
    // TODO: Implement + checkHealth(Consumer<Boolean> onResult) : void
    //       Send GET /api/health and pass true to onResult if HTTP 200 OK, false otherwise.

    // TODO: Implement + submitScore(String playerName, long points, Consumer<LeaderBoardEntry> onSaved, Consumer<String> onError) : void
    //       Clamp points to Integer range, serialize ScoreSubmission to JSON, send POST /api/scores,
    //       and invoke onSaved with the parsed LeaderBoardEntry on HTTP 201 CREATED (or onError on failure).

    // TODO: Implement + fetchLeaderboard(int limit, Consumer<List<LeaderBoardEntry>> onLoaded, Consumer<String> onError) : void
    //       Send GET /api/scores/leaderboard?limit=N, parse JSON array of LeaderBoardEntry, and pass list to onLoaded.

    // =========================================================================
    // INTERNAL NETWORK & THREADING HELPERS
    // =========================================================================
    // TODO: Implement private HTTP request builder & Gdx.net.sendHttpRequest(...) wrapper
    //       that hops back onto the LibGDX render thread via Gdx.app.postRunnable(...) before invoking UI callbacks.
}
