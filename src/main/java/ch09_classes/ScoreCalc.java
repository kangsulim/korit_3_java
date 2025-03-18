package ch09_classes;

public class ScoreCalc {
    public double addScore(double totalScore, double addedScore) {
        return totalScore + addedScore;
    }

    public double calculateAvg(double totalScore, int numOfSubs) {
        return totalScore / numOfSubs;
    }
}
