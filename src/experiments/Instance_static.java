package experiments;

public class Instance_static {

    int x = 10;
    static {
        int x = 20;
        System.out.println("x = "+x);
    }

    public static void main(String[] args) {
        Instance_static o = new Instance_static();
        System.out.println("x in main = "+o.x);
    }
}
