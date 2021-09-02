package hangman.model;

public class OriginalScore extends GameScore {


    public int calculateScore(int correctCount, int incorrectCount) throws scoreException{
        this.scoreCalculated = 100;

        //Bonificacion de letras correctas
        //NO hay bonificacion por letras correctas
        this.scoreCalculated = this.scoreCalculated * 1;

        //Letras incorrectas
        //Se penaliza con 10 puntos con cada letra incorrecta
        this.scoreCalculated -= 10*incorrectCount;

        //Excepcion --> Score menor a 0
        if(this.scoreCalculated < 0){
            throw new scoreException("El score es invalido, puntaje negativo");
        }
        return this.scoreCalculated;
    }
}
