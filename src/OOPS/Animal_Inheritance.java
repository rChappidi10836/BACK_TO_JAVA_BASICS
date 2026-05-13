package OOPS;

class Animal_Inheritance {
    public String name_type= "universal";

    void sound(){
        System.out.println("Animal Kindom sound");
    }
}


class Dog extends Animal_Inheritance{
    public String name_type= "gene specific";

    void Sound(){
        System.out.println("bHAow BHAQW");
    }

    //only this one over rides names and return types and paramerters has to match exactly
    void sound(){
        super.sound();// calls parent version method
        System.out.println("Bhaow bhaow");
    }
}

class Output{
    public static void main(String[] args) {
        Animal_Inheritance Dog = new Dog();
//        Dog dog = new Animal_Inheritance(); // is not valid
        System.out.println("name_type "+Dog.name_type);

        System.out.println("Shout sound ?");
        Dog.sound();

        //Dog.Sound();// is invalid cuz reference type is of Animal_Inheritance and it is not present
        // as Dog is still reference type of Animal_Inheritance it will only point the methods in it and
        // will only show the child if they are over ridden


        /**
         * 🔹 Overriding rules
         *
         * ✔ Method name must match
         * ✔ Parameters must match exactly
         * ✔ Return type must be same or covariant
         * ✔ Casing must match (Java is case-sensitive)
         *
         *
         *
         * CAN'T OVERRIDE
         *
         *
         * final methods
         * static methods
         * private methods
         * constructors
         *
         *
         *
         *
         * 🧠 MOST IMPORTANT OOP RULES SUMMARY
         * 1. Child IS-A Parent
         * 2. Parent reference → child object ✅
         * 3. Child reference → parent object ❌
         * 4. Reference type controls accessibility
         * 5. Object type controls overridden method execution
         * 6. Overloading → compile time
         * 7. Overriding → runtime
         * 8. Constructors not inherited
         * 9. private not inherited directly
         * 10. Parent constructor runs first
         */

    }
}