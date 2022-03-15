package Factory;

public class AccountFactory implements Factory<BankAccount>{
    @Override
    public BankAccount create(String type) {
        switch (type){
            case "Student":
                return new StudentAccount();
            case "Graduate":
                return new GraduateAccount();
            default:
                return null;
        }
    }
}
