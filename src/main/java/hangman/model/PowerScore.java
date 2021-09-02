package hangman.model;

public class PowerScore extends GameScore{
    
    int turno = 1;

    public int calculateScore(int correctCount, int incorrectCount) throws scoreException{
        scoreCalculated = 0;
        incorrect(incorrectCount);
        correct(correctCount);
        turno +=1;
        return scoreCalculated;

    }

    private void incorrect(int incorrectCount){
        scoreCalculated -= 8*incorrectCount;
    }

    private void correct(int correctCount){
        scoreCalculated += 5^turno;
    }
}
