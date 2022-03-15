package Factory;

public class StudentAccount implements BankAccount{

    float interestRate= 0f;
    @Override
    public void deposit() {

    }

    @Override
    public void withdraw() {

    }

    @Override
    public String toString() {
        return "Student account";
    }
}
