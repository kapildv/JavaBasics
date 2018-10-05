package designpatterns.observerpattern;

import java.util.concurrent.Future;

public class ObserverDriver {

    Future<?> futureTask;

    public static void main(String[] args) {
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CurrentScore currentScore = new CurrentScore();

        CricketData cricketData = new CricketData();

        cricketData.subscribe(currentScore);
        cricketData.subscribe(averageScoreDisplay);
        cricketData.setLatestOvers(10.5f);
        cricketData.setLatestWickets(9);

        cricketData.dataChanged();
        cricketData.unsubscribe(currentScore);
        cricketData.unsubscribe(averageScoreDisplay);
        cricketData.dataChanged();
    }
}
