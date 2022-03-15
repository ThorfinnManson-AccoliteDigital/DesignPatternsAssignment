package Decorator;

public class Edamame extends SushiTopping{
    public Edamame(SushiBowlInterface bowl){
        super(bowl);
    }

    @Override
    public float addPrice() {
        return super.addPrice() + 0.5f;
    }

    @Override
    public String addName() {
        return super.addName() + "\n\t + Edamame";
    }
}
