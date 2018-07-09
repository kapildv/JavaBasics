package designpatterns.observerpattern;

public class ObserverDriver {

    public static void main(String[] args) {
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CurrentScore currentScore = new CurrentScore();

        CricketData cricketData = new CricketData();

        cricketData.subscribe(currentScore);
        cricketData.subscribe(averageScoreDisplay);

        cricketData.dataChanged();
        cricketData.unsubscribe(currentScore);
        cricketData.unsubscribe(averageScoreDisplay);
        cricketData.dataChanged();
    }
}
