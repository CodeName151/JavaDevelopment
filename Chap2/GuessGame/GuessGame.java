package Chap2.GuessGame;
public class GuessGame {
    //Here are the instance variable of the 3 player using the Player Class as data type
    Player player1;
    Player player2;
    Player player3;
    //Included a counter just in case
    int counter = 0;

    // The actual implementation of the game
    void startGame(){

    //Creating the 3 player objects
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

    //Storing the guesses of the players in variables
        int guess1 = 0;
        int guess2 = 0;
        int guess3 = 0;
    
    //To indent we use boolean variable and make them false as default

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

    //Starting the loop and it is a infinite loop until some code breaks it
    //In other words when the number is guessed it breaks
        while(true){


    //Generating A random number everytime
        int TargetNumber = (int) (Math.random()*10);
        System.out.println("---------I am thinking of a number between 1 and 9 -------- ");
        System.out.println(TargetNumber);

    //Now actually taking the guess from the players by using . operator w.r.t to the player objects
        guess1 = player1.number;
        System.out.println("player1 has guessed " + player1.guess());
        guess2 = player2.number;
        System.out.println("player2 has guessed " + player2.guess());
        guess3 = player3.number;
        System.out.println("player3 has guessed " +  player3.guess());

    //Checking for the target number
        if(guess1 == TargetNumber){
            p1IsRight = true; }
        else if(guess2 == TargetNumber){
            p2IsRight = true;
        }
        else if(guess3 == TargetNumber){
            p3IsRight = true;
        }
    
    //Printing the details on the guesses each time
        System.out.println("-----------------Check------------------");
        System.out.println("DID Player 1 guessed Right? : " + p1IsRight);
        System.out.println("DID Player 2 guessed Right? : " + p2IsRight);
        System.out.println("DID Player 3 guessed Right? : " + p3IsRight);

    //Condition to check when the number is guessed to break the loop
        if(p1IsRight==true || p2IsRight== true || p3IsRight== true){
            break;
        }
        counter++;
        }
    //The just in case we needed the counter lol
        System.out.println("-------------------------------------");
        System.out.println("It took " + counter + " guesses to guess the word");
    }
}
