package com.GroupA.frontend.observer;

//Observer Design Pattern
public interface BoardObserver {
    public void onTilesChanged();
    public void onBoardShuffled();

    public void onScoreChanged();
}
