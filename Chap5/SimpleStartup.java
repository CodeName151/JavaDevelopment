package Chap5;

public class SimpleStartup {
    int[] locationCells;
    int numOfHits;
    

    String checkYourself(int userGuess){
        String result = "miss";
        for(int cell : locationCells){
            
            
            if(userGuess == cell){
                numOfHits = numOfHits+1;
                
                result = "hit";
                 
                break;
            }
        }
                if(numOfHits == locationCells.length){
                    result = "kill";
                }
            
           
            System.out.println(result);
            System.out.println("Num of Hits : " + numOfHits);
               return result;
               
            }
           
     

        
    


    void setLocation(int[] locationCells){
        this.locationCells = locationCells;

    }
    
}
