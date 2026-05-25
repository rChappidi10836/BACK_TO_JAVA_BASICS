package OOPS;

enum NUM_CONSTS{
    PI(3.14),
    SUCCESS(200),
    FAILURE(500),
    NON_FOUND(404);

    private double code;

    NUM_CONSTS(double code){
        this.code=code;
    }

    double getCode(){
        return code;
    }

}

public class Enum_Numeric {

    public static void main(String[] args) {
        NUM_CONSTS myvar = NUM_CONSTS.PI;
        System.out.println(myvar+" = "+myvar.getCode());

        for(NUM_CONSTS var: NUM_CONSTS.values()){
            System.out.println(var+" = "+var.getCode());
        }
    }
}
