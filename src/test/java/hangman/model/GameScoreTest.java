package hangman.model;

import org.junit.Assert;
import org.junit.Test;



public class GameScoreTest{


    private GameScore original = new OriginalScore();

    private GameScore power = new PowerScore();

    private GameScore bonus = new BonusScore();


    //****************************************** PRUEBAS OriginalScore()

    /**
     * Clase de equivalencia --> Rango válido para que pueda funcionar el método
     * @throws scoreException
     */
    @Test
    public void shouldBeOriginalScore() throws scoreException{
        //Penalización de 10 puntos cada respuesta incorrecta
         Assert.assertEquals(original.calculateScore(5,5), 50); 
    }

    /**
     * Prueba generada a partir de la precondición de que los contadores de
     * letras correctas e incorrectas no pueden ser menores a 0
     */
    @Test
    public void shouldThrowInvalidCounts(){
        try{
            original.calculateScore(-5, -8);
        } catch(scoreException e){
            Assert.assertTrue( true );
        }
    } 

    /**
     * Prueba generada para revisar que en caso que la cantidad de puntos por
     * letra erronea a restar sea menor a todo el puntaje, entonces se deja
     * el puntaje minimo
     * @throws scoreException
     */
    @Test
    public void shouldConfigurateMinimalScore() throws scoreException{
        Assert.assertEquals(original.calculateScore(10,25),0);
    }

    /**
     * Test generado para revisar si teniendo ningun acierto y
     * ninguna letra erronea, se mantiene el score determinado
     * @throws scoreException
     */
    @Test
    public void shouldTakeDefaultScore() throws scoreException{
        Assert.assertEquals(original.calculateScore(0,0), 100);
    }


    //****************************************** PRUEBAS PowerScore()

    /**
     * Prueba generada a partir de la precondición de que los contadores de
     * letras correctas e incorrectas no pueden ser menores a 0
     */
    @Test
    public void shouldThrowInvalidPowerCounts(){
        try{
            power.calculateScore(-5, -8);
        } catch(scoreException e){
            Assert.assertTrue( true );
        }
    } 


    /**
     * Test generado para revisar si teniendo ningun acierto y
     * ninguna letra erronea, se mantiene el score determinado
     * @throws scoreException
     */
    @Test
    public void shouldTakeDefaultPowerScore() throws scoreException{
        Assert.assertEquals(power.calculateScore(0,0), 0);
    }

    /**
     * Prueba generada para revisar que en caso que la cantidad de puntos por
     * letra erronea a restar sea menor a todo el puntaje, entonces se deja
     * el puntaje minimo
     * @throws scoreException
     */
    @Test
    public void shouldConfigurateMinimalPowerScore() throws scoreException{
        Assert.assertEquals(power.calculateScore(0,25),0);
    }

    /**
     * Prueba generada para revisar que en caso de que el puntaje que tengamos
     * sea mayor a 500, entonces este se va a quedar en el valor 500
     * @throws scoreException
     */
    @Test
    public void shouldConfigurateMaximumPowerScore() throws scoreException{
        Assert.assertEquals(power.calculateScore(250,0),500);
    }

    /**
     * Rango válido para que el PowerScore de un resultado distinto
     * de las fronteras [0,500]
     * @throws scoreException
     */
    @Test
    public void shouldBePowerScore() throws scoreException{
        Assert.assertEquals(power.calculateScore(3,5),115);
    }


    //****************************************** PRUEBAS BonusScore

    /**
     * Prueba generada a partir de la precondición de que los contadores de
     * letras correctas e incorrectas no pueden ser menores a 0
     */
    @Test
    public void shouldThrowInvaliBonusCounts(){
        try{
            bonus.calculateScore(-5, -8);
        } catch(scoreException e){
            Assert.assertTrue( true );
        }
    } 

    /**
     * Test generado para revisar si teniendo ningun acierto y
     * ninguna letra erronea, se mantiene el score determinado
     * @throws scoreException
     */
    @Test
    public void shouldTakeDefaultBonusScore() throws scoreException{
        Assert.assertEquals(bonus.calculateScore(0,0), 0);
    }

    /**
     * Prueba generada para revisar que en caso que la cantidad de puntos por
     * letra erronea a restar sea menor a todo el puntaje, entonces se deja
     * el puntaje minimo
     * @throws scoreException
     */
    @Test
    public void shouldConfigurateMinimalBonusScore() throws scoreException{
        Assert.assertEquals(bonus.calculateScore(1,4),0);
    }

    /**
     * Rango válido para que el BonusScore de un resultado distinto
     * de las fronteras 
     * @throws scoreException
     */
    @Test
    public void shouldBeBonusScore() throws scoreException{
        Assert.assertEquals(bonus.calculateScore(5,5),25);
    }
}