package hangman.model;

public class BonusScore implements GameScore{

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
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws scoreException{

        //Error en caso que los contadores de letras sean negativos
        if(correctCount < 0 || incorrectCount < 0){
            throw new scoreException("El numero es negativo");
        }

        //Si la bonificacion de correctos menos la penalizacion de incorrectas es mayor a 0, actualice el score
        //de lo contrario deje como puntaje minimo 0
        if((scoreCalculated + 10*correctCount) - 5*incorrectCount >= 0){
            scoreCalculated = (scoreCalculated + 10*correctCount) - 5*incorrectCount;
        }
        else{
            scoreCalculated = 0;
        }
        return this.scoreCalculated;
    }
}
