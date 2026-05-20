package OOPS;

public class Super_Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Blog extends Super_Animal {
    public void animalSound() {
        super.animalSound(); // Call the parent method
        System.out.println("The dog says: bow wow");
    }
}

class Goldretreiver extends Blog{
    public void animalSound(){
        super.animalSound();//calls the method in Blog cuz it the once extended or inherited
        System.out.println("Rich bow wow shouting");
    }
}

class Main {
    public static void main(String[] args) {
        Blog myDog = new Blog();
        //myDog.animalSound();

        Goldretreiver gold = new Goldretreiver();
        gold.animalSound();
    }
}

