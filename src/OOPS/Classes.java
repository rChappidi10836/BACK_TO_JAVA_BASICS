package OOPS;

public class Classes {

    class car{
        String stearing_rotation;

        void driving(){
            System.out.println("turn left then right in life˳");

        }
    }

    public static void main(String[] args) {
        Classes o = new Classes();
        Classes.car bandi = o.new car();
        bandi.driving();

    }


}
