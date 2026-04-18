public class StaticBlock {
        public static void main(String[] args) throws ClassNotFoundException {

            //if we require to envoke the static block without usingthe object creation
            Class.forName("Vegb");

            //envoking through object creation
            Vegb obj = new Vegb();
            obj.name="Carrot";
            obj.wey=30;
            obj.show();

            Vegb obj2 = new Vegb();



        }
    }

    class Vegb{
        String name;
        int wey;
        static String type; // static var

        public void show(){
            System.out.println( name +
                    "{ wey ; " + wey +
                    ", type ; " + type + //static var can be used in non-static method
                    '}');
        }

        public Vegb(){
            System.out.println("I am constructor");
        }

        //static block (executes 1st {even before constructor} regardless of where it is placed)
        static{
            type="nuvu edho theydaga vunnavey😌😌😌";
            System.out.println("I am S.B");
        }
}
