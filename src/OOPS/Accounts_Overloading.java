package OOPS;

public class Accounts_Overloading {

    int id;
    String name;
    Long number;

    Accounts_Overloading(int id , String name, Long number){
        this.id=id;
        this.name=name;
        this.number=number;
    }

    public int update(int id, String name){
        //update name by id
        if(this.id == id) {
        this.name=name;
        System.out.println("name updated by id");
        }
        return 0;
    }

    public void update(int id, String name, Long number){
        //update name by id
        if(this.id == id) {
            this.name = name;
            this.number = number;
            System.out.println("name updated by id");
        }
    }

    public void update(int id, Long number){
        //update number by id
        if(this.id == id) {
            this.number = number;
            System.out.println("number updated  by id");
        }
    }

    @Override
    public String toString() {
        return "Accounts_Overloading{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public static void main(String[] args) {
        Accounts_Overloading Account = new Accounts_Overloading(1,"sorryhari",99699243831L);
        System.out.println(Account.toString());
        Account.update(1,777777777L);
        System.out.println(Account.toString());
        System.out.println("\n\n");
        Accounts_Overloading Account2 = new Accounts_Overloading(2,"sorryhari",992863521197L);
        System.out.println(Account2.toString());
        Account2.update(2,"sorry sory hari kdhau");
        System.out.println(Account2.toString());

    }

}
