package hangman.model;

public class BonusScore extends GameScore{
    
    public int calculateScore(int correctCount, int incorrectCount) throws scoreException{
        scoreCalculated = 0;
        if(correctCount>0){
            scoreCalculated += 10*correctCount;
        }
        else if(incorrectCount>0){
            scoreCalculated -= 5*incorrectCount;
        }
        if(scoreCalculated < 0){
            throw new scoreException("El scores es invalido, puntaje negativo");
        }
        return scoreCalculated;
    }
}
