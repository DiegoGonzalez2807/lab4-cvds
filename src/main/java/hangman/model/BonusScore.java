package hangman.model;

public class BonusScore extends GameScore{
    
    /**
     * Función creada para calcular el score del juego de acuerdo a las
     * condiciones especiales del BonusScore
     * 
     * @pre --> ScoreCalculated = 0
     * @pos --> El juego inicia en 0 puntos.
                * Se bonifica con 10 puntos cada letra correcta
                * Se penaliza con 5 puntos cada letra incorrecta
                * El puntaje mínimo es 0
     * @param --> (int) correctCount, (int) incorrectCount
     * @throws --> ScoreException
     */
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
