package com.GroupA.frontend.network;

public class LeaderBoardEntry {
    private String scoreId;
    private String playerName;
    private Integer point;
    private String createdAt;

    public LeaderBoardEntry() {}

    public String getScoreId() { return scoreId; }
    public String getPlayerName() { return playerName != null ? playerName : "Unknown"; }
    public int getPoint() { return point != null ? point : 0; }
    public String getCreatedAt() { return createdAt; }
}
