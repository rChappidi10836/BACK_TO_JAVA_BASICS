package OOPS;

public class Super_Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Blog extends Super_Animal { // had to replace dog with blog cuz in same package there can't be 2 classes with same name
    public void animalSound() {
        super.animalSound(); // Call the parent method
        System.out.println("The dog says: bow wow");
    }
    public void proSkinType(){
        System.out.println("Has fur");
    }
}

class Goldretreiver extends Blog{
    public void animalSound(){
        super.animalSound();//calls the method in Blog cuz it the once extended or inherited
        System.out.println("Rich bow wow shouting");
    }
    public void skinType(){
        System.out.println("Skin type of Goldretreiver is ");
        super.proSkinType();
    }

}

class Main {
    public static void main(String[] args) {
        Blog myDog = new Blog();
        myDog.animalSound();

        Goldretreiver gold = new Goldretreiver();
        gold.animalSound();
        gold.skinType();
    }
}

