package designpatterns.observerpattern;

import designpatterns.observerpattern.interfaces.Observer;

public class AverageScoreDisplay implements Observer {

    private int predictedScore;
    private float runrate;
    private final float totalOvers = 50;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runrate = runs / overs;
        predictedScore = (int) (runrate * totalOvers);
        display();
    }

    private void display() {
        System.out.println("\nAverage Score Display: \n"
                + "Run Rate: " + runrate +
                "\nPredictedScore: " +
                predictedScore);
    }
}
