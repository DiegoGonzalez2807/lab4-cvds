package hangman.model;

public class OriginalScore extends GameScore {

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

     private int scoreCalculated = 100;

    public int calculateScore(int correctCount, int incorrectCount) throws scoreException{

        //Excepcion --> contadores de letras menores a 0
        if(correctCount < 0 || incorrectCount <0){
            throw new scoreException("El numero es negativo");
        }

        //Letras incorrectas
        //Se penaliza con 10 puntos con cada letra incorrecta
        scoreCalculated -= 10*incorrectCount;

        //Excepcion --> Score menor a 0
        if(scoreCalculated < 0){
            scoreCalculated = 0;
        }
        return this.scoreCalculated;
    }
}
