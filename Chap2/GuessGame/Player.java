package Chap2.GuessGame;
public class Player {
    int number;
    //guess() function of an individual player
    int guess(){
        //The code to give a random number as a return value
        int random = (int) (Math.random()*10);
        return random;
    }
}
