package Factory;

public class GraduateAccount implements BankAccount{
    @Override
    public void deposit() {

    }

    @Override
    public void withdraw() {

    }

    public int applyForLoan(){
        return 0;
    }

    @Override
    public String toString() {
        return "Grad account";
    }
}
