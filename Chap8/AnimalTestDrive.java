package Chap8;

public class AnimalTestDrive {

    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Dog();
        animals[1] = new Wolf();
        animals[2] = new Elephant();
        animals[3] = new Lion();
        animals[4] = new Giraffe();


         for(int i = 0 ; i < animals.length ; i++){
            
            System.out.println("Animal No " + (i+1));
            animals[i].eat();
            animals[i].roam();
            System.out.println();
         
         
        }
    
}
}