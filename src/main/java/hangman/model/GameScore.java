package hangman.model;

public interface GameScore{

    abstract public int calculateScore(int correctCount, int incorrectCount) throws scoreException;
    
}
