public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1111111,"John", "Canon");
        Person p2 = new Person(2222222,"Mary", "Canon");
        BankAccount ba1 = new BankAccount(p1, 2, 500);
        BankAccount ba2 = new BankAccount(p2, 1, 600);

        ba1.addAccountOwner(2222222,"Sudan", "leng");
        ba1.deposit(1000);
        ba1.transfer(ba2, 100);
        System.out.println(ba1);
        System.out.println(ba2);
    }
}