package experiments;

public class Instance_static {

    static int x = 10;
    static {
        int x = 20; // this is completey new variable and x doesn't change cuz only static var are accessible in static block
        //to access static x use "x=20;"
        System.out.println("x = "+x);
    }

    public static void main(String[] args) {
        Instance_static o = new Instance_static();
        System.out.println("x in main = "+o.x);

        Instance_static o2 = new Instance_static();
        System.out.println("in o2 x = "+o2.x);
    }
}
