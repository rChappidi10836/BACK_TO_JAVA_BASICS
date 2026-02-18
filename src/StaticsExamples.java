public class StaticsExamples {
    public static void main(String[] args){
        Veg obj = new Veg(); /*obj is just reference var to object created
        it is not the object*/
        obj.name="Carrot";
        obj.wey=30;
        /*obj.type= "natural"; //works but not prefered;
        obj.show();*/
        Veg.type= "Hybree                                 d";
        obj.show();

        Veg obj2 = new Veg();
        obj2.name="Goa";
        obj2.wey=35;
        obj2.show();// here as static variable is common for every object we don't require to assign
        // unless it has to cchanged like below(avunu spelling mistake rasa ayithey entii🫴🏻🫴🏻🫴🏻
        Veg.type ="nathurey";
        obj.show();
        obj2.show();

        /*now static method */
        System.out.println("\n -----------------From here static method--------------------- \n");
        Veg.sshow();
        Veg.sshow(obj2);

    }
}

class Veg{
    String name;
    int wey;
    static String type; // static var

    public void show(){
        System.out.println( name +
                "{ wey ; " + wey +
                ", type ; " + type + //static var can be used in non-static method
                '}');
    }

    public static void sshow(){
        /*System.out.println( name +
                "{ wey ; " + wey +
                ", type ; " + type + //static var can be used in non-static method
                '}');*/
        System.out.println("Only static var type can be accessed directly : "+type);
    }

    /*Only static var type can be accessed directly
    AS sstatic's will be out of heap where objectss are stored
    they don't know which instace variables of which obj to access
    only way to solve it if required,
    SOL: Pass the object reference.
     */
    public static void sshow(Veg o){
        System.out.println( o.name +
                "{ wey ; " + o.wey +
                ", type ; " + type + //static var can be used in non-static method
                '}');
    }

}