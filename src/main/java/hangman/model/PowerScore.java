package hangman.model;

public class PowerScore extends GameScore{
    
    int turno = 1;

    /**
     * Función creada para calcular el score del juego de acuerdo a las
     * condiciones especiales del PowerScore
     * 
     * @pre --> ScoreCalculated = 0
     * @pos --> El juego inicia en 0 puntos.
                * La $i-ésima$ letra correcta se bonifica con $5^i$.
                * Se penaliza con 8 puntos cada letra incorrecta
                * El puntaje mínimo es 0
                * Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es 500.
     * @param --> (int) correctCount, (int) incorrectCount
     * @throws --> ScoreException
     */
    public int calculateScore(int correctCount, int incorrectCount) throws scoreException{
        scoreCalculated = 0;
        incorrect(incorrectCount);
        correct(correctCount);

        //El puntaje mínimo es 0
        if(scoreCalculated < 0){
            throw new scoreException("El scores es invalido, puntaje negativo");
        }
        turno +=1;

        //Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es 500.
        if(scoreCalculated > 500){
            scoreCalculated = 500;
        }

        return scoreCalculated;

    }

    /**
     * Se penaliza con 8 puntos cada letra incorrecta
     * @param incorrectCount
     */
    private void incorrect(int incorrectCount){
        scoreCalculated -= 8*incorrectCount;
    }

    /**
     * La $i-ésima$ letra correcta se bonifica con $5^i$.
     * @param correctCount
     */
    private void correct(int correctCount){
        scoreCalculated += 5^turno;
    }
}
