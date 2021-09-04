package hangman.model;

public class BonusScore extends GameScore{

    private int scoreCalculated = 0;
    
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

        //Error en caso que los contadores de letras sean negativos
        if(correctCount < 0 || incorrectCount < 0){
            throw new scoreException("El numero es negativo");
        }

        //Bonus de letras correctas
        scoreCalculated += 10*correctCount;

        //Bonus de letras incorrectas
        scoreCalculated -= 5*incorrectCount;

        //Puntaje minimo
        if(scoreCalculated < 0){
            scoreCalculated = 0;
        }
        return scoreCalculated;
    }
}
