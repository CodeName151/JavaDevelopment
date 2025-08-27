package LearningPhase.Chap3;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog[] dog = new Dog[5];
        int x = 0;
        while (x<dog.length){
            dog[x] = new Dog();


            x+=1;
        }
    }
}
