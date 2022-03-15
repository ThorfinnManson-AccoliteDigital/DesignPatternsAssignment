package Decorator;

public class Tofu extends SushiTopping{
    public Tofu(SushiBowlInterface bowl){
        super(bowl);
    }

    @Override
    public float addPrice() {
        return super.addPrice() + 1.5f;
    }

    @Override
    public String addName() {
        return super.addName() + "\n\t + Tofu";
    }
}
