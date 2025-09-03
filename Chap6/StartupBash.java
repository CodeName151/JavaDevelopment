package Chap6;

import java.util.ArrayList;

public class StartupBash {
    public static void main(String[] args) {
        StartupBash startup = new StartupBash();
        GameHelper helper = new GameHelper();
        int numOfGuesses = 0;
    private  ArrayList<Startup> startups = new ArrayList<Startup>();  
    }

    private void setupGame(){
        Startup one = new Startup();
        one.setName("poniez");
        Startup two = new Startup();
        two.setName("hacqi");
        Startup three = new Startup();
        three.setName("cabista");
        startups.add(one);
        startups.add(two);
        startups.add(three);

        System.out.println("your goal is to simk three startups");
        System.out.println("poniez , hacqi , cabista");
        System.out.println("try to sink them in fewest number of guesses");

        for(Startup startup : startups){
            ArrayList<String> newLocation = helper.placeStartup(3);
            startup.setLocationCells(newLocation);
        }
    }

    public void startPlaying(){

    }

    public void checkUserGuess(){

    }
    public void finishGame(){

    }
    
}
