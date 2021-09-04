package hangman.model;

public class OriginalScore implements GameScore {

    private int scoreCalculated = 100;
    /**
     * Función creada para calcular el score del juego de acuerdo a las
     * condiciones especiales del OriginalScore
     * 
     * @pre --> ScoreCalculated = 100
     * @pos --> El juego inicia en 100 puntos.
                * No se bonifican las letras correctas.
                * Se penaliza con 10 puntos cada letra incorrecta
                * El puntaje mínimo es 0
     * @param --> (int) correctCount, (int) incorrectCount
     * @throws --> ScoreException
     */

    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws scoreException{

        //Excepcion --> contadores de letras menores a 0
        if(correctCount < 0 || incorrectCount <0){
            throw new scoreException("El numero es negativo");
        }

        //Si la resta de la penalizacion en el score es mayor a 0, se descuenta
        //de lo contrario se deja como puntaje minimo 0
        if(scoreCalculated - 10*incorrectCount >= 0){
            scoreCalculated = scoreCalculated -= 10*incorrectCount;
        }
        else{
            scoreCalculated = 0;
        }
        return this.scoreCalculated;
    }
    
}
