package OOPS;
enum ORDER_STATUS{
    BOOKED("user made the transaction and confirmed"),
    WAITING("waiting for the inventory to get the item and send to warehouse"),
    DISPATCHED(" out for deilvery"),
    DELIVERED("reached user");

    private String desc;

    ORDER_STATUS(String desc){
        this.desc=desc;
    }

    public String getDesc() {
        return desc;
    }
}
public class Enum_Test {
    public static void main(String[] args) {
        ORDER_STATUS myvar = ORDER_STATUS.DISPATCHED;
        System.out.println(myvar+" : "+myvar.getDesc()+"\n");

        for (ORDER_STATUS i: ORDER_STATUS.values()){
            System.out.println(i+" : "+i.getDesc());
        }
    }
}
