package Factory;

public class FactoryTester {
    public static void main(String[] args) {
        AccountFactory factory = new AccountFactory();
        BankAccount myAcc = factory.create("Student");
        System.out.println(myAcc.toString());
    }


}
